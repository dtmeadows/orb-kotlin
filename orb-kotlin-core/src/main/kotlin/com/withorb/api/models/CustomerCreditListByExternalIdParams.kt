// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.*
import java.util.Objects

class CustomerCreditListByExternalIdParams
constructor(
    private val externalCustomerId: String,
    private val currency: String?,
    private val cursor: String?,
    private val includeAllBlocks: Boolean?,
    private val limit: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun externalCustomerId(): String = externalCustomerId

    fun currency(): String? = currency

    fun cursor(): String? = cursor

    fun includeAllBlocks(): Boolean? = includeAllBlocks

    fun limit(): Long? = limit

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.currency?.let { params.put("currency", listOf(it.toString())) }
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.includeAllBlocks?.let { params.put("include_all_blocks", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalCustomerId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListByExternalIdParams && this.externalCustomerId == other.externalCustomerId && this.currency == other.currency && this.cursor == other.cursor && this.includeAllBlocks == other.includeAllBlocks && this.limit == other.limit && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalCustomerId, currency, cursor, includeAllBlocks, limit, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditListByExternalIdParams{externalCustomerId=$externalCustomerId, currency=$currency, cursor=$cursor, includeAllBlocks=$includeAllBlocks, limit=$limit, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalCustomerId: String? = null
        private var currency: String? = null
        private var cursor: String? = null
        private var includeAllBlocks: Boolean? = null
        private var limit: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(
            customerCreditListByExternalIdParams: CustomerCreditListByExternalIdParams
        ) = apply {
            this.externalCustomerId = customerCreditListByExternalIdParams.externalCustomerId
            this.currency = customerCreditListByExternalIdParams.currency
            this.cursor = customerCreditListByExternalIdParams.cursor
            this.includeAllBlocks = customerCreditListByExternalIdParams.includeAllBlocks
            this.limit = customerCreditListByExternalIdParams.limit
            additionalQueryParams(customerCreditListByExternalIdParams.additionalQueryParams)
            additionalHeaders(customerCreditListByExternalIdParams.additionalHeaders)
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The ledger currency or custom pricing unit to use. */
        fun currency(currency: String) = apply { this.currency = currency }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /** Include all blocks, not just active ones. */
        fun includeAllBlocks(includeAllBlocks: Boolean) = apply {
            this.includeAllBlocks = includeAllBlocks
        }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): CustomerCreditListByExternalIdParams =
            CustomerCreditListByExternalIdParams(
                checkNotNull(externalCustomerId) {
                    "`externalCustomerId` is required but was not set"
                },
                currency,
                cursor,
                includeAllBlocks,
                limit,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
