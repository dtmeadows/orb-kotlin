// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Enum
import com.withorb.api.core.ContentTypes
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*

class CustomerCostListByExternalIdParams constructor(
  private val externalCustomerId: String,
  private val currency: String?,
  private val timeframeEnd: OffsetDateTime?,
  private val timeframeStart: OffsetDateTime?,
  private val viewMode: ViewMode?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,

) {

    fun externalCustomerId(): String = externalCustomerId

    fun currency(): String? = currency

    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    fun timeframeStart(): OffsetDateTime? = timeframeStart

    fun viewMode(): ViewMode? = viewMode

    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.currency?.let {
          params.put("currency", listOf(it.toString()))
      }
      this.timeframeEnd?.let {
          params.put("timeframe_end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.timeframeStart?.let {
          params.put("timeframe_start", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.viewMode?.let {
          params.put("view_mode", listOf(it.toString()))
      }
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

      return other is CustomerCostListByExternalIdParams &&
          this.externalCustomerId == other.externalCustomerId &&
          this.currency == other.currency &&
          this.timeframeEnd == other.timeframeEnd &&
          this.timeframeStart == other.timeframeStart &&
          this.viewMode == other.viewMode &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
      return Objects.hash(
          externalCustomerId,
          currency,
          timeframeEnd,
          timeframeStart,
          viewMode,
          additionalQueryParams,
          additionalHeaders,
      )
    }

    override fun toString() = "CustomerCostListByExternalIdParams{externalCustomerId=$externalCustomerId, currency=$currency, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, viewMode=$viewMode, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalCustomerId: String? = null
        private var currency: String? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var viewMode: ViewMode? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(customerCostListByExternalIdParams: CustomerCostListByExternalIdParams) = apply {
            this.externalCustomerId = customerCostListByExternalIdParams.externalCustomerId
            this.currency = customerCostListByExternalIdParams.currency
            this.timeframeEnd = customerCostListByExternalIdParams.timeframeEnd
            this.timeframeStart = customerCostListByExternalIdParams.timeframeStart
            this.viewMode = customerCostListByExternalIdParams.viewMode
            additionalQueryParams(customerCostListByExternalIdParams.additionalQueryParams)
            additionalHeaders(customerCostListByExternalIdParams.additionalHeaders)
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The currency or custom pricing unit to use. */
        fun currency(currency: String) = apply {
            this.currency = currency
        }

        /** Costs returned are exclusive of `timeframe_end`. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply {
            this.timeframeEnd = timeframeEnd
        }

        /** Costs returned are inclusive of `timeframe_start`. */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * Controls whether Orb returns cumulative costs since the start of the billing
         * period, or incremental day-by-day costs. If your customer has minimums or
         * discounts, it's strongly recommended that you use the default cumulative
         * behavior.
         */
        fun viewMode(viewMode: ViewMode) = apply {
            this.viewMode = viewMode
        }

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

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun build(): CustomerCostListByExternalIdParams = CustomerCostListByExternalIdParams(
            checkNotNull(externalCustomerId) {
                "`externalCustomerId` is required but was not set"
            },
            currency,
            timeframeEnd,
            timeframeStart,
            viewMode,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
        )
    }

    class ViewMode @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ViewMode &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PERIODIC = ViewMode(JsonField.of("periodic"))

            val CUMULATIVE = ViewMode(JsonField.of("cumulative"))

            fun of(value: String) = ViewMode(JsonField.of(value))
        }

        enum class Known {
            PERIODIC,
            CUMULATIVE,
        }

        enum class Value {
            PERIODIC,
            CUMULATIVE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            PERIODIC -> Value.PERIODIC
            CUMULATIVE -> Value.CUMULATIVE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            PERIODIC -> Known.PERIODIC
            CUMULATIVE -> Known.CUMULATIVE
            else -> throw OrbInvalidDataException("Unknown ViewMode: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
