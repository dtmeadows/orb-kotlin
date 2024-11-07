// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.errors.OrbError
import com.withorb.api.models.EventDeprecateParams
import com.withorb.api.models.EventDeprecateResponse
import com.withorb.api.models.EventIngestParams
import com.withorb.api.models.EventIngestResponse
import com.withorb.api.models.EventSearchParams
import com.withorb.api.models.EventSearchResponse
import com.withorb.api.models.EventUpdateParams
import com.withorb.api.models.EventUpdateResponse
import com.withorb.api.services.async.events.BackfillServiceAsync
import com.withorb.api.services.async.events.BackfillServiceAsyncImpl
import com.withorb.api.services.async.events.VolumeServiceAsync
import com.withorb.api.services.async.events.VolumeServiceAsyncImpl

class EventServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : EventServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val backfills: BackfillServiceAsync by lazy { BackfillServiceAsyncImpl(clientOptions) }

    private val volume: VolumeServiceAsync by lazy { VolumeServiceAsyncImpl(clientOptions) }

    override fun backfills(): BackfillServiceAsync = backfills

    override fun volume(): VolumeServiceAsync = volume

    private val updateHandler: Handler<EventUpdateResponse> =
        jsonHandler<EventUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to amend a single usage event with a given `event_id`. `event_id`
     * refers to the `idempotency_key` passed in during ingestion. The event will maintain its
     * existing `event_id` after the amendment.
     *
     * This endpoint will mark the existing event as ignored, and Orb will only use the new event
     * passed in the body of this request as the source of truth for that `event_id`. Note that a
     * single event can be amended any number of times, so the same event can be overwritten in
     * subsequent calls to this endpoint. Only a single event with a given `event_id` will be
     * considered the source of truth at any given time.
     *
     * This is a powerful and audit-safe mechanism to retroactively update a single event in cases
     * where you need to:
     * - update an event with new metadata as you iterate on your pricing model
     * - update an event based on the result of an external API call (e.g. call to a payment gateway
     *   succeeded or failed)
     *
     * This amendment API is always audit-safe. The process will still retain the original event,
     * though it will be ignored for billing calculations. For auditing and data fidelity purposes,
     * Orb never overwrites or permanently deletes ingested usage data.
     *
     * ## Request validation
     * - The `timestamp` of the new event must match the `timestamp` of the existing event already
     *   ingested. As with ingestion, all timestamps must be sent in ISO8601 format with UTC
     *   timezone offset.
     * - The `customer_id` or `external_customer_id` of the new event must match the `customer_id`
     *   or `external_customer_id` of the existing event already ingested. Exactly one of
     *   `customer_id` and `external_customer_id` should be specified, and similar to ingestion, the
     *   ID must identify a Customer resource within Orb. Unlike ingestion, for event amendment, we
     *   strictly enforce that the Customer must be in the Orb system, even during the initial
     *   integration period. We do not allow updating the `Customer` an event is associated with.
     * - Orb does not accept an `idempotency_key` with the event in this endpoint, since this
     *   request is by design idempotent. On retryable errors, you should retry the request and
     *   assume the amendment operation has not succeeded until receipt of a 2xx.
     * - The event's `timestamp` must fall within the customer's current subscription's billing
     *   period, or within the grace period of the customer's current subscription's previous
     *   billing period.
     * - By default, no more than 100 events can be amended for a single customer in a 100 day
     *   period. For higher volume updates, consider using the [event backfill](create-backfill)
     *   endpoint.
     */
    override suspend fun update(
        params: EventUpdateParams,
        requestOptions: RequestOptions
    ): EventUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("events", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val deprecateHandler: Handler<EventDeprecateResponse> =
        jsonHandler<EventDeprecateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to deprecate a single usage event with a given `event_id`. `event_id`
     * refers to the `idempotency_key` passed in during ingestion.
     *
     * This endpoint will mark the existing event as ignored. Note that if you attempt to re-ingest
     * an event with the same `event_id` as a deprecated event, Orb will return an error.
     *
     * This is a powerful and audit-safe mechanism to retroactively deprecate a single event in
     * cases where you need to:
     * - no longer bill for an event that was improperly reported
     * - no longer bill for an event based on the result of an external API call (e.g. call to a
     *   payment gateway failed and the user should not be billed)
     *
     * If you want to only change specific properties of an event, but keep the event as part of the
     * billing calculation, use the [Amend single event](amend-event) endpoint instead.
     *
     * This API is always audit-safe. The process will still retain the deprecated event, though it
     * will be ignored for billing calculations. For auditing and data fidelity purposes, Orb never
     * overwrites or permanently deletes ingested usage data.
     *
     * ## Request validation
     * - Orb does not accept an `idempotency_key` with the event in this endpoint, since this
     *   request is by design idempotent. On retryable errors, you should retry the request and
     *   assume the deprecation operation has not succeeded until receipt of a 2xx.
     * - The event's `timestamp` must fall within the customer's current subscription's billing
     *   period, or within the grace period of the customer's current subscription's previous
     *   billing period. Orb does not allow deprecating events for billing periods that have already
     *   invoiced customers.
     * - The `customer_id` or the `external_customer_id` of the original event ingestion request
     *   must identify a Customer resource within Orb, even if this event was ingested during the
     *   initial integration period. We do not allow deprecating events for customers not in the Orb
     *   system.
     * - By default, no more than 100 events can be deprecated for a single customer in a 100 day
     *   period. For higher volume updates, consider using the [event backfill](create-backfill)
     *   endpoint.
     */
    override suspend fun deprecate(
        params: EventDeprecateParams,
        requestOptions: RequestOptions
    ): EventDeprecateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("events", params.getPathParam(0), "deprecate")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { deprecateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val ingestHandler: Handler<EventIngestResponse> =
        jsonHandler<EventIngestResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Orb's event ingestion model and API is designed around two core principles:
     * 1. **Data fidelity**: The accuracy of your billing model depends on a robust foundation of
     *    events. Orb's API protocol encourages usage patterns that ensure that your data is
     *    consistently complete and correct.
     * 2. **Fast integration**: Sending events into Orb requires no tedious setup steps or explicit
     *    field schema for your event shape, making it instant to start streaming in usage in
     *    real-time.
     *
     * ## Event shape
     *
     * Events are the starting point for all usage calculations in the system, and are simple at
     * their core:
     * ```ts
     * {
     *   // customer_id and external_customer_id are used to
     *   // attribute usage to a given Customer. Exactly one of these
     *   // should be specified in a given ingestion event.
     *
     *   // `customer_id` is the Orb generated identifier for the Customer,
     *   // which is returned from the Create customer API call.
     *   customer_id: string,
     *
     *   // external_customer_id is an alternate identifier which is associated
     *   // with a Customer at creation time. This is treated as an alias for
     *   // customer_id, and is usually set to an identifier native to your system.
     *   external_customer_id: string,
     *
     *   // A string name identifying the event, usually a usage
     *   // action. By convention, this should not contain any whitespace.
     *   event_name: string,
     *
     *   // An ISO 8601 format date with no timezone offset.
     *   // This should represent the time that usage occurred
     *   // and is important to attribute usage to a given
     *   // billing period. See the notes below on determining the timestamp.
     *   // e.g. 2020-12-09T16:09:53Z
     *   timestamp: string,
     *
     *   // A unique value, generated by the client, that is
     *   // used to de-duplicate events.
     *   // Exactly one event with a given
     *   // idempotency key will be ingested, which allows for
     *   // safe request retries.
     *   idempotency_key: string
     *
     *   // Optional custom metadata to attach to the event.
     *   // This might include a numeric value used for aggregation,
     *   // or a string/boolean value used for filtering.
     *   // The schema of this dictionary need not be pre-declared, and
     *   // properties can be added at any time.
     *   properties: {
     *     [key: string]?: string | number | boolean,
     *   },
     * }
     * ```
     *
     * ## Required fields
     *
     * Because events streamed to Orb are meant to be as flexible as possible, there are only a few
     * required fields in every event.
     * - We recommend that `idempotency_key` are unique strings that you generated with V4 UUIDs,
     *   but only require that they uniquely identify an event (i.e. don’t collide).
     * - The `timestamp` field in the event body will be used to determine which billable period a
     *   given event falls into. For example, with a monthly billing cycle starting from the first
     *   of December, Orb will calculate metrics based on events that fall into the range `12-01
     *   00:00:00 <= timestamp < 01-01 00:00:00`.
     *
     * ## Logging metadata
     *
     * Orb allows tagging events with metadata using a flexible properties dictionary. Since Orb
     * does not enforce a rigid schema for this field-set, key-value pairs can be added dynamically
     * as your events evolve.
     *
     * This dictionary can be helpful for a wide variety of use cases:
     * - Numeric properties on events like `compute_time_ms` can later be inputs to our flexible
     *   query engine to determine usage.
     * - Logging a region or cluster with each event can help you provide customers more granular
     *   visibility into their usage.
     *
     * We encourage logging this metadata with an eye towards future use cases to ensure full
     * coverage for historical data. The datatype of the value in the properties dictionary is
     * important for metric creation from an event source. Values that you wish to numerically
     * aggregate should be of numeric type in the event.
     *
     * ## Determining event timestamp
     *
     * For cases where usage is being reported in real time as it is occurring, timestamp should
     * correspond to the time that usage occurred.
     *
     * In cases where usage is reported in aggregate for a historical timeframe at a regular
     * interval, we recommend setting the event `timestamp` to the midpoint of the interval. As an
     * example, if you have an hourly reporter that sends data once an hour for the previous hour of
     * usage, setting the `timestamp` to the half-hour mark will ensure that the usage is counted
     * within the correct period.
     *
     * Note that other time-related fields (e.g. time elapsed) can be added to the properties
     * dictionary as necessary.
     *
     * In cases where usage is reported in aggregate for a historical timeframe, the timestamp must
     * be within the grace period set for your account. Events with `timestamp < current_time -
     * grace_period` will not be accepted as a valid event, and will throw validation errors.
     * Enforcing the grace period enables Orb to accurately map usage to the correct billing cycle
     * and ensure that all usage is billed for in the corresponding billing period.
     *
     * In general, Orb does not expect events with future dated timestamps. In cases where the
     * timestamp is at least 24 hours ahead of the current time, the event will not be accepted as a
     * valid event, and will throw validation errors.
     *
     * ## Event validation
     *
     * Orb’s validation ensures that you recognize errors in your events as quickly as possible, and
     * the API provides informative error messages to help you fix problems quickly.
     *
     * We validate the following:
     * - Exactly one of `customer_id` and `external_customer_id` should be specified.
     * - If the `customer_id` is specified, the customer in Orb must exist.
     * - If the `external_customer_id` is specified, the customer in Orb does not need to exist.
     *   Events will be attributed to any future customers with the `external_customer_id` on
     *   subscription creation.
     * - `timestamp` must conform to ISO 8601 and represent a timestamp at most 1 hour in the
     *   future. This timestamp should be sent in UTC timezone (no timezone offset).
     *
     * ## Idempotency and retry semantics
     *
     * Orb's idempotency guarantees allow you to implement safe retry logic in the event of network
     * or machine failures, ensuring data fidelity. Each event in the request payload is associated
     * with an idempotency key, and Orb guarantees that a single idempotency key will be
     * successfully ingested at most once. Note that when Orb encounters events with duplicate
     * idempotency keys and differing event bodies in a batch of events, the entire batch will be
     * rejected.
     * - Successful responses return a 200 HTTP status code. The response contains information about
     *   previously processed events.
     * - Requests that return a `4xx` HTTP status code indicate a payload error and contain at least
     *   one event with a validation failure. An event with a validation failure can be re-sent to
     *   the ingestion endpoint (after the payload is fixed) with the original idempotency key since
     *   that key is not marked as processed.
     * - Requests that return a `5xx` HTTP status code indicate a server-side failure. These
     *   requests should be retried in their entirety.
     *
     * ## API usage and limits
     *
     * The ingestion API is designed made for real-time streaming ingestion and architected for high
     * throughput. Even if events are later deemed unnecessary or filtered out, we encourage you to
     * log them to Orb if they may be relevant to billing calculations in the future.
     *
     * To take advantage of the real-time features of the Orb platform and avoid any chance of
     * dropped events by producers, we recommend reporting events to Orb frequently. Optionally,
     * events can also be briefly aggregated at the source, as this API accepts an array of event
     * bodies.
     *
     * Orb does not currently enforce a hard rate-limit for API usage or a maximum request payload
     * size, but please give us a heads up if you’re changing either of these factors by an order of
     * magnitude from initial setup.
     *
     * ## Testing in debug mode
     *
     * The ingestion API supports a debug mode, which returns additional verbose output to indicate
     * which event idempotency keys were newly ingested or duplicates from previous requests. To
     * enable this mode, mark `debug=true` as a query parameter.
     *
     * If `debug=true` is not specified, the response will only contain `validation_failed`. Orb
     * will still honor the idempotency guarantees set
     * [here](../guides/events-and-metrics/event-ingestion#event-volume-and-concurrency) in all
     * cases.
     *
     * We strongly recommend that you only use debug mode as part of testing your initial Orb
     * integration. Once you're ready to switch to production, disable debug mode to take advantage
     * of improved performance and maximal throughput.
     *
     * #### Example: ingestion response with `debug=true`
     *
     * ```json
     * {
     *   "debug": {
     *     "duplicate": [],
     *     "ingested": ["B7E83HDMfJPAunXW", "SJs5DQJ3TnwSqEZE", "8SivfDsNKwCeAXim"]
     *   },
     *   "validation_failed": []
     * }
     * ```
     *
     * #### Example: ingestion response with `debug=false`
     *
     * ```json
     * {
     *   "validation_failed": []
     * }
     * ```
     */
    override suspend fun ingest(
        params: EventIngestParams,
        requestOptions: RequestOptions
    ): EventIngestResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ingest")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { ingestHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val searchHandler: Handler<EventSearchResponse> =
        jsonHandler<EventSearchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint returns a filtered set of events for an account in a
     * [paginated list format](../reference/pagination).
     *
     * Note that this is a `POST` endpoint rather than a `GET` endpoint because it employs a JSON
     * body for search criteria rather than query parameters, allowing for a more flexible search
     * syntax.
     *
     * Note that a search criteria _must_ be specified. Currently, Orb supports the following
     * criteria:
     * - `event_ids`: This is an explicit array of IDs to filter by. Note that an event's ID is the
     *   `idempotency_key` that was originally used for ingestion.
     *
     * By default, Orb will not throw a `404` if no events matched, Orb will return an empty array
     * for `data` instead.
     */
    override suspend fun search(
        params: EventSearchParams,
        requestOptions: RequestOptions
    ): EventSearchResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("events", "search")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { searchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
