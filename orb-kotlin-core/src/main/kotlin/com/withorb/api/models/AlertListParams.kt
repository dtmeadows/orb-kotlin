// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class AlertListParams
constructor(
    private val createdAtGt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLt: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val cursor: String?,
    private val customerId: String?,
    private val externalCustomerId: String?,
    private val limit: Long?,
    private val subscriptionId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun createdAtGt(): OffsetDateTime? = createdAtGt

    fun createdAtGte(): OffsetDateTime? = createdAtGte

    fun createdAtLt(): OffsetDateTime? = createdAtLt

    fun createdAtLte(): OffsetDateTime? = createdAtLte

    fun cursor(): String? = cursor

    fun customerId(): String? = customerId

    fun externalCustomerId(): String? = externalCustomerId

    fun limit(): Long? = limit

    fun subscriptionId(): String? = subscriptionId

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.createdAtGt?.let {
            queryParams.put(
                "created_at[gt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtGte?.let {
            queryParams.put(
                "created_at[gte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtLt?.let {
            queryParams.put(
                "created_at[lt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtLte?.let {
            queryParams.put(
                "created_at[lte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.customerId?.let { queryParams.put("customer_id", listOf(it.toString())) }
        this.externalCustomerId?.let {
            queryParams.put("external_customer_id", listOf(it.toString()))
        }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.subscriptionId?.let { queryParams.put("subscription_id", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertListParams && this.createdAtGt == other.createdAtGt && this.createdAtGte == other.createdAtGte && this.createdAtLt == other.createdAtLt && this.createdAtLte == other.createdAtLte && this.cursor == other.cursor && this.customerId == other.customerId && this.externalCustomerId == other.externalCustomerId && this.limit == other.limit && this.subscriptionId == other.subscriptionId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(createdAtGt, createdAtGte, createdAtLt, createdAtLte, cursor, customerId, externalCustomerId, limit, subscriptionId, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "AlertListParams{createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, cursor=$cursor, customerId=$customerId, externalCustomerId=$externalCustomerId, limit=$limit, subscriptionId=$subscriptionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var cursor: String? = null
        private var customerId: String? = null
        private var externalCustomerId: String? = null
        private var limit: Long? = null
        private var subscriptionId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(alertListParams: AlertListParams) = apply {
            this.createdAtGt = alertListParams.createdAtGt
            this.createdAtGte = alertListParams.createdAtGte
            this.createdAtLt = alertListParams.createdAtLt
            this.createdAtLte = alertListParams.createdAtLte
            this.cursor = alertListParams.cursor
            this.customerId = alertListParams.customerId
            this.externalCustomerId = alertListParams.externalCustomerId
            this.limit = alertListParams.limit
            this.subscriptionId = alertListParams.subscriptionId
            additionalHeaders(alertListParams.additionalHeaders)
            additionalQueryParams(alertListParams.additionalQueryParams)
        }

        fun createdAtGt(createdAtGt: OffsetDateTime) = apply { this.createdAtGt = createdAtGt }

        fun createdAtGte(createdAtGte: OffsetDateTime) = apply { this.createdAtGte = createdAtGte }

        fun createdAtLt(createdAtLt: OffsetDateTime) = apply { this.createdAtLt = createdAtLt }

        fun createdAtLte(createdAtLte: OffsetDateTime) = apply { this.createdAtLte = createdAtLte }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /** Fetch alerts scoped to this customer_id */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Fetch alerts scoped to this external_customer_id */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Fetch alerts scoped to this subscription_id */
        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): AlertListParams =
            AlertListParams(
                createdAtGt,
                createdAtGte,
                createdAtLt,
                createdAtLte,
                cursor,
                customerId,
                externalCustomerId,
                limit,
                subscriptionId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }
}
