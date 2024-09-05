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
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonField
import com.withorb.api.core.Enum
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException

/**
 * A backfill represents an update to historical usage data, adding or replacing
 * events in a timeframe.
 */
@JsonDeserialize(builder = EventBackfillFetchResponse.Builder::class)
@NoAutoDetect
class EventBackfillFetchResponse private constructor(
  private val id: JsonField<String>,
  private val status: JsonField<Status>,
  private val createdAt: JsonField<OffsetDateTime>,
  private val timeframeStart: JsonField<OffsetDateTime>,
  private val timeframeEnd: JsonField<OffsetDateTime>,
  private val eventsIngested: JsonField<Long>,
  private val closeTime: JsonField<OffsetDateTime>,
  private val revertedAt: JsonField<OffsetDateTime>,
  private val customerId: JsonField<String>,
  private val deprecationFilter: JsonField<String>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    /** The status of the backfill. */
    fun status(): Status = status.getRequired("status")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

    fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

    /** The number of events ingested in this backfill. */
    fun eventsIngested(): Long = eventsIngested.getRequired("events_ingested")

    /**
     * If in the future, the time at which the backfill will automatically close. If in
     * the past, the time at which the backfill was closed.
     */
    fun closeTime(): OffsetDateTime? = closeTime.getNullable("close_time")

    /** The time at which this backfill was reverted. */
    fun revertedAt(): OffsetDateTime? = revertedAt.getNullable("reverted_at")

    /**
     * The customer ID this backfill is scoped to. If null, this backfill is not scoped
     * to a single customer.
     */
    fun customerId(): String? = customerId.getNullable("customer_id")

    /**
     * A boolean
     * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
     * used to filter the set of events to deprecate
     */
    fun deprecationFilter(): String? = deprecationFilter.getNullable("deprecation_filter")

    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /** The status of the backfill. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    @JsonProperty("timeframe_start")
    @ExcludeMissing
    fun _timeframeStart() = timeframeStart

    @JsonProperty("timeframe_end")
    @ExcludeMissing
    fun _timeframeEnd() = timeframeEnd

    /** The number of events ingested in this backfill. */
    @JsonProperty("events_ingested")
    @ExcludeMissing
    fun _eventsIngested() = eventsIngested

    /**
     * If in the future, the time at which the backfill will automatically close. If in
     * the past, the time at which the backfill was closed.
     */
    @JsonProperty("close_time")
    @ExcludeMissing
    fun _closeTime() = closeTime

    /** The time at which this backfill was reverted. */
    @JsonProperty("reverted_at")
    @ExcludeMissing
    fun _revertedAt() = revertedAt

    /**
     * The customer ID this backfill is scoped to. If null, this backfill is not scoped
     * to a single customer.
     */
    @JsonProperty("customer_id")
    @ExcludeMissing
    fun _customerId() = customerId

    /**
     * A boolean
     * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
     * used to filter the set of events to deprecate
     */
    @JsonProperty("deprecation_filter")
    @ExcludeMissing
    fun _deprecationFilter() = deprecationFilter

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventBackfillFetchResponse = apply {
        if (!validated) {
          id()
          status()
          createdAt()
          timeframeStart()
          timeframeEnd()
          eventsIngested()
          closeTime()
          revertedAt()
          customerId()
          deprecationFilter()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is EventBackfillFetchResponse &&
          this.id == other.id &&
          this.status == other.status &&
          this.createdAt == other.createdAt &&
          this.timeframeStart == other.timeframeStart &&
          this.timeframeEnd == other.timeframeEnd &&
          this.eventsIngested == other.eventsIngested &&
          this.closeTime == other.closeTime &&
          this.revertedAt == other.revertedAt &&
          this.customerId == other.customerId &&
          this.deprecationFilter == other.deprecationFilter &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            id,
            status,
            createdAt,
            timeframeStart,
            timeframeEnd,
            eventsIngested,
            closeTime,
            revertedAt,
            customerId,
            deprecationFilter,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "EventBackfillFetchResponse{id=$id, status=$status, createdAt=$createdAt, timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, eventsIngested=$eventsIngested, closeTime=$closeTime, revertedAt=$revertedAt, customerId=$customerId, deprecationFilter=$deprecationFilter, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventsIngested: JsonField<Long> = JsonMissing.of()
        private var closeTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var revertedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var deprecationFilter: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventBackfillFetchResponse: EventBackfillFetchResponse) = apply {
            this.id = eventBackfillFetchResponse.id
            this.status = eventBackfillFetchResponse.status
            this.createdAt = eventBackfillFetchResponse.createdAt
            this.timeframeStart = eventBackfillFetchResponse.timeframeStart
            this.timeframeEnd = eventBackfillFetchResponse.timeframeEnd
            this.eventsIngested = eventBackfillFetchResponse.eventsIngested
            this.closeTime = eventBackfillFetchResponse.closeTime
            this.revertedAt = eventBackfillFetchResponse.revertedAt
            this.customerId = eventBackfillFetchResponse.customerId
            this.deprecationFilter = eventBackfillFetchResponse.deprecationFilter
            additionalProperties(eventBackfillFetchResponse.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /** The status of the backfill. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the backfill. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        fun timeframeStart(timeframeStart: OffsetDateTime) = timeframeStart(JsonField.of(timeframeStart))

        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            this.timeframeStart = timeframeStart
        }

        fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            this.timeframeEnd = timeframeEnd
        }

        /** The number of events ingested in this backfill. */
        fun eventsIngested(eventsIngested: Long) = eventsIngested(JsonField.of(eventsIngested))

        /** The number of events ingested in this backfill. */
        @JsonProperty("events_ingested")
        @ExcludeMissing
        fun eventsIngested(eventsIngested: JsonField<Long>) = apply {
            this.eventsIngested = eventsIngested
        }

        /**
         * If in the future, the time at which the backfill will automatically close. If in
         * the past, the time at which the backfill was closed.
         */
        fun closeTime(closeTime: OffsetDateTime) = closeTime(JsonField.of(closeTime))

        /**
         * If in the future, the time at which the backfill will automatically close. If in
         * the past, the time at which the backfill was closed.
         */
        @JsonProperty("close_time")
        @ExcludeMissing
        fun closeTime(closeTime: JsonField<OffsetDateTime>) = apply {
            this.closeTime = closeTime
        }

        /** The time at which this backfill was reverted. */
        fun revertedAt(revertedAt: OffsetDateTime) = revertedAt(JsonField.of(revertedAt))

        /** The time at which this backfill was reverted. */
        @JsonProperty("reverted_at")
        @ExcludeMissing
        fun revertedAt(revertedAt: JsonField<OffsetDateTime>) = apply {
            this.revertedAt = revertedAt
        }

        /**
         * The customer ID this backfill is scoped to. If null, this backfill is not scoped
         * to a single customer.
         */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * The customer ID this backfill is scoped to. If null, this backfill is not scoped
         * to a single customer.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun customerId(customerId: JsonField<String>) = apply {
            this.customerId = customerId
        }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
         * used to filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: String) = deprecationFilter(JsonField.of(deprecationFilter))

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
         * used to filter the set of events to deprecate
         */
        @JsonProperty("deprecation_filter")
        @ExcludeMissing
        fun deprecationFilter(deprecationFilter: JsonField<String>) = apply {
            this.deprecationFilter = deprecationFilter
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): EventBackfillFetchResponse = EventBackfillFetchResponse(
            id,
            status,
            createdAt,
            timeframeStart,
            timeframeEnd,
            eventsIngested,
            closeTime,
            revertedAt,
            customerId,
            deprecationFilter,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = Status(JsonField.of("pending"))

            val REFLECTED = Status(JsonField.of("reflected"))

            val PENDING_REVERT = Status(JsonField.of("pending_revert"))

            val REVERTED = Status(JsonField.of("reverted"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            REFLECTED,
            PENDING_REVERT,
            REVERTED,
        }

        enum class Value {
            PENDING,
            REFLECTED,
            PENDING_REVERT,
            REVERTED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            PENDING -> Value.PENDING
            REFLECTED -> Value.REFLECTED
            PENDING_REVERT -> Value.PENDING_REVERT
            REVERTED -> Value.REVERTED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            PENDING -> Known.PENDING
            REFLECTED -> Known.REFLECTED
            PENDING_REVERT -> Known.PENDING_REVERT
            REVERTED -> Known.REVERTED
            else -> throw OrbInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
