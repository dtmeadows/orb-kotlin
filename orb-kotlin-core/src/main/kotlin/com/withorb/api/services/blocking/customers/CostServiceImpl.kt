// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CustomerCostListByExternalIdParams
import com.withorb.api.models.CustomerCostListByExternalIdResponse
import com.withorb.api.models.CustomerCostListParams
import com.withorb.api.models.CustomerCostListResponse

class CostServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CostService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CustomerCostListResponse> =
        jsonHandler<CustomerCostListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch a day-by-day snapshot of a customer's costs in Orb, calculated
     * by applying pricing information to the underlying usage (see the
     * [subscription usage endpoint](fetch-subscription-usage.api.mdx) to fetch usage per metric, in
     * usage units rather than a currency).
     *
     * This endpoint can be leveraged for internal tooling and to provide a more transparent billing
     * experience for your end users:
     * 1. Understand the cost breakdown per line item historically and in real-time for the current
     *    billing period.
     * 2. Provide customer visibility into how different services are contributing to the overall
     *    invoice with a per-day timeseries (as compared to the
     *    [upcoming invoice](fetch-upcoming-invoice) resource, which represents a snapshot for the
     *    current period).
     * 3. Assess how minimums and discounts affect your customers by teasing apart costs directly as
     *    a result of usage, as opposed to minimums and discounts at the plan and price level.
     * 4. Gain insight into key customer health metrics, such as the percent utilization of the
     *    minimum committed spend.
     *
     * ## Fetching subscriptions
     *
     * By default, this endpoint fetches the currently active subscription for the customer, and
     * returns cost information for the subscription's current billing period, broken down by each
     * participating price. If there are no currently active subscriptions, this will instead
     * default to the most recently active subscription or return an empty series if none are found.
     * For example, if your plan charges for compute hours, job runs, and data syncs, then this
     * endpoint would provide a daily breakdown of your customer's cost for each of those axes.
     *
     * If timeframe bounds are specified, Orb fetches all subscriptions that were active in that
     * timeframe. If two subscriptions overlap on a single day, costs from each price will be
     * summed, and prices for both subscriptions will be included in the breakdown.
     *
     * ## Prepaid plans
     *
     * For plans that include prices which deduct credits rather than accrue in-arrears charges in a
     * billable currency, this endpoint will return the total deduction amount, in credits, for the
     * specified timeframe.
     *
     * ## Cumulative subtotals and totals
     *
     * Since the subtotal and total must factor in any billing-period level discounts and minimums,
     * it's most meaningful to consider costs relative to the start of the subscription's billing
     * period. As a result, by default this endpoint returns cumulative totals since the beginning
     * of the billing period. In particular, the `timeframe_start` of a returned timeframe window is
     * _always_ the beginning of the billing period and `timeframe_end` is incremented one day at a
     * time to build the result.
     *
     * A customer that uses a few API calls a day but has a minimum commitment might exhibit the
     * following pattern for their subtotal and total in the first few days of the month. Here, we
     * assume that each API call is $2.50, the customer's plan has a monthly minimum of $50 for this
     * price, and that the subscription's billing period bounds are aligned to the first of the
     * month:
     *
     * | timeframe_start | timeframe_end | Cumulative usage | Subtotal | Total (incl. commitment) |
     * |-----------------|---------------|------------------|----------|--------------------------|
     * | 2023-02-01      | 2023-02-02    | 9                | $22.50   | $50.00                   |
     * | 2023-02-01      | 2023-02-03    | 19               | $47.50   | $50.00                   |
     * | 2023-02-01      | 2023-02-04    | 20               | $50.00   | $50.00                   |
     * | 2023-02-01      | 2023-02-05    | 28               | $70.00   | $70.00                   |
     * | 2023-02-01      | 2023-02-06    | 36               | $90.00   | $90.00                   |
     *
     * ### Periodic values
     *
     * When the query parameter `view_mode=periodic` is specified, Orb will return an incremental
     * day-by-day view of costs. In this case, there will always be a one-day difference between
     * `timeframe_start` and `timeframe_end` for the timeframes returned. This is a transform on top
     * of the cumulative costs, calculated by taking the difference of each timeframe with the last.
     * Note that in the above example, the `Total` value would be 0 for the second two data points,
     * since the minimum commitment has not yet been hit and each day is not contributing anything
     * to the total cost.
     *
     * ## Timeframe bounds
     *
     * For an active subscription, both timeframes should be specified in the request. If a
     * subscription starts or ends within the timeframe, the response will only include windows
     * where the subscription is active. If a subscription has ended, no timeframe bounds need to be
     * specified and the response will default to the billing period when the subscription was last
     * active.
     *
     * As noted above, `timeframe_start` for a given cumulative datapoint is always the beginning of
     * the billing period, and `timeframe_end` is incremented one day at a time to construct the
     * response. When a timeframe is passed in that is not aligned to the current subscription's
     * billing period, the response will contain cumulative totals from multiple billing periods.
     *
     * Suppose the queried customer has a subscription aligned to the 15th of every month. If this
     * endpoint is queried with the date range `2023-06-01` - `2023-07-01`, the first data point
     * will represent about half a billing period's worth of costs, accounting for accruals from the
     * start of the billing period and inclusive of the first day of the timeframe (`timeframe_start
     * = 2023-05-15 00:00:00`, `timeframe_end = 2023-06-02 00:00:00`)
     *
     * | datapoint index | timeframe_start | timeframe_end |
     * |-----------------|-----------------|---------------|
     * | 0               | 2023-05-15      | 2023-06-02    |
     * | 1               | 2023-05-15      | 2023-06-03    |
     * | 2               | ...             | ...           |
     * | 3               | 2023-05-15      | 2023-06-14    |
     * | 4               | 2023-06-15      | 2023-06-16    |
     * | 5               | 2023-06-15      | 2023-06-17    |
     * | 6               | ...             | ...           |
     * | 7               | 2023-06-15      | 2023-07-01    |
     *
     * You can see this sliced timeframe visualized [here](https://i.imgur.com/TXhYgme.png).
     *
     * ### Matrix prices
     *
     * When a price uses matrix pricing, it's important to view costs grouped by those matrix
     * dimensions. Orb will return `price_groups` with the `grouping_key` and
     * `secondary_grouping_key` based on the matrix price definition, for each `grouping_value` and
     * `secondary_grouping_value` available.
     */
    override fun list(
        params: CustomerCostListParams,
        requestOptions: RequestOptions
    ): CustomerCostListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "costs")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listByExternalIdHandler: Handler<CustomerCostListByExternalIdResponse> =
        jsonHandler<CustomerCostListByExternalIdResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch a day-by-day snapshot of a customer's costs in Orb, calculated
     * by applying pricing information to the underlying usage (see the
     * [subscription usage endpoint](fetch-subscription-usage.api.mdx) to fetch usage per metric, in
     * usage units rather than a currency).
     *
     * This endpoint can be leveraged for internal tooling and to provide a more transparent billing
     * experience for your end users:
     * 1. Understand the cost breakdown per line item historically and in real-time for the current
     *    billing period.
     * 2. Provide customer visibility into how different services are contributing to the overall
     *    invoice with a per-day timeseries (as compared to the
     *    [upcoming invoice](fetch-upcoming-invoice) resource, which represents a snapshot for the
     *    current period).
     * 3. Assess how minimums and discounts affect your customers by teasing apart costs directly as
     *    a result of usage, as opposed to minimums and discounts at the plan and price level.
     * 4. Gain insight into key customer health metrics, such as the percent utilization of the
     *    minimum committed spend.
     *
     * ## Fetching subscriptions
     *
     * By default, this endpoint fetches the currently active subscription for the customer, and
     * returns cost information for the subscription's current billing period, broken down by each
     * participating price. If there are no currently active subscriptions, this will instead
     * default to the most recently active subscription or return an empty series if none are found.
     * For example, if your plan charges for compute hours, job runs, and data syncs, then this
     * endpoint would provide a daily breakdown of your customer's cost for each of those axes.
     *
     * If timeframe bounds are specified, Orb fetches all subscriptions that were active in that
     * timeframe. If two subscriptions overlap on a single day, costs from each price will be
     * summed, and prices for both subscriptions will be included in the breakdown.
     *
     * ## Prepaid plans
     *
     * For plans that include prices which deduct credits rather than accrue in-arrears charges in a
     * billable currency, this endpoint will return the total deduction amount, in credits, for the
     * specified timeframe.
     *
     * ## Cumulative subtotals and totals
     *
     * Since the subtotal and total must factor in any billing-period level discounts and minimums,
     * it's most meaningful to consider costs relative to the start of the subscription's billing
     * period. As a result, by default this endpoint returns cumulative totals since the beginning
     * of the billing period. In particular, the `timeframe_start` of a returned timeframe window is
     * _always_ the beginning of the billing period and `timeframe_end` is incremented one day at a
     * time to build the result.
     *
     * A customer that uses a few API calls a day but has a minimum commitment might exhibit the
     * following pattern for their subtotal and total in the first few days of the month. Here, we
     * assume that each API call is $2.50, the customer's plan has a monthly minimum of $50 for this
     * price, and that the subscription's billing period bounds are aligned to the first of the
     * month:
     *
     * | timeframe_start | timeframe_end | Cumulative usage | Subtotal | Total (incl. commitment) |
     * |-----------------|---------------|------------------|----------|--------------------------|
     * | 2023-02-01      | 2023-02-02    | 9                | $22.50   | $50.00                   |
     * | 2023-02-01      | 2023-02-03    | 19               | $47.50   | $50.00                   |
     * | 2023-02-01      | 2023-02-04    | 20               | $50.00   | $50.00                   |
     * | 2023-02-01      | 2023-02-05    | 28               | $70.00   | $70.00                   |
     * | 2023-02-01      | 2023-02-06    | 36               | $90.00   | $90.00                   |
     *
     * ### Periodic values
     *
     * When the query parameter `view_mode=periodic` is specified, Orb will return an incremental
     * day-by-day view of costs. In this case, there will always be a one-day difference between
     * `timeframe_start` and `timeframe_end` for the timeframes returned. This is a transform on top
     * of the cumulative costs, calculated by taking the difference of each timeframe with the last.
     * Note that in the above example, the `Total` value would be 0 for the second two data points,
     * since the minimum commitment has not yet been hit and each day is not contributing anything
     * to the total cost.
     *
     * ## Timeframe bounds
     *
     * For an active subscription, both timeframes should be specified in the request. If a
     * subscription starts or ends within the timeframe, the response will only include windows
     * where the subscription is active. If a subscription has ended, no timeframe bounds need to be
     * specified and the response will default to the billing period when the subscription was last
     * active.
     *
     * As noted above, `timeframe_start` for a given cumulative datapoint is always the beginning of
     * the billing period, and `timeframe_end` is incremented one day at a time to construct the
     * response. When a timeframe is passed in that is not aligned to the current subscription's
     * billing period, the response will contain cumulative totals from multiple billing periods.
     *
     * Suppose the queried customer has a subscription aligned to the 15th of every month. If this
     * endpoint is queried with the date range `2023-06-01` - `2023-07-01`, the first data point
     * will represent about half a billing period's worth of costs, accounting for accruals from the
     * start of the billing period and inclusive of the first day of the timeframe (`timeframe_start
     * = 2023-05-15 00:00:00`, `timeframe_end = 2023-06-02 00:00:00`)
     *
     * | datapoint index | timeframe_start | timeframe_end |
     * |-----------------|-----------------|---------------|
     * | 0               | 2023-05-15      | 2023-06-02    |
     * | 1               | 2023-05-15      | 2023-06-03    |
     * | 2               | ...             | ...           |
     * | 3               | 2023-05-15      | 2023-06-14    |
     * | 4               | 2023-06-15      | 2023-06-16    |
     * | 5               | 2023-06-15      | 2023-06-17    |
     * | 6               | ...             | ...           |
     * | 7               | 2023-06-15      | 2023-07-01    |
     *
     * You can see this sliced timeframe visualized [here](https://i.imgur.com/TXhYgme.png).
     *
     * ### Matrix prices
     *
     * When a price uses matrix pricing, it's important to view costs grouped by those matrix
     * dimensions. Orb will return `price_groups` with the `grouping_key` and
     * `secondary_grouping_key` based on the matrix price definition, for each `grouping_value` and
     * `secondary_grouping_value` available.
     */
    override fun listByExternalId(
        params: CustomerCostListByExternalIdParams,
        requestOptions: RequestOptions
    ): CustomerCostListByExternalIdResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "customers",
                    "external_customer_id",
                    params.getPathParam(0),
                    "costs"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listByExternalIdHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
