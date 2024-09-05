// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.Spliterator
import java.util.Spliterators
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonField
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdResponse
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync

class CustomerCreditLedgerListByExternalIdPageAsync private constructor(private val ledgerService: LedgerServiceAsync, private val params: CustomerCreditLedgerListByExternalIdParams, private val response: Response, ) {

    fun response(): Response = response

    fun data(): List<CustomerCreditLedgerListByExternalIdResponse> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is CustomerCreditLedgerListByExternalIdPageAsync &&
          this.ledgerService == other.ledgerService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          ledgerService,
          params,
          response,
      )
    }

    override fun toString() = "CustomerCreditLedgerListByExternalIdPageAsync{ledgerService=$ledgerService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false;
      }

      return paginationMetadata().nextCursor() != null
    }

    fun getNextPageParams(): CustomerCreditLedgerListByExternalIdParams? {
      if (!hasNextPage()) {
        return null
      }

      return CustomerCreditLedgerListByExternalIdParams.builder().from(params).apply {paginationMetadata().nextCursor()?.let{ this.cursor(it) } }.build()
    }

    suspend fun getNextPage(): CustomerCreditLedgerListByExternalIdPageAsync? {
      return getNextPageParams()?.let {
          ledgerService.listByExternalId(it)
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(ledgerService: LedgerServiceAsync, params: CustomerCreditLedgerListByExternalIdParams, response: Response) = CustomerCreditLedgerListByExternalIdPageAsync(
            ledgerService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val data: JsonField<List<CustomerCreditLedgerListByExternalIdResponse>>, private val paginationMetadata: JsonField<PaginationMetadata>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        fun data(): List<CustomerCreditLedgerListByExternalIdResponse> = data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata = paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): JsonField<List<CustomerCreditLedgerListByExternalIdResponse>>? = data

        @JsonProperty("pagination_metadata")
        fun _paginationMetadata(): JsonField<PaginationMetadata>? = paginationMetadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
              data().map { it.validate() }
              paginationMetadata().validate()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Response &&
              this.data == other.data &&
              this.paginationMetadata == other.paginationMetadata &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          return Objects.hash(
              data,
              paginationMetadata,
              additionalProperties,
          )
        }

        override fun toString() = "CustomerCreditLedgerListByExternalIdPageAsync.Response{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<CustomerCreditLedgerListByExternalIdResponse>> = JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<CustomerCreditLedgerListByExternalIdResponse>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<CustomerCreditLedgerListByExternalIdResponse>>) = apply { this.data = data }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) = paginationMetadata(JsonField.of(paginationMetadata))

            @JsonProperty("pagination_metadata")
            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply { this.paginationMetadata = paginationMetadata }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(
                data,
                paginationMetadata,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    class AutoPager constructor(private val firstPage: CustomerCreditLedgerListByExternalIdPageAsync, ) : Flow<CustomerCreditLedgerListByExternalIdResponse> {

        override suspend fun collect(collector: FlowCollector<CustomerCreditLedgerListByExternalIdResponse>) {
          var page = firstPage
          var index = 0
          while (true) {
            while (index < page.data().size) {
              collector.emit(page.data()[index++])
            }
            page = page.getNextPage() ?: break
            index = 0
          }
        }
    }
}
