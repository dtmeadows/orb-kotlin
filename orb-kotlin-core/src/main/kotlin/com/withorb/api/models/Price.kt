// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(using = Price.Deserializer::class)
@JsonSerialize(using = Price.Serializer::class)
class Price
private constructor(
    private val unitPrice: UnitPrice? = null,
    private val packagePrice: PackagePrice? = null,
    private val matrixPrice: MatrixPrice? = null,
    private val tieredPrice: TieredPrice? = null,
    private val tieredBpsPrice: TieredBpsPrice? = null,
    private val bpsPrice: BpsPrice? = null,
    private val bulkBpsPrice: BulkBpsPrice? = null,
    private val bulkPrice: BulkPrice? = null,
    private val thresholdTotalAmountPrice: ThresholdTotalAmountPrice? = null,
    private val tieredPackagePrice: TieredPackagePrice? = null,
    private val groupedTieredPrice: GroupedTieredPrice? = null,
    private val tieredWithMinimumPrice: TieredWithMinimumPrice? = null,
    private val tieredPackageWithMinimumPrice: TieredPackageWithMinimumPrice? = null,
    private val packageWithAllocationPrice: PackageWithAllocationPrice? = null,
    private val unitWithPercentPrice: UnitWithPercentPrice? = null,
    private val matrixWithAllocationPrice: MatrixWithAllocationPrice? = null,
    private val tieredWithProrationPrice: TieredWithProrationPrice? = null,
    private val unitWithProrationPrice: UnitWithProrationPrice? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun unitPrice(): UnitPrice? = unitPrice

    fun packagePrice(): PackagePrice? = packagePrice

    fun matrixPrice(): MatrixPrice? = matrixPrice

    fun tieredPrice(): TieredPrice? = tieredPrice

    fun tieredBpsPrice(): TieredBpsPrice? = tieredBpsPrice

    fun bpsPrice(): BpsPrice? = bpsPrice

    fun bulkBpsPrice(): BulkBpsPrice? = bulkBpsPrice

    fun bulkPrice(): BulkPrice? = bulkPrice

    fun thresholdTotalAmountPrice(): ThresholdTotalAmountPrice? = thresholdTotalAmountPrice

    fun tieredPackagePrice(): TieredPackagePrice? = tieredPackagePrice

    fun groupedTieredPrice(): GroupedTieredPrice? = groupedTieredPrice

    fun tieredWithMinimumPrice(): TieredWithMinimumPrice? = tieredWithMinimumPrice

    fun tieredPackageWithMinimumPrice(): TieredPackageWithMinimumPrice? =
        tieredPackageWithMinimumPrice

    fun packageWithAllocationPrice(): PackageWithAllocationPrice? = packageWithAllocationPrice

    fun unitWithPercentPrice(): UnitWithPercentPrice? = unitWithPercentPrice

    fun matrixWithAllocationPrice(): MatrixWithAllocationPrice? = matrixWithAllocationPrice

    fun tieredWithProrationPrice(): TieredWithProrationPrice? = tieredWithProrationPrice

    fun unitWithProrationPrice(): UnitWithProrationPrice? = unitWithProrationPrice

    fun isUnitPrice(): Boolean = unitPrice != null

    fun isPackagePrice(): Boolean = packagePrice != null

    fun isMatrixPrice(): Boolean = matrixPrice != null

    fun isTieredPrice(): Boolean = tieredPrice != null

    fun isTieredBpsPrice(): Boolean = tieredBpsPrice != null

    fun isBpsPrice(): Boolean = bpsPrice != null

    fun isBulkBpsPrice(): Boolean = bulkBpsPrice != null

    fun isBulkPrice(): Boolean = bulkPrice != null

    fun isThresholdTotalAmountPrice(): Boolean = thresholdTotalAmountPrice != null

    fun isTieredPackagePrice(): Boolean = tieredPackagePrice != null

    fun isGroupedTieredPrice(): Boolean = groupedTieredPrice != null

    fun isTieredWithMinimumPrice(): Boolean = tieredWithMinimumPrice != null

    fun isTieredPackageWithMinimumPrice(): Boolean = tieredPackageWithMinimumPrice != null

    fun isPackageWithAllocationPrice(): Boolean = packageWithAllocationPrice != null

    fun isUnitWithPercentPrice(): Boolean = unitWithPercentPrice != null

    fun isMatrixWithAllocationPrice(): Boolean = matrixWithAllocationPrice != null

    fun isTieredWithProrationPrice(): Boolean = tieredWithProrationPrice != null

    fun isUnitWithProrationPrice(): Boolean = unitWithProrationPrice != null

    fun asUnitPrice(): UnitPrice = unitPrice.getOrThrow("unitPrice")

    fun asPackagePrice(): PackagePrice = packagePrice.getOrThrow("packagePrice")

    fun asMatrixPrice(): MatrixPrice = matrixPrice.getOrThrow("matrixPrice")

    fun asTieredPrice(): TieredPrice = tieredPrice.getOrThrow("tieredPrice")

    fun asTieredBpsPrice(): TieredBpsPrice = tieredBpsPrice.getOrThrow("tieredBpsPrice")

    fun asBpsPrice(): BpsPrice = bpsPrice.getOrThrow("bpsPrice")

    fun asBulkBpsPrice(): BulkBpsPrice = bulkBpsPrice.getOrThrow("bulkBpsPrice")

    fun asBulkPrice(): BulkPrice = bulkPrice.getOrThrow("bulkPrice")

    fun asThresholdTotalAmountPrice(): ThresholdTotalAmountPrice =
        thresholdTotalAmountPrice.getOrThrow("thresholdTotalAmountPrice")

    fun asTieredPackagePrice(): TieredPackagePrice =
        tieredPackagePrice.getOrThrow("tieredPackagePrice")

    fun asGroupedTieredPrice(): GroupedTieredPrice =
        groupedTieredPrice.getOrThrow("groupedTieredPrice")

    fun asTieredWithMinimumPrice(): TieredWithMinimumPrice =
        tieredWithMinimumPrice.getOrThrow("tieredWithMinimumPrice")

    fun asTieredPackageWithMinimumPrice(): TieredPackageWithMinimumPrice =
        tieredPackageWithMinimumPrice.getOrThrow("tieredPackageWithMinimumPrice")

    fun asPackageWithAllocationPrice(): PackageWithAllocationPrice =
        packageWithAllocationPrice.getOrThrow("packageWithAllocationPrice")

    fun asUnitWithPercentPrice(): UnitWithPercentPrice =
        unitWithPercentPrice.getOrThrow("unitWithPercentPrice")

    fun asMatrixWithAllocationPrice(): MatrixWithAllocationPrice =
        matrixWithAllocationPrice.getOrThrow("matrixWithAllocationPrice")

    fun asTieredWithProrationPrice(): TieredWithProrationPrice =
        tieredWithProrationPrice.getOrThrow("tieredWithProrationPrice")

    fun asUnitWithProrationPrice(): UnitWithProrationPrice =
        unitWithProrationPrice.getOrThrow("unitWithProrationPrice")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            unitPrice != null -> visitor.visitUnitPrice(unitPrice)
            packagePrice != null -> visitor.visitPackagePrice(packagePrice)
            matrixPrice != null -> visitor.visitMatrixPrice(matrixPrice)
            tieredPrice != null -> visitor.visitTieredPrice(tieredPrice)
            tieredBpsPrice != null -> visitor.visitTieredBpsPrice(tieredBpsPrice)
            bpsPrice != null -> visitor.visitBpsPrice(bpsPrice)
            bulkBpsPrice != null -> visitor.visitBulkBpsPrice(bulkBpsPrice)
            bulkPrice != null -> visitor.visitBulkPrice(bulkPrice)
            thresholdTotalAmountPrice != null ->
                visitor.visitThresholdTotalAmountPrice(thresholdTotalAmountPrice)
            tieredPackagePrice != null -> visitor.visitTieredPackagePrice(tieredPackagePrice)
            groupedTieredPrice != null -> visitor.visitGroupedTieredPrice(groupedTieredPrice)
            tieredWithMinimumPrice != null ->
                visitor.visitTieredWithMinimumPrice(tieredWithMinimumPrice)
            tieredPackageWithMinimumPrice != null ->
                visitor.visitTieredPackageWithMinimumPrice(tieredPackageWithMinimumPrice)
            packageWithAllocationPrice != null ->
                visitor.visitPackageWithAllocationPrice(packageWithAllocationPrice)
            unitWithPercentPrice != null -> visitor.visitUnitWithPercentPrice(unitWithPercentPrice)
            matrixWithAllocationPrice != null ->
                visitor.visitMatrixWithAllocationPrice(matrixWithAllocationPrice)
            tieredWithProrationPrice != null ->
                visitor.visitTieredWithProrationPrice(tieredWithProrationPrice)
            unitWithProrationPrice != null ->
                visitor.visitUnitWithProrationPrice(unitWithProrationPrice)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): Price = apply {
        if (!validated) {
            if (
                unitPrice == null &&
                    packagePrice == null &&
                    matrixPrice == null &&
                    tieredPrice == null &&
                    tieredBpsPrice == null &&
                    bpsPrice == null &&
                    bulkBpsPrice == null &&
                    bulkPrice == null &&
                    thresholdTotalAmountPrice == null &&
                    tieredPackagePrice == null &&
                    groupedTieredPrice == null &&
                    tieredWithMinimumPrice == null &&
                    tieredPackageWithMinimumPrice == null &&
                    packageWithAllocationPrice == null &&
                    unitWithPercentPrice == null &&
                    matrixWithAllocationPrice == null &&
                    tieredWithProrationPrice == null &&
                    unitWithProrationPrice == null
            ) {
                throw OrbInvalidDataException("Unknown Price: $_json")
            }
            unitPrice?.validate()
            packagePrice?.validate()
            matrixPrice?.validate()
            tieredPrice?.validate()
            tieredBpsPrice?.validate()
            bpsPrice?.validate()
            bulkBpsPrice?.validate()
            bulkPrice?.validate()
            thresholdTotalAmountPrice?.validate()
            tieredPackagePrice?.validate()
            groupedTieredPrice?.validate()
            tieredWithMinimumPrice?.validate()
            tieredPackageWithMinimumPrice?.validate()
            packageWithAllocationPrice?.validate()
            unitWithPercentPrice?.validate()
            matrixWithAllocationPrice?.validate()
            tieredWithProrationPrice?.validate()
            unitWithProrationPrice?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Price &&
            this.unitPrice == other.unitPrice &&
            this.packagePrice == other.packagePrice &&
            this.matrixPrice == other.matrixPrice &&
            this.tieredPrice == other.tieredPrice &&
            this.tieredBpsPrice == other.tieredBpsPrice &&
            this.bpsPrice == other.bpsPrice &&
            this.bulkBpsPrice == other.bulkBpsPrice &&
            this.bulkPrice == other.bulkPrice &&
            this.thresholdTotalAmountPrice == other.thresholdTotalAmountPrice &&
            this.tieredPackagePrice == other.tieredPackagePrice &&
            this.groupedTieredPrice == other.groupedTieredPrice &&
            this.tieredWithMinimumPrice == other.tieredWithMinimumPrice &&
            this.tieredPackageWithMinimumPrice == other.tieredPackageWithMinimumPrice &&
            this.packageWithAllocationPrice == other.packageWithAllocationPrice &&
            this.unitWithPercentPrice == other.unitWithPercentPrice &&
            this.matrixWithAllocationPrice == other.matrixWithAllocationPrice &&
            this.tieredWithProrationPrice == other.tieredWithProrationPrice &&
            this.unitWithProrationPrice == other.unitWithProrationPrice
    }

    override fun hashCode(): Int {
        return Objects.hash(
            unitPrice,
            packagePrice,
            matrixPrice,
            tieredPrice,
            tieredBpsPrice,
            bpsPrice,
            bulkBpsPrice,
            bulkPrice,
            thresholdTotalAmountPrice,
            tieredPackagePrice,
            groupedTieredPrice,
            tieredWithMinimumPrice,
            tieredPackageWithMinimumPrice,
            packageWithAllocationPrice,
            unitWithPercentPrice,
            matrixWithAllocationPrice,
            tieredWithProrationPrice,
            unitWithProrationPrice,
        )
    }

    override fun toString(): String {
        return when {
            unitPrice != null -> "Price{unitPrice=$unitPrice}"
            packagePrice != null -> "Price{packagePrice=$packagePrice}"
            matrixPrice != null -> "Price{matrixPrice=$matrixPrice}"
            tieredPrice != null -> "Price{tieredPrice=$tieredPrice}"
            tieredBpsPrice != null -> "Price{tieredBpsPrice=$tieredBpsPrice}"
            bpsPrice != null -> "Price{bpsPrice=$bpsPrice}"
            bulkBpsPrice != null -> "Price{bulkBpsPrice=$bulkBpsPrice}"
            bulkPrice != null -> "Price{bulkPrice=$bulkPrice}"
            thresholdTotalAmountPrice != null ->
                "Price{thresholdTotalAmountPrice=$thresholdTotalAmountPrice}"
            tieredPackagePrice != null -> "Price{tieredPackagePrice=$tieredPackagePrice}"
            groupedTieredPrice != null -> "Price{groupedTieredPrice=$groupedTieredPrice}"
            tieredWithMinimumPrice != null ->
                "Price{tieredWithMinimumPrice=$tieredWithMinimumPrice}"
            tieredPackageWithMinimumPrice != null ->
                "Price{tieredPackageWithMinimumPrice=$tieredPackageWithMinimumPrice}"
            packageWithAllocationPrice != null ->
                "Price{packageWithAllocationPrice=$packageWithAllocationPrice}"
            unitWithPercentPrice != null -> "Price{unitWithPercentPrice=$unitWithPercentPrice}"
            matrixWithAllocationPrice != null ->
                "Price{matrixWithAllocationPrice=$matrixWithAllocationPrice}"
            tieredWithProrationPrice != null ->
                "Price{tieredWithProrationPrice=$tieredWithProrationPrice}"
            unitWithProrationPrice != null ->
                "Price{unitWithProrationPrice=$unitWithProrationPrice}"
            _json != null -> "Price{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Price")
        }
    }

    companion object {

        fun ofUnitPrice(unitPrice: UnitPrice) = Price(unitPrice = unitPrice)

        fun ofPackagePrice(packagePrice: PackagePrice) = Price(packagePrice = packagePrice)

        fun ofMatrixPrice(matrixPrice: MatrixPrice) = Price(matrixPrice = matrixPrice)

        fun ofTieredPrice(tieredPrice: TieredPrice) = Price(tieredPrice = tieredPrice)

        fun ofTieredBpsPrice(tieredBpsPrice: TieredBpsPrice) =
            Price(tieredBpsPrice = tieredBpsPrice)

        fun ofBpsPrice(bpsPrice: BpsPrice) = Price(bpsPrice = bpsPrice)

        fun ofBulkBpsPrice(bulkBpsPrice: BulkBpsPrice) = Price(bulkBpsPrice = bulkBpsPrice)

        fun ofBulkPrice(bulkPrice: BulkPrice) = Price(bulkPrice = bulkPrice)

        fun ofThresholdTotalAmountPrice(thresholdTotalAmountPrice: ThresholdTotalAmountPrice) =
            Price(thresholdTotalAmountPrice = thresholdTotalAmountPrice)

        fun ofTieredPackagePrice(tieredPackagePrice: TieredPackagePrice) =
            Price(tieredPackagePrice = tieredPackagePrice)

        fun ofGroupedTieredPrice(groupedTieredPrice: GroupedTieredPrice) =
            Price(groupedTieredPrice = groupedTieredPrice)

        fun ofTieredWithMinimumPrice(tieredWithMinimumPrice: TieredWithMinimumPrice) =
            Price(tieredWithMinimumPrice = tieredWithMinimumPrice)

        fun ofTieredPackageWithMinimumPrice(
            tieredPackageWithMinimumPrice: TieredPackageWithMinimumPrice
        ) = Price(tieredPackageWithMinimumPrice = tieredPackageWithMinimumPrice)

        fun ofPackageWithAllocationPrice(packageWithAllocationPrice: PackageWithAllocationPrice) =
            Price(packageWithAllocationPrice = packageWithAllocationPrice)

        fun ofUnitWithPercentPrice(unitWithPercentPrice: UnitWithPercentPrice) =
            Price(unitWithPercentPrice = unitWithPercentPrice)

        fun ofMatrixWithAllocationPrice(matrixWithAllocationPrice: MatrixWithAllocationPrice) =
            Price(matrixWithAllocationPrice = matrixWithAllocationPrice)

        fun ofTieredWithProrationPrice(tieredWithProrationPrice: TieredWithProrationPrice) =
            Price(tieredWithProrationPrice = tieredWithProrationPrice)

        fun ofUnitWithProrationPrice(unitWithProrationPrice: UnitWithProrationPrice) =
            Price(unitWithProrationPrice = unitWithProrationPrice)
    }

    interface Visitor<out T> {

        fun visitUnitPrice(unitPrice: UnitPrice): T

        fun visitPackagePrice(packagePrice: PackagePrice): T

        fun visitMatrixPrice(matrixPrice: MatrixPrice): T

        fun visitTieredPrice(tieredPrice: TieredPrice): T

        fun visitTieredBpsPrice(tieredBpsPrice: TieredBpsPrice): T

        fun visitBpsPrice(bpsPrice: BpsPrice): T

        fun visitBulkBpsPrice(bulkBpsPrice: BulkBpsPrice): T

        fun visitBulkPrice(bulkPrice: BulkPrice): T

        fun visitThresholdTotalAmountPrice(thresholdTotalAmountPrice: ThresholdTotalAmountPrice): T

        fun visitTieredPackagePrice(tieredPackagePrice: TieredPackagePrice): T

        fun visitGroupedTieredPrice(groupedTieredPrice: GroupedTieredPrice): T

        fun visitTieredWithMinimumPrice(tieredWithMinimumPrice: TieredWithMinimumPrice): T

        fun visitTieredPackageWithMinimumPrice(
            tieredPackageWithMinimumPrice: TieredPackageWithMinimumPrice
        ): T

        fun visitPackageWithAllocationPrice(
            packageWithAllocationPrice: PackageWithAllocationPrice
        ): T

        fun visitUnitWithPercentPrice(unitWithPercentPrice: UnitWithPercentPrice): T

        fun visitMatrixWithAllocationPrice(matrixWithAllocationPrice: MatrixWithAllocationPrice): T

        fun visitTieredWithProrationPrice(tieredWithProrationPrice: TieredWithProrationPrice): T

        fun visitUnitWithProrationPrice(unitWithProrationPrice: UnitWithProrationPrice): T

        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown Price: $json")
        }
    }

    class Deserializer : BaseDeserializer<Price>(Price::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Price {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<UnitPrice>()) { it.validate() }
                ?.let {
                    return Price(unitPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<PackagePrice>()) { it.validate() }
                ?.let {
                    return Price(packagePrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<MatrixPrice>()) { it.validate() }
                ?.let {
                    return Price(matrixPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<TieredPrice>()) { it.validate() }
                ?.let {
                    return Price(tieredPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<TieredBpsPrice>()) { it.validate() }
                ?.let {
                    return Price(tieredBpsPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<BpsPrice>()) { it.validate() }
                ?.let {
                    return Price(bpsPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<BulkBpsPrice>()) { it.validate() }
                ?.let {
                    return Price(bulkBpsPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<BulkPrice>()) { it.validate() }
                ?.let {
                    return Price(bulkPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<ThresholdTotalAmountPrice>()) { it.validate() }
                ?.let {
                    return Price(thresholdTotalAmountPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<TieredPackagePrice>()) { it.validate() }
                ?.let {
                    return Price(tieredPackagePrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<GroupedTieredPrice>()) { it.validate() }
                ?.let {
                    return Price(groupedTieredPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<TieredWithMinimumPrice>()) { it.validate() }
                ?.let {
                    return Price(tieredWithMinimumPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<TieredPackageWithMinimumPrice>()) { it.validate() }
                ?.let {
                    return Price(tieredPackageWithMinimumPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<PackageWithAllocationPrice>()) { it.validate() }
                ?.let {
                    return Price(packageWithAllocationPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<UnitWithPercentPrice>()) { it.validate() }
                ?.let {
                    return Price(unitWithPercentPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<MatrixWithAllocationPrice>()) { it.validate() }
                ?.let {
                    return Price(matrixWithAllocationPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<TieredWithProrationPrice>()) { it.validate() }
                ?.let {
                    return Price(tieredWithProrationPrice = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<UnitWithProrationPrice>()) { it.validate() }
                ?.let {
                    return Price(unitWithProrationPrice = it, _json = json)
                }

            return Price(_json = json)
        }
    }

    class Serializer : BaseSerializer<Price>(Price::class) {

        override fun serialize(
            value: Price,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.unitPrice != null -> generator.writeObject(value.unitPrice)
                value.packagePrice != null -> generator.writeObject(value.packagePrice)
                value.matrixPrice != null -> generator.writeObject(value.matrixPrice)
                value.tieredPrice != null -> generator.writeObject(value.tieredPrice)
                value.tieredBpsPrice != null -> generator.writeObject(value.tieredBpsPrice)
                value.bpsPrice != null -> generator.writeObject(value.bpsPrice)
                value.bulkBpsPrice != null -> generator.writeObject(value.bulkBpsPrice)
                value.bulkPrice != null -> generator.writeObject(value.bulkPrice)
                value.thresholdTotalAmountPrice != null ->
                    generator.writeObject(value.thresholdTotalAmountPrice)
                value.tieredPackagePrice != null -> generator.writeObject(value.tieredPackagePrice)
                value.groupedTieredPrice != null -> generator.writeObject(value.groupedTieredPrice)
                value.tieredWithMinimumPrice != null ->
                    generator.writeObject(value.tieredWithMinimumPrice)
                value.tieredPackageWithMinimumPrice != null ->
                    generator.writeObject(value.tieredPackageWithMinimumPrice)
                value.packageWithAllocationPrice != null ->
                    generator.writeObject(value.packageWithAllocationPrice)
                value.unitWithPercentPrice != null ->
                    generator.writeObject(value.unitWithPercentPrice)
                value.matrixWithAllocationPrice != null ->
                    generator.writeObject(value.matrixWithAllocationPrice)
                value.tieredWithProrationPrice != null ->
                    generator.writeObject(value.tieredWithProrationPrice)
                value.unitWithProrationPrice != null ->
                    generator.writeObject(value.unitWithProrationPrice)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Price")
            }
        }
    }

    @JsonDeserialize(builder = UnitPrice.Builder::class)
    @NoAutoDetect
    class UnitPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val unitConfig: JsonField<UnitConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun unitConfig(): UnitConfig = unitConfig.getRequired("unit_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("unit_config") @ExcludeMissing fun _unitConfig() = unitConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UnitPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                unitConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnitPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.unitConfig == other.unitConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        unitConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "UnitPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, unitConfig=$unitConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var unitConfig: JsonField<UnitConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unitPrice: UnitPrice) = apply {
                this.id = unitPrice.id
                this.name = unitPrice.name
                this.externalPriceId = unitPrice.externalPriceId
                this.priceType = unitPrice.priceType
                this.modelType = unitPrice.modelType
                this.createdAt = unitPrice.createdAt
                this.cadence = unitPrice.cadence
                this.billableMetric = unitPrice.billableMetric
                this.fixedPriceQuantity = unitPrice.fixedPriceQuantity
                this.planPhaseOrder = unitPrice.planPhaseOrder
                this.currency = unitPrice.currency
                this.conversionRate = unitPrice.conversionRate
                this.item = unitPrice.item
                this.creditAllocation = unitPrice.creditAllocation
                this.discount = unitPrice.discount
                this.minimum = unitPrice.minimum
                this.minimumAmount = unitPrice.minimumAmount
                this.maximum = unitPrice.maximum
                this.maximumAmount = unitPrice.maximumAmount
                this.unitConfig = unitPrice.unitConfig
                additionalProperties(unitPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun unitConfig(unitConfig: UnitConfig) = unitConfig(JsonField.of(unitConfig))

            @JsonProperty("unit_config")
            @ExcludeMissing
            fun unitConfig(unitConfig: JsonField<UnitConfig>) = apply {
                this.unitConfig = unitConfig
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

            fun build(): UnitPrice =
                UnitPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    unitConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val UNIT = ModelType(JsonField.of("unit"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                UNIT,
            }

            enum class Value {
                UNIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNIT -> Value.UNIT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    UNIT -> Known.UNIT
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = UnitConfig.Builder::class)
        @NoAutoDetect
        class UnitConfig
        private constructor(
            private val unitAmount: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Rate per unit of usage */
            fun unitAmount(): String = unitAmount.getRequired("unit_amount")

            /** Rate per unit of usage */
            @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnitConfig = apply {
                if (!validated) {
                    unitAmount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnitConfig &&
                    this.unitAmount == other.unitAmount &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(unitAmount, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "UnitConfig{unitAmount=$unitAmount, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var unitAmount: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unitConfig: UnitConfig) = apply {
                    this.unitAmount = unitConfig.unitAmount
                    additionalProperties(unitConfig.additionalProperties)
                }

                /** Rate per unit of usage */
                fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                /** Rate per unit of usage */
                @JsonProperty("unit_amount")
                @ExcludeMissing
                fun unitAmount(unitAmount: JsonField<String>) = apply {
                    this.unitAmount = unitAmount
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnitConfig =
                    UnitConfig(unitAmount, additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = PackagePrice.Builder::class)
    @NoAutoDetect
    class PackagePrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val packageConfig: JsonField<PackageConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun packageConfig(): PackageConfig = packageConfig.getRequired("package_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("package_config") @ExcludeMissing fun _packageConfig() = packageConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PackagePrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                packageConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PackagePrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.packageConfig == other.packageConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        packageConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PackagePrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, packageConfig=$packageConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var packageConfig: JsonField<PackageConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(packagePrice: PackagePrice) = apply {
                this.id = packagePrice.id
                this.name = packagePrice.name
                this.externalPriceId = packagePrice.externalPriceId
                this.priceType = packagePrice.priceType
                this.modelType = packagePrice.modelType
                this.createdAt = packagePrice.createdAt
                this.cadence = packagePrice.cadence
                this.billableMetric = packagePrice.billableMetric
                this.fixedPriceQuantity = packagePrice.fixedPriceQuantity
                this.planPhaseOrder = packagePrice.planPhaseOrder
                this.currency = packagePrice.currency
                this.conversionRate = packagePrice.conversionRate
                this.item = packagePrice.item
                this.creditAllocation = packagePrice.creditAllocation
                this.discount = packagePrice.discount
                this.minimum = packagePrice.minimum
                this.minimumAmount = packagePrice.minimumAmount
                this.maximum = packagePrice.maximum
                this.maximumAmount = packagePrice.maximumAmount
                this.packageConfig = packagePrice.packageConfig
                additionalProperties(packagePrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun packageConfig(packageConfig: PackageConfig) =
                packageConfig(JsonField.of(packageConfig))

            @JsonProperty("package_config")
            @ExcludeMissing
            fun packageConfig(packageConfig: JsonField<PackageConfig>) = apply {
                this.packageConfig = packageConfig
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

            fun build(): PackagePrice =
                PackagePrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    packageConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val PACKAGE = ModelType(JsonField.of("package"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                PACKAGE,
            }

            enum class Value {
                PACKAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PACKAGE -> Value.PACKAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PACKAGE -> Known.PACKAGE
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = PackageConfig.Builder::class)
        @NoAutoDetect
        class PackageConfig
        private constructor(
            private val packageAmount: JsonField<String>,
            private val packageSize: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** A currency amount to rate usage by */
            fun packageAmount(): String = packageAmount.getRequired("package_amount")

            /**
             * An integer amount to represent package size. For example, 1000 here would divide
             * usage by 1000 before multiplying by package_amount in rating
             */
            fun packageSize(): Long = packageSize.getRequired("package_size")

            /** A currency amount to rate usage by */
            @JsonProperty("package_amount") @ExcludeMissing fun _packageAmount() = packageAmount

            /**
             * An integer amount to represent package size. For example, 1000 here would divide
             * usage by 1000 before multiplying by package_amount in rating
             */
            @JsonProperty("package_size") @ExcludeMissing fun _packageSize() = packageSize

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PackageConfig = apply {
                if (!validated) {
                    packageAmount()
                    packageSize()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PackageConfig &&
                    this.packageAmount == other.packageAmount &&
                    this.packageSize == other.packageSize &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            packageAmount,
                            packageSize,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "PackageConfig{packageAmount=$packageAmount, packageSize=$packageSize, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var packageAmount: JsonField<String> = JsonMissing.of()
                private var packageSize: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(packageConfig: PackageConfig) = apply {
                    this.packageAmount = packageConfig.packageAmount
                    this.packageSize = packageConfig.packageSize
                    additionalProperties(packageConfig.additionalProperties)
                }

                /** A currency amount to rate usage by */
                fun packageAmount(packageAmount: String) =
                    packageAmount(JsonField.of(packageAmount))

                /** A currency amount to rate usage by */
                @JsonProperty("package_amount")
                @ExcludeMissing
                fun packageAmount(packageAmount: JsonField<String>) = apply {
                    this.packageAmount = packageAmount
                }

                /**
                 * An integer amount to represent package size. For example, 1000 here would divide
                 * usage by 1000 before multiplying by package_amount in rating
                 */
                fun packageSize(packageSize: Long) = packageSize(JsonField.of(packageSize))

                /**
                 * An integer amount to represent package size. For example, 1000 here would divide
                 * usage by 1000 before multiplying by package_amount in rating
                 */
                @JsonProperty("package_size")
                @ExcludeMissing
                fun packageSize(packageSize: JsonField<Long>) = apply {
                    this.packageSize = packageSize
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PackageConfig =
                    PackageConfig(
                        packageAmount,
                        packageSize,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = MatrixPrice.Builder::class)
    @NoAutoDetect
    class MatrixPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val matrixConfig: JsonField<MatrixConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("matrix_config") @ExcludeMissing fun _matrixConfig() = matrixConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): MatrixPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                matrixConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MatrixPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.matrixConfig == other.matrixConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        matrixConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "MatrixPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, matrixConfig=$matrixConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var matrixConfig: JsonField<MatrixConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(matrixPrice: MatrixPrice) = apply {
                this.id = matrixPrice.id
                this.name = matrixPrice.name
                this.externalPriceId = matrixPrice.externalPriceId
                this.priceType = matrixPrice.priceType
                this.modelType = matrixPrice.modelType
                this.createdAt = matrixPrice.createdAt
                this.cadence = matrixPrice.cadence
                this.billableMetric = matrixPrice.billableMetric
                this.fixedPriceQuantity = matrixPrice.fixedPriceQuantity
                this.planPhaseOrder = matrixPrice.planPhaseOrder
                this.currency = matrixPrice.currency
                this.conversionRate = matrixPrice.conversionRate
                this.item = matrixPrice.item
                this.creditAllocation = matrixPrice.creditAllocation
                this.discount = matrixPrice.discount
                this.minimum = matrixPrice.minimum
                this.minimumAmount = matrixPrice.minimumAmount
                this.maximum = matrixPrice.maximum
                this.maximumAmount = matrixPrice.maximumAmount
                this.matrixConfig = matrixPrice.matrixConfig
                additionalProperties(matrixPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun matrixConfig(matrixConfig: MatrixConfig) = matrixConfig(JsonField.of(matrixConfig))

            @JsonProperty("matrix_config")
            @ExcludeMissing
            fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                this.matrixConfig = matrixConfig
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

            fun build(): MatrixPrice =
                MatrixPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    matrixConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = MatrixConfig.Builder::class)
        @NoAutoDetect
        class MatrixConfig
        private constructor(
            private val dimensions: JsonField<List<String?>>,
            private val defaultUnitAmount: JsonField<String>,
            private val matrixValues: JsonField<List<MatrixValue>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** One or two event property values to evaluate matrix groups by */
            fun dimensions(): List<String?> = dimensions.getRequired("dimensions")

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            fun defaultUnitAmount(): String = defaultUnitAmount.getRequired("default_unit_amount")

            /** Matrix values for specified matrix grouping keys */
            fun matrixValues(): List<MatrixValue> = matrixValues.getRequired("matrix_values")

            /** One or two event property values to evaluate matrix groups by */
            @JsonProperty("dimensions") @ExcludeMissing fun _dimensions() = dimensions

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            @JsonProperty("default_unit_amount")
            @ExcludeMissing
            fun _defaultUnitAmount() = defaultUnitAmount

            /** Matrix values for specified matrix grouping keys */
            @JsonProperty("matrix_values") @ExcludeMissing fun _matrixValues() = matrixValues

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): MatrixConfig = apply {
                if (!validated) {
                    dimensions()
                    defaultUnitAmount()
                    matrixValues().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MatrixConfig &&
                    this.dimensions == other.dimensions &&
                    this.defaultUnitAmount == other.defaultUnitAmount &&
                    this.matrixValues == other.matrixValues &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            dimensions,
                            defaultUnitAmount,
                            matrixValues,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "MatrixConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var dimensions: JsonField<List<String?>> = JsonMissing.of()
                private var defaultUnitAmount: JsonField<String> = JsonMissing.of()
                private var matrixValues: JsonField<List<MatrixValue>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixConfig: MatrixConfig) = apply {
                    this.dimensions = matrixConfig.dimensions
                    this.defaultUnitAmount = matrixConfig.defaultUnitAmount
                    this.matrixValues = matrixConfig.matrixValues
                    additionalProperties(matrixConfig.additionalProperties)
                }

                /** One or two event property values to evaluate matrix groups by */
                fun dimensions(dimensions: List<String?>) = dimensions(JsonField.of(dimensions))

                /** One or two event property values to evaluate matrix groups by */
                @JsonProperty("dimensions")
                @ExcludeMissing
                fun dimensions(dimensions: JsonField<List<String?>>) = apply {
                    this.dimensions = dimensions
                }

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                fun defaultUnitAmount(defaultUnitAmount: String) =
                    defaultUnitAmount(JsonField.of(defaultUnitAmount))

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                @JsonProperty("default_unit_amount")
                @ExcludeMissing
                fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
                    this.defaultUnitAmount = defaultUnitAmount
                }

                /** Matrix values for specified matrix grouping keys */
                fun matrixValues(matrixValues: List<MatrixValue>) =
                    matrixValues(JsonField.of(matrixValues))

                /** Matrix values for specified matrix grouping keys */
                @JsonProperty("matrix_values")
                @ExcludeMissing
                fun matrixValues(matrixValues: JsonField<List<MatrixValue>>) = apply {
                    this.matrixValues = matrixValues
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): MatrixConfig =
                    MatrixConfig(
                        dimensions.map { it.toUnmodifiable() },
                        defaultUnitAmount,
                        matrixValues.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = MatrixValue.Builder::class)
            @NoAutoDetect
            class MatrixValue
            private constructor(
                private val unitAmount: JsonField<String>,
                private val dimensionValues: JsonField<List<String?>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Unit price for the specified dimension_values */
                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                fun dimensionValues(): List<String?> =
                    dimensionValues.getRequired("dimension_values")

                /** Unit price for the specified dimension_values */
                @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                @JsonProperty("dimension_values")
                @ExcludeMissing
                fun _dimensionValues() = dimensionValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): MatrixValue = apply {
                    if (!validated) {
                        unitAmount()
                        dimensionValues()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MatrixValue &&
                        this.unitAmount == other.unitAmount &&
                        this.dimensionValues == other.dimensionValues &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                unitAmount,
                                dimensionValues,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var unitAmount: JsonField<String> = JsonMissing.of()
                    private var dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixValue: MatrixValue) = apply {
                        this.unitAmount = matrixValue.unitAmount
                        this.dimensionValues = matrixValue.dimensionValues
                        additionalProperties(matrixValue.additionalProperties)
                    }

                    /** Unit price for the specified dimension_values */
                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                    /** Unit price for the specified dimension_values */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun unitAmount(unitAmount: JsonField<String>) = apply {
                        this.unitAmount = unitAmount
                    }

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    fun dimensionValues(dimensionValues: List<String?>) =
                        dimensionValues(JsonField.of(dimensionValues))

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                        this.dimensionValues = dimensionValues
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): MatrixValue =
                        MatrixValue(
                            unitAmount,
                            dimensionValues.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val MATRIX = ModelType(JsonField.of("matrix"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                MATRIX,
            }

            enum class Value {
                MATRIX,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MATRIX -> Value.MATRIX
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MATRIX -> Known.MATRIX
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = TieredPrice.Builder::class)
    @NoAutoDetect
    class TieredPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val tieredConfig: JsonField<TieredConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun tieredConfig(): TieredConfig = tieredConfig.getRequired("tiered_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("tiered_config") @ExcludeMissing fun _tieredConfig() = tieredConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TieredPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                tieredConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TieredPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.tieredConfig == other.tieredConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        tieredConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TieredPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, tieredConfig=$tieredConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var tieredConfig: JsonField<TieredConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tieredPrice: TieredPrice) = apply {
                this.id = tieredPrice.id
                this.name = tieredPrice.name
                this.externalPriceId = tieredPrice.externalPriceId
                this.priceType = tieredPrice.priceType
                this.modelType = tieredPrice.modelType
                this.createdAt = tieredPrice.createdAt
                this.cadence = tieredPrice.cadence
                this.billableMetric = tieredPrice.billableMetric
                this.fixedPriceQuantity = tieredPrice.fixedPriceQuantity
                this.planPhaseOrder = tieredPrice.planPhaseOrder
                this.currency = tieredPrice.currency
                this.conversionRate = tieredPrice.conversionRate
                this.item = tieredPrice.item
                this.creditAllocation = tieredPrice.creditAllocation
                this.discount = tieredPrice.discount
                this.minimum = tieredPrice.minimum
                this.minimumAmount = tieredPrice.minimumAmount
                this.maximum = tieredPrice.maximum
                this.maximumAmount = tieredPrice.maximumAmount
                this.tieredConfig = tieredPrice.tieredConfig
                additionalProperties(tieredPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun tieredConfig(tieredConfig: TieredConfig) = tieredConfig(JsonField.of(tieredConfig))

            @JsonProperty("tiered_config")
            @ExcludeMissing
            fun tieredConfig(tieredConfig: JsonField<TieredConfig>) = apply {
                this.tieredConfig = tieredConfig
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

            fun build(): TieredPrice =
                TieredPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    tieredConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED = ModelType(JsonField.of("tiered"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED,
            }

            enum class Value {
                TIERED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED -> Value.TIERED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED -> Known.TIERED
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = TieredConfig.Builder::class)
        @NoAutoDetect
        class TieredConfig
        private constructor(
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Tiers for rating based on total usage quantities into the specified tier */
            fun tiers(): List<Tier> = tiers.getRequired("tiers")

            /** Tiers for rating based on total usage quantities into the specified tier */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TieredConfig = apply {
                if (!validated) {
                    tiers().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TieredConfig &&
                    this.tiers == other.tiers &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(tiers, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "TieredConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredConfig: TieredConfig) = apply {
                    this.tiers = tieredConfig.tiers
                    additionalProperties(tieredConfig.additionalProperties)
                }

                /** Tiers for rating based on total usage quantities into the specified tier */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /** Tiers for rating based on total usage quantities into the specified tier */
                @JsonProperty("tiers")
                @ExcludeMissing
                fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredConfig =
                    TieredConfig(
                        tiers.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Tier.Builder::class)
            @NoAutoDetect
            class Tier
            private constructor(
                private val firstUnit: JsonField<Double>,
                private val lastUnit: JsonField<Double>,
                private val unitAmount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Inclusive tier starting value */
                fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                /** Exclusive tier ending value. If null, this is treated as the last tier */
                fun lastUnit(): Double? = lastUnit.getNullable("last_unit")

                /** Amount per unit */
                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                /** Inclusive tier starting value */
                @JsonProperty("first_unit") @ExcludeMissing fun _firstUnit() = firstUnit

                /** Exclusive tier ending value. If null, this is treated as the last tier */
                @JsonProperty("last_unit") @ExcludeMissing fun _lastUnit() = lastUnit

                /** Amount per unit */
                @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Tier = apply {
                    if (!validated) {
                        firstUnit()
                        lastUnit()
                        unitAmount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        this.firstUnit == other.firstUnit &&
                        this.lastUnit == other.lastUnit &&
                        this.unitAmount == other.unitAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                firstUnit,
                                lastUnit,
                                unitAmount,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Tier{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var firstUnit: JsonField<Double> = JsonMissing.of()
                    private var lastUnit: JsonField<Double> = JsonMissing.of()
                    private var unitAmount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        this.firstUnit = tier.firstUnit
                        this.lastUnit = tier.lastUnit
                        this.unitAmount = tier.unitAmount
                        additionalProperties(tier.additionalProperties)
                    }

                    /** Inclusive tier starting value */
                    fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

                    /** Inclusive tier starting value */
                    @JsonProperty("first_unit")
                    @ExcludeMissing
                    fun firstUnit(firstUnit: JsonField<Double>) = apply {
                        this.firstUnit = firstUnit
                    }

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    fun lastUnit(lastUnit: Double) = lastUnit(JsonField.of(lastUnit))

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    @JsonProperty("last_unit")
                    @ExcludeMissing
                    fun lastUnit(lastUnit: JsonField<Double>) = apply { this.lastUnit = lastUnit }

                    /** Amount per unit */
                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                    /** Amount per unit */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun unitAmount(unitAmount: JsonField<String>) = apply {
                        this.unitAmount = unitAmount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Tier =
                        Tier(
                            firstUnit,
                            lastUnit,
                            unitAmount,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }
    }

    @JsonDeserialize(builder = TieredBpsPrice.Builder::class)
    @NoAutoDetect
    class TieredBpsPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val tieredBpsConfig: JsonField<TieredBpsConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun tieredBpsConfig(): TieredBpsConfig = tieredBpsConfig.getRequired("tiered_bps_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("tiered_bps_config") @ExcludeMissing fun _tieredBpsConfig() = tieredBpsConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TieredBpsPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                tieredBpsConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TieredBpsPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.tieredBpsConfig == other.tieredBpsConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        tieredBpsConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TieredBpsPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, tieredBpsConfig=$tieredBpsConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var tieredBpsConfig: JsonField<TieredBpsConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tieredBpsPrice: TieredBpsPrice) = apply {
                this.id = tieredBpsPrice.id
                this.name = tieredBpsPrice.name
                this.externalPriceId = tieredBpsPrice.externalPriceId
                this.priceType = tieredBpsPrice.priceType
                this.modelType = tieredBpsPrice.modelType
                this.createdAt = tieredBpsPrice.createdAt
                this.cadence = tieredBpsPrice.cadence
                this.billableMetric = tieredBpsPrice.billableMetric
                this.fixedPriceQuantity = tieredBpsPrice.fixedPriceQuantity
                this.planPhaseOrder = tieredBpsPrice.planPhaseOrder
                this.currency = tieredBpsPrice.currency
                this.conversionRate = tieredBpsPrice.conversionRate
                this.item = tieredBpsPrice.item
                this.creditAllocation = tieredBpsPrice.creditAllocation
                this.discount = tieredBpsPrice.discount
                this.minimum = tieredBpsPrice.minimum
                this.minimumAmount = tieredBpsPrice.minimumAmount
                this.maximum = tieredBpsPrice.maximum
                this.maximumAmount = tieredBpsPrice.maximumAmount
                this.tieredBpsConfig = tieredBpsPrice.tieredBpsConfig
                additionalProperties(tieredBpsPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun tieredBpsConfig(tieredBpsConfig: TieredBpsConfig) =
                tieredBpsConfig(JsonField.of(tieredBpsConfig))

            @JsonProperty("tiered_bps_config")
            @ExcludeMissing
            fun tieredBpsConfig(tieredBpsConfig: JsonField<TieredBpsConfig>) = apply {
                this.tieredBpsConfig = tieredBpsConfig
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

            fun build(): TieredBpsPrice =
                TieredBpsPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    tieredBpsConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_BPS = ModelType(JsonField.of("tiered_bps"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_BPS,
            }

            enum class Value {
                TIERED_BPS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_BPS -> Value.TIERED_BPS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_BPS -> Known.TIERED_BPS
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = TieredBpsConfig.Builder::class)
        @NoAutoDetect
        class TieredBpsConfig
        private constructor(
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified tiers
             */
            fun tiers(): List<Tier> = tiers.getRequired("tiers")

            /**
             * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified tiers
             */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TieredBpsConfig = apply {
                if (!validated) {
                    tiers().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TieredBpsConfig &&
                    this.tiers == other.tiers &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(tiers, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "TieredBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredBpsConfig: TieredBpsConfig) = apply {
                    this.tiers = tieredBpsConfig.tiers
                    additionalProperties(tieredBpsConfig.additionalProperties)
                }

                /**
                 * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified
                 * tiers
                 */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /**
                 * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified
                 * tiers
                 */
                @JsonProperty("tiers")
                @ExcludeMissing
                fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredBpsConfig =
                    TieredBpsConfig(
                        tiers.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Tier.Builder::class)
            @NoAutoDetect
            class Tier
            private constructor(
                private val minimumAmount: JsonField<String>,
                private val maximumAmount: JsonField<String>,
                private val bps: JsonField<Double>,
                private val perUnitMaximum: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Inclusive tier starting value */
                fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                /** Exclusive tier ending value */
                fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

                /** Per-event basis point rate */
                fun bps(): Double = bps.getRequired("bps")

                /** Per unit maximum to charge */
                fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

                /** Inclusive tier starting value */
                @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

                /** Exclusive tier ending value */
                @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

                /** Per-event basis point rate */
                @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                /** Per unit maximum to charge */
                @JsonProperty("per_unit_maximum")
                @ExcludeMissing
                fun _perUnitMaximum() = perUnitMaximum

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Tier = apply {
                    if (!validated) {
                        minimumAmount()
                        maximumAmount()
                        bps()
                        perUnitMaximum()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        this.minimumAmount == other.minimumAmount &&
                        this.maximumAmount == other.maximumAmount &&
                        this.bps == other.bps &&
                        this.perUnitMaximum == other.perUnitMaximum &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                minimumAmount,
                                maximumAmount,
                                bps,
                                perUnitMaximum,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Tier{minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var minimumAmount: JsonField<String> = JsonMissing.of()
                    private var maximumAmount: JsonField<String> = JsonMissing.of()
                    private var bps: JsonField<Double> = JsonMissing.of()
                    private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        this.minimumAmount = tier.minimumAmount
                        this.maximumAmount = tier.maximumAmount
                        this.bps = tier.bps
                        this.perUnitMaximum = tier.perUnitMaximum
                        additionalProperties(tier.additionalProperties)
                    }

                    /** Inclusive tier starting value */
                    fun minimumAmount(minimumAmount: String) =
                        minimumAmount(JsonField.of(minimumAmount))

                    /** Inclusive tier starting value */
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /** Exclusive tier ending value */
                    fun maximumAmount(maximumAmount: String) =
                        maximumAmount(JsonField.of(maximumAmount))

                    /** Exclusive tier ending value */
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** Per-event basis point rate */
                    fun bps(bps: Double) = bps(JsonField.of(bps))

                    /** Per-event basis point rate */
                    @JsonProperty("bps")
                    @ExcludeMissing
                    fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                    /** Per unit maximum to charge */
                    fun perUnitMaximum(perUnitMaximum: String) =
                        perUnitMaximum(JsonField.of(perUnitMaximum))

                    /** Per unit maximum to charge */
                    @JsonProperty("per_unit_maximum")
                    @ExcludeMissing
                    fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                        this.perUnitMaximum = perUnitMaximum
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Tier =
                        Tier(
                            minimumAmount,
                            maximumAmount,
                            bps,
                            perUnitMaximum,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }
    }

    @JsonDeserialize(builder = BpsPrice.Builder::class)
    @NoAutoDetect
    class BpsPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val bpsConfig: JsonField<BpsConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun bpsConfig(): BpsConfig = bpsConfig.getRequired("bps_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("bps_config") @ExcludeMissing fun _bpsConfig() = bpsConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BpsPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                bpsConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BpsPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.bpsConfig == other.bpsConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        bpsConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BpsPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, bpsConfig=$bpsConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var bpsConfig: JsonField<BpsConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bpsPrice: BpsPrice) = apply {
                this.id = bpsPrice.id
                this.name = bpsPrice.name
                this.externalPriceId = bpsPrice.externalPriceId
                this.priceType = bpsPrice.priceType
                this.modelType = bpsPrice.modelType
                this.createdAt = bpsPrice.createdAt
                this.cadence = bpsPrice.cadence
                this.billableMetric = bpsPrice.billableMetric
                this.fixedPriceQuantity = bpsPrice.fixedPriceQuantity
                this.planPhaseOrder = bpsPrice.planPhaseOrder
                this.currency = bpsPrice.currency
                this.conversionRate = bpsPrice.conversionRate
                this.item = bpsPrice.item
                this.creditAllocation = bpsPrice.creditAllocation
                this.discount = bpsPrice.discount
                this.minimum = bpsPrice.minimum
                this.minimumAmount = bpsPrice.minimumAmount
                this.maximum = bpsPrice.maximum
                this.maximumAmount = bpsPrice.maximumAmount
                this.bpsConfig = bpsPrice.bpsConfig
                additionalProperties(bpsPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun bpsConfig(bpsConfig: BpsConfig) = bpsConfig(JsonField.of(bpsConfig))

            @JsonProperty("bps_config")
            @ExcludeMissing
            fun bpsConfig(bpsConfig: JsonField<BpsConfig>) = apply { this.bpsConfig = bpsConfig }

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

            fun build(): BpsPrice =
                BpsPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    bpsConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = BpsConfig.Builder::class)
        @NoAutoDetect
        class BpsConfig
        private constructor(
            private val bps: JsonField<Double>,
            private val perUnitMaximum: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Basis point take rate per event */
            fun bps(): Double = bps.getRequired("bps")

            /** Optional currency amount maximum to cap spend per event */
            fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

            /** Basis point take rate per event */
            @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

            /** Optional currency amount maximum to cap spend per event */
            @JsonProperty("per_unit_maximum") @ExcludeMissing fun _perUnitMaximum() = perUnitMaximum

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BpsConfig = apply {
                if (!validated) {
                    bps()
                    perUnitMaximum()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BpsConfig &&
                    this.bps == other.bps &&
                    this.perUnitMaximum == other.perUnitMaximum &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            bps,
                            perUnitMaximum,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "BpsConfig{bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var bps: JsonField<Double> = JsonMissing.of()
                private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bpsConfig: BpsConfig) = apply {
                    this.bps = bpsConfig.bps
                    this.perUnitMaximum = bpsConfig.perUnitMaximum
                    additionalProperties(bpsConfig.additionalProperties)
                }

                /** Basis point take rate per event */
                fun bps(bps: Double) = bps(JsonField.of(bps))

                /** Basis point take rate per event */
                @JsonProperty("bps")
                @ExcludeMissing
                fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                /** Optional currency amount maximum to cap spend per event */
                fun perUnitMaximum(perUnitMaximum: String) =
                    perUnitMaximum(JsonField.of(perUnitMaximum))

                /** Optional currency amount maximum to cap spend per event */
                @JsonProperty("per_unit_maximum")
                @ExcludeMissing
                fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                    this.perUnitMaximum = perUnitMaximum
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BpsConfig =
                    BpsConfig(
                        bps,
                        perUnitMaximum,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BPS = ModelType(JsonField.of("bps"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                BPS,
            }

            enum class Value {
                BPS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BPS -> Value.BPS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BPS -> Known.BPS
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = BulkBpsPrice.Builder::class)
    @NoAutoDetect
    class BulkBpsPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val bulkBpsConfig: JsonField<BulkBpsConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun bulkBpsConfig(): BulkBpsConfig = bulkBpsConfig.getRequired("bulk_bps_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("bulk_bps_config") @ExcludeMissing fun _bulkBpsConfig() = bulkBpsConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BulkBpsPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                bulkBpsConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BulkBpsPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.bulkBpsConfig == other.bulkBpsConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        bulkBpsConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BulkBpsPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, bulkBpsConfig=$bulkBpsConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var bulkBpsConfig: JsonField<BulkBpsConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bulkBpsPrice: BulkBpsPrice) = apply {
                this.id = bulkBpsPrice.id
                this.name = bulkBpsPrice.name
                this.externalPriceId = bulkBpsPrice.externalPriceId
                this.priceType = bulkBpsPrice.priceType
                this.modelType = bulkBpsPrice.modelType
                this.createdAt = bulkBpsPrice.createdAt
                this.cadence = bulkBpsPrice.cadence
                this.billableMetric = bulkBpsPrice.billableMetric
                this.fixedPriceQuantity = bulkBpsPrice.fixedPriceQuantity
                this.planPhaseOrder = bulkBpsPrice.planPhaseOrder
                this.currency = bulkBpsPrice.currency
                this.conversionRate = bulkBpsPrice.conversionRate
                this.item = bulkBpsPrice.item
                this.creditAllocation = bulkBpsPrice.creditAllocation
                this.discount = bulkBpsPrice.discount
                this.minimum = bulkBpsPrice.minimum
                this.minimumAmount = bulkBpsPrice.minimumAmount
                this.maximum = bulkBpsPrice.maximum
                this.maximumAmount = bulkBpsPrice.maximumAmount
                this.bulkBpsConfig = bulkBpsPrice.bulkBpsConfig
                additionalProperties(bulkBpsPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun bulkBpsConfig(bulkBpsConfig: BulkBpsConfig) =
                bulkBpsConfig(JsonField.of(bulkBpsConfig))

            @JsonProperty("bulk_bps_config")
            @ExcludeMissing
            fun bulkBpsConfig(bulkBpsConfig: JsonField<BulkBpsConfig>) = apply {
                this.bulkBpsConfig = bulkBpsConfig
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

            fun build(): BulkBpsPrice =
                BulkBpsPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    bulkBpsConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = BulkBpsConfig.Builder::class)
        @NoAutoDetect
        class BulkBpsConfig
        private constructor(
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
             * based on total volume
             */
            fun tiers(): List<Tier> = tiers.getRequired("tiers")

            /**
             * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
             * based on total volume
             */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BulkBpsConfig = apply {
                if (!validated) {
                    tiers().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BulkBpsConfig &&
                    this.tiers == other.tiers &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(tiers, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BulkBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bulkBpsConfig: BulkBpsConfig) = apply {
                    this.tiers = bulkBpsConfig.tiers
                    additionalProperties(bulkBpsConfig.additionalProperties)
                }

                /**
                 * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
                 * based on total volume
                 */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /**
                 * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
                 * based on total volume
                 */
                @JsonProperty("tiers")
                @ExcludeMissing
                fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BulkBpsConfig =
                    BulkBpsConfig(
                        tiers.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Tier.Builder::class)
            @NoAutoDetect
            class Tier
            private constructor(
                private val maximumAmount: JsonField<String>,
                private val bps: JsonField<Double>,
                private val perUnitMaximum: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Upper bound for tier */
                fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

                /** Basis points to rate on */
                fun bps(): Double = bps.getRequired("bps")

                /** The maximum amount to charge for any one event */
                fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

                /** Upper bound for tier */
                @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

                /** Basis points to rate on */
                @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                /** The maximum amount to charge for any one event */
                @JsonProperty("per_unit_maximum")
                @ExcludeMissing
                fun _perUnitMaximum() = perUnitMaximum

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Tier = apply {
                    if (!validated) {
                        maximumAmount()
                        bps()
                        perUnitMaximum()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        this.maximumAmount == other.maximumAmount &&
                        this.bps == other.bps &&
                        this.perUnitMaximum == other.perUnitMaximum &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                maximumAmount,
                                bps,
                                perUnitMaximum,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Tier{maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var maximumAmount: JsonField<String> = JsonMissing.of()
                    private var bps: JsonField<Double> = JsonMissing.of()
                    private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        this.maximumAmount = tier.maximumAmount
                        this.bps = tier.bps
                        this.perUnitMaximum = tier.perUnitMaximum
                        additionalProperties(tier.additionalProperties)
                    }

                    /** Upper bound for tier */
                    fun maximumAmount(maximumAmount: String) =
                        maximumAmount(JsonField.of(maximumAmount))

                    /** Upper bound for tier */
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** Basis points to rate on */
                    fun bps(bps: Double) = bps(JsonField.of(bps))

                    /** Basis points to rate on */
                    @JsonProperty("bps")
                    @ExcludeMissing
                    fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                    /** The maximum amount to charge for any one event */
                    fun perUnitMaximum(perUnitMaximum: String) =
                        perUnitMaximum(JsonField.of(perUnitMaximum))

                    /** The maximum amount to charge for any one event */
                    @JsonProperty("per_unit_maximum")
                    @ExcludeMissing
                    fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                        this.perUnitMaximum = perUnitMaximum
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Tier =
                        Tier(
                            maximumAmount,
                            bps,
                            perUnitMaximum,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BULK_BPS = ModelType(JsonField.of("bulk_bps"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                BULK_BPS,
            }

            enum class Value {
                BULK_BPS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BULK_BPS -> Value.BULK_BPS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BULK_BPS -> Known.BULK_BPS
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = BulkPrice.Builder::class)
    @NoAutoDetect
    class BulkPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val bulkConfig: JsonField<BulkConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun bulkConfig(): BulkConfig = bulkConfig.getRequired("bulk_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("bulk_config") @ExcludeMissing fun _bulkConfig() = bulkConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BulkPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                bulkConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BulkPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.bulkConfig == other.bulkConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        bulkConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BulkPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, bulkConfig=$bulkConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var bulkConfig: JsonField<BulkConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bulkPrice: BulkPrice) = apply {
                this.id = bulkPrice.id
                this.name = bulkPrice.name
                this.externalPriceId = bulkPrice.externalPriceId
                this.priceType = bulkPrice.priceType
                this.modelType = bulkPrice.modelType
                this.createdAt = bulkPrice.createdAt
                this.cadence = bulkPrice.cadence
                this.billableMetric = bulkPrice.billableMetric
                this.fixedPriceQuantity = bulkPrice.fixedPriceQuantity
                this.planPhaseOrder = bulkPrice.planPhaseOrder
                this.currency = bulkPrice.currency
                this.conversionRate = bulkPrice.conversionRate
                this.item = bulkPrice.item
                this.creditAllocation = bulkPrice.creditAllocation
                this.discount = bulkPrice.discount
                this.minimum = bulkPrice.minimum
                this.minimumAmount = bulkPrice.minimumAmount
                this.maximum = bulkPrice.maximum
                this.maximumAmount = bulkPrice.maximumAmount
                this.bulkConfig = bulkPrice.bulkConfig
                additionalProperties(bulkPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun bulkConfig(bulkConfig: BulkConfig) = bulkConfig(JsonField.of(bulkConfig))

            @JsonProperty("bulk_config")
            @ExcludeMissing
            fun bulkConfig(bulkConfig: JsonField<BulkConfig>) = apply {
                this.bulkConfig = bulkConfig
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

            fun build(): BulkPrice =
                BulkPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    bulkConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = BulkConfig.Builder::class)
        @NoAutoDetect
        class BulkConfig
        private constructor(
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Bulk tiers for rating based on total usage volume */
            fun tiers(): List<Tier> = tiers.getRequired("tiers")

            /** Bulk tiers for rating based on total usage volume */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BulkConfig = apply {
                if (!validated) {
                    tiers().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BulkConfig &&
                    this.tiers == other.tiers &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(tiers, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BulkConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bulkConfig: BulkConfig) = apply {
                    this.tiers = bulkConfig.tiers
                    additionalProperties(bulkConfig.additionalProperties)
                }

                /** Bulk tiers for rating based on total usage volume */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /** Bulk tiers for rating based on total usage volume */
                @JsonProperty("tiers")
                @ExcludeMissing
                fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BulkConfig =
                    BulkConfig(
                        tiers.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Tier.Builder::class)
            @NoAutoDetect
            class Tier
            private constructor(
                private val maximumUnits: JsonField<Double>,
                private val unitAmount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Upper bound for this tier */
                fun maximumUnits(): Double? = maximumUnits.getNullable("maximum_units")

                /** Amount per unit */
                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                /** Upper bound for this tier */
                @JsonProperty("maximum_units") @ExcludeMissing fun _maximumUnits() = maximumUnits

                /** Amount per unit */
                @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Tier = apply {
                    if (!validated) {
                        maximumUnits()
                        unitAmount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        this.maximumUnits == other.maximumUnits &&
                        this.unitAmount == other.unitAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                maximumUnits,
                                unitAmount,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Tier{maximumUnits=$maximumUnits, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var maximumUnits: JsonField<Double> = JsonMissing.of()
                    private var unitAmount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        this.maximumUnits = tier.maximumUnits
                        this.unitAmount = tier.unitAmount
                        additionalProperties(tier.additionalProperties)
                    }

                    /** Upper bound for this tier */
                    fun maximumUnits(maximumUnits: Double) =
                        maximumUnits(JsonField.of(maximumUnits))

                    /** Upper bound for this tier */
                    @JsonProperty("maximum_units")
                    @ExcludeMissing
                    fun maximumUnits(maximumUnits: JsonField<Double>) = apply {
                        this.maximumUnits = maximumUnits
                    }

                    /** Amount per unit */
                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                    /** Amount per unit */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun unitAmount(unitAmount: JsonField<String>) = apply {
                        this.unitAmount = unitAmount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Tier =
                        Tier(
                            maximumUnits,
                            unitAmount,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BULK = ModelType(JsonField.of("bulk"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                BULK,
            }

            enum class Value {
                BULK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BULK -> Value.BULK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BULK -> Known.BULK
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = ThresholdTotalAmountPrice.Builder::class)
    @NoAutoDetect
    class ThresholdTotalAmountPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun thresholdTotalAmountConfig(): ThresholdTotalAmountConfig =
            thresholdTotalAmountConfig.getRequired("threshold_total_amount_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("threshold_total_amount_config")
        @ExcludeMissing
        fun _thresholdTotalAmountConfig() = thresholdTotalAmountConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ThresholdTotalAmountPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                thresholdTotalAmountConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ThresholdTotalAmountPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.thresholdTotalAmountConfig == other.thresholdTotalAmountConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        thresholdTotalAmountConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ThresholdTotalAmountPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, thresholdTotalAmountConfig=$thresholdTotalAmountConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(thresholdTotalAmountPrice: ThresholdTotalAmountPrice) = apply {
                this.id = thresholdTotalAmountPrice.id
                this.name = thresholdTotalAmountPrice.name
                this.externalPriceId = thresholdTotalAmountPrice.externalPriceId
                this.priceType = thresholdTotalAmountPrice.priceType
                this.modelType = thresholdTotalAmountPrice.modelType
                this.createdAt = thresholdTotalAmountPrice.createdAt
                this.cadence = thresholdTotalAmountPrice.cadence
                this.billableMetric = thresholdTotalAmountPrice.billableMetric
                this.fixedPriceQuantity = thresholdTotalAmountPrice.fixedPriceQuantity
                this.planPhaseOrder = thresholdTotalAmountPrice.planPhaseOrder
                this.currency = thresholdTotalAmountPrice.currency
                this.conversionRate = thresholdTotalAmountPrice.conversionRate
                this.item = thresholdTotalAmountPrice.item
                this.creditAllocation = thresholdTotalAmountPrice.creditAllocation
                this.discount = thresholdTotalAmountPrice.discount
                this.minimum = thresholdTotalAmountPrice.minimum
                this.minimumAmount = thresholdTotalAmountPrice.minimumAmount
                this.maximum = thresholdTotalAmountPrice.maximum
                this.maximumAmount = thresholdTotalAmountPrice.maximumAmount
                this.thresholdTotalAmountConfig =
                    thresholdTotalAmountPrice.thresholdTotalAmountConfig
                additionalProperties(thresholdTotalAmountPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun thresholdTotalAmountConfig(thresholdTotalAmountConfig: ThresholdTotalAmountConfig) =
                thresholdTotalAmountConfig(JsonField.of(thresholdTotalAmountConfig))

            @JsonProperty("threshold_total_amount_config")
            @ExcludeMissing
            fun thresholdTotalAmountConfig(
                thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig>
            ) = apply { this.thresholdTotalAmountConfig = thresholdTotalAmountConfig }

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

            fun build(): ThresholdTotalAmountPrice =
                ThresholdTotalAmountPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    thresholdTotalAmountConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val THRESHOLD_TOTAL_AMOUNT = ModelType(JsonField.of("threshold_total_amount"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                THRESHOLD_TOTAL_AMOUNT,
            }

            enum class Value {
                THRESHOLD_TOTAL_AMOUNT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    THRESHOLD_TOTAL_AMOUNT -> Value.THRESHOLD_TOTAL_AMOUNT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    THRESHOLD_TOTAL_AMOUNT -> Known.THRESHOLD_TOTAL_AMOUNT
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = ThresholdTotalAmountConfig.Builder::class)
        @NoAutoDetect
        class ThresholdTotalAmountConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ThresholdTotalAmountConfig = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ThresholdTotalAmountConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "ThresholdTotalAmountConfig{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(thresholdTotalAmountConfig: ThresholdTotalAmountConfig) = apply {
                    additionalProperties(thresholdTotalAmountConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ThresholdTotalAmountConfig =
                    ThresholdTotalAmountConfig(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = TieredPackagePrice.Builder::class)
    @NoAutoDetect
    class TieredPackagePrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val tieredPackageConfig: JsonField<TieredPackageConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun tieredPackageConfig(): TieredPackageConfig =
            tieredPackageConfig.getRequired("tiered_package_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("tiered_package_config")
        @ExcludeMissing
        fun _tieredPackageConfig() = tieredPackageConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TieredPackagePrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                tieredPackageConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TieredPackagePrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.tieredPackageConfig == other.tieredPackageConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        tieredPackageConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TieredPackagePrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, tieredPackageConfig=$tieredPackageConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var tieredPackageConfig: JsonField<TieredPackageConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tieredPackagePrice: TieredPackagePrice) = apply {
                this.id = tieredPackagePrice.id
                this.name = tieredPackagePrice.name
                this.externalPriceId = tieredPackagePrice.externalPriceId
                this.priceType = tieredPackagePrice.priceType
                this.modelType = tieredPackagePrice.modelType
                this.createdAt = tieredPackagePrice.createdAt
                this.cadence = tieredPackagePrice.cadence
                this.billableMetric = tieredPackagePrice.billableMetric
                this.fixedPriceQuantity = tieredPackagePrice.fixedPriceQuantity
                this.planPhaseOrder = tieredPackagePrice.planPhaseOrder
                this.currency = tieredPackagePrice.currency
                this.conversionRate = tieredPackagePrice.conversionRate
                this.item = tieredPackagePrice.item
                this.creditAllocation = tieredPackagePrice.creditAllocation
                this.discount = tieredPackagePrice.discount
                this.minimum = tieredPackagePrice.minimum
                this.minimumAmount = tieredPackagePrice.minimumAmount
                this.maximum = tieredPackagePrice.maximum
                this.maximumAmount = tieredPackagePrice.maximumAmount
                this.tieredPackageConfig = tieredPackagePrice.tieredPackageConfig
                additionalProperties(tieredPackagePrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun tieredPackageConfig(tieredPackageConfig: TieredPackageConfig) =
                tieredPackageConfig(JsonField.of(tieredPackageConfig))

            @JsonProperty("tiered_package_config")
            @ExcludeMissing
            fun tieredPackageConfig(tieredPackageConfig: JsonField<TieredPackageConfig>) = apply {
                this.tieredPackageConfig = tieredPackageConfig
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

            fun build(): TieredPackagePrice =
                TieredPackagePrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    tieredPackageConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_PACKAGE = ModelType(JsonField.of("tiered_package"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_PACKAGE,
            }

            enum class Value {
                TIERED_PACKAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_PACKAGE -> Value.TIERED_PACKAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_PACKAGE -> Known.TIERED_PACKAGE
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = TieredPackageConfig.Builder::class)
        @NoAutoDetect
        class TieredPackageConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TieredPackageConfig = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TieredPackageConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "TieredPackageConfig{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredPackageConfig: TieredPackageConfig) = apply {
                    additionalProperties(tieredPackageConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredPackageConfig =
                    TieredPackageConfig(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = GroupedTieredPrice.Builder::class)
    @NoAutoDetect
    class GroupedTieredPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val groupedTieredConfig: JsonField<GroupedTieredConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun groupedTieredConfig(): GroupedTieredConfig =
            groupedTieredConfig.getRequired("grouped_tiered_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("grouped_tiered_config")
        @ExcludeMissing
        fun _groupedTieredConfig() = groupedTieredConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): GroupedTieredPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                groupedTieredConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GroupedTieredPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.groupedTieredConfig == other.groupedTieredConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        groupedTieredConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "GroupedTieredPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, groupedTieredConfig=$groupedTieredConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var groupedTieredConfig: JsonField<GroupedTieredConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(groupedTieredPrice: GroupedTieredPrice) = apply {
                this.id = groupedTieredPrice.id
                this.name = groupedTieredPrice.name
                this.externalPriceId = groupedTieredPrice.externalPriceId
                this.priceType = groupedTieredPrice.priceType
                this.modelType = groupedTieredPrice.modelType
                this.createdAt = groupedTieredPrice.createdAt
                this.cadence = groupedTieredPrice.cadence
                this.billableMetric = groupedTieredPrice.billableMetric
                this.fixedPriceQuantity = groupedTieredPrice.fixedPriceQuantity
                this.planPhaseOrder = groupedTieredPrice.planPhaseOrder
                this.currency = groupedTieredPrice.currency
                this.conversionRate = groupedTieredPrice.conversionRate
                this.item = groupedTieredPrice.item
                this.creditAllocation = groupedTieredPrice.creditAllocation
                this.discount = groupedTieredPrice.discount
                this.minimum = groupedTieredPrice.minimum
                this.minimumAmount = groupedTieredPrice.minimumAmount
                this.maximum = groupedTieredPrice.maximum
                this.maximumAmount = groupedTieredPrice.maximumAmount
                this.groupedTieredConfig = groupedTieredPrice.groupedTieredConfig
                additionalProperties(groupedTieredPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun groupedTieredConfig(groupedTieredConfig: GroupedTieredConfig) =
                groupedTieredConfig(JsonField.of(groupedTieredConfig))

            @JsonProperty("grouped_tiered_config")
            @ExcludeMissing
            fun groupedTieredConfig(groupedTieredConfig: JsonField<GroupedTieredConfig>) = apply {
                this.groupedTieredConfig = groupedTieredConfig
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

            fun build(): GroupedTieredPrice =
                GroupedTieredPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    groupedTieredConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = GroupedTieredConfig.Builder::class)
        @NoAutoDetect
        class GroupedTieredConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): GroupedTieredConfig = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GroupedTieredConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "GroupedTieredConfig{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(groupedTieredConfig: GroupedTieredConfig) = apply {
                    additionalProperties(groupedTieredConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GroupedTieredConfig =
                    GroupedTieredConfig(additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val GROUPED_TIERED = ModelType(JsonField.of("grouped_tiered"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                GROUPED_TIERED,
            }

            enum class Value {
                GROUPED_TIERED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    GROUPED_TIERED -> Value.GROUPED_TIERED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    GROUPED_TIERED -> Known.GROUPED_TIERED
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = TieredWithMinimumPrice.Builder::class)
    @NoAutoDetect
    class TieredWithMinimumPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun tieredWithMinimumConfig(): TieredWithMinimumConfig =
            tieredWithMinimumConfig.getRequired("tiered_with_minimum_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("tiered_with_minimum_config")
        @ExcludeMissing
        fun _tieredWithMinimumConfig() = tieredWithMinimumConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TieredWithMinimumPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                tieredWithMinimumConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TieredWithMinimumPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.tieredWithMinimumConfig == other.tieredWithMinimumConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        tieredWithMinimumConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TieredWithMinimumPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, tieredWithMinimumConfig=$tieredWithMinimumConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tieredWithMinimumPrice: TieredWithMinimumPrice) = apply {
                this.id = tieredWithMinimumPrice.id
                this.name = tieredWithMinimumPrice.name
                this.externalPriceId = tieredWithMinimumPrice.externalPriceId
                this.priceType = tieredWithMinimumPrice.priceType
                this.modelType = tieredWithMinimumPrice.modelType
                this.createdAt = tieredWithMinimumPrice.createdAt
                this.cadence = tieredWithMinimumPrice.cadence
                this.billableMetric = tieredWithMinimumPrice.billableMetric
                this.fixedPriceQuantity = tieredWithMinimumPrice.fixedPriceQuantity
                this.planPhaseOrder = tieredWithMinimumPrice.planPhaseOrder
                this.currency = tieredWithMinimumPrice.currency
                this.conversionRate = tieredWithMinimumPrice.conversionRate
                this.item = tieredWithMinimumPrice.item
                this.creditAllocation = tieredWithMinimumPrice.creditAllocation
                this.discount = tieredWithMinimumPrice.discount
                this.minimum = tieredWithMinimumPrice.minimum
                this.minimumAmount = tieredWithMinimumPrice.minimumAmount
                this.maximum = tieredWithMinimumPrice.maximum
                this.maximumAmount = tieredWithMinimumPrice.maximumAmount
                this.tieredWithMinimumConfig = tieredWithMinimumPrice.tieredWithMinimumConfig
                additionalProperties(tieredWithMinimumPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun tieredWithMinimumConfig(tieredWithMinimumConfig: TieredWithMinimumConfig) =
                tieredWithMinimumConfig(JsonField.of(tieredWithMinimumConfig))

            @JsonProperty("tiered_with_minimum_config")
            @ExcludeMissing
            fun tieredWithMinimumConfig(
                tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig>
            ) = apply { this.tieredWithMinimumConfig = tieredWithMinimumConfig }

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

            fun build(): TieredWithMinimumPrice =
                TieredWithMinimumPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    tieredWithMinimumConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_WITH_MINIMUM = ModelType(JsonField.of("tiered_with_minimum"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_WITH_MINIMUM,
            }

            enum class Value {
                TIERED_WITH_MINIMUM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_WITH_MINIMUM -> Value.TIERED_WITH_MINIMUM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_WITH_MINIMUM -> Known.TIERED_WITH_MINIMUM
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = TieredWithMinimumConfig.Builder::class)
        @NoAutoDetect
        class TieredWithMinimumConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TieredWithMinimumConfig = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TieredWithMinimumConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "TieredWithMinimumConfig{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredWithMinimumConfig: TieredWithMinimumConfig) = apply {
                    additionalProperties(tieredWithMinimumConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredWithMinimumConfig =
                    TieredWithMinimumConfig(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = TieredPackageWithMinimumPrice.Builder::class)
    @NoAutoDetect
    class TieredPackageWithMinimumPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val tieredPackageWithMinimumConfig: JsonField<TieredPackageWithMinimumConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun tieredPackageWithMinimumConfig(): TieredPackageWithMinimumConfig =
            tieredPackageWithMinimumConfig.getRequired("tiered_package_with_minimum_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("tiered_package_with_minimum_config")
        @ExcludeMissing
        fun _tieredPackageWithMinimumConfig() = tieredPackageWithMinimumConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TieredPackageWithMinimumPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                tieredPackageWithMinimumConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TieredPackageWithMinimumPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.tieredPackageWithMinimumConfig == other.tieredPackageWithMinimumConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        tieredPackageWithMinimumConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TieredPackageWithMinimumPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, tieredPackageWithMinimumConfig=$tieredPackageWithMinimumConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var tieredPackageWithMinimumConfig: JsonField<TieredPackageWithMinimumConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tieredPackageWithMinimumPrice: TieredPackageWithMinimumPrice) =
                apply {
                    this.id = tieredPackageWithMinimumPrice.id
                    this.name = tieredPackageWithMinimumPrice.name
                    this.externalPriceId = tieredPackageWithMinimumPrice.externalPriceId
                    this.priceType = tieredPackageWithMinimumPrice.priceType
                    this.modelType = tieredPackageWithMinimumPrice.modelType
                    this.createdAt = tieredPackageWithMinimumPrice.createdAt
                    this.cadence = tieredPackageWithMinimumPrice.cadence
                    this.billableMetric = tieredPackageWithMinimumPrice.billableMetric
                    this.fixedPriceQuantity = tieredPackageWithMinimumPrice.fixedPriceQuantity
                    this.planPhaseOrder = tieredPackageWithMinimumPrice.planPhaseOrder
                    this.currency = tieredPackageWithMinimumPrice.currency
                    this.conversionRate = tieredPackageWithMinimumPrice.conversionRate
                    this.item = tieredPackageWithMinimumPrice.item
                    this.creditAllocation = tieredPackageWithMinimumPrice.creditAllocation
                    this.discount = tieredPackageWithMinimumPrice.discount
                    this.minimum = tieredPackageWithMinimumPrice.minimum
                    this.minimumAmount = tieredPackageWithMinimumPrice.minimumAmount
                    this.maximum = tieredPackageWithMinimumPrice.maximum
                    this.maximumAmount = tieredPackageWithMinimumPrice.maximumAmount
                    this.tieredPackageWithMinimumConfig =
                        tieredPackageWithMinimumPrice.tieredPackageWithMinimumConfig
                    additionalProperties(tieredPackageWithMinimumPrice.additionalProperties)
                }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun tieredPackageWithMinimumConfig(
                tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig
            ) = tieredPackageWithMinimumConfig(JsonField.of(tieredPackageWithMinimumConfig))

            @JsonProperty("tiered_package_with_minimum_config")
            @ExcludeMissing
            fun tieredPackageWithMinimumConfig(
                tieredPackageWithMinimumConfig: JsonField<TieredPackageWithMinimumConfig>
            ) = apply { this.tieredPackageWithMinimumConfig = tieredPackageWithMinimumConfig }

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

            fun build(): TieredPackageWithMinimumPrice =
                TieredPackageWithMinimumPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    tieredPackageWithMinimumConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_PACKAGE_WITH_MINIMUM =
                    ModelType(JsonField.of("tiered_package_with_minimum"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_PACKAGE_WITH_MINIMUM,
            }

            enum class Value {
                TIERED_PACKAGE_WITH_MINIMUM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_PACKAGE_WITH_MINIMUM -> Value.TIERED_PACKAGE_WITH_MINIMUM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_PACKAGE_WITH_MINIMUM -> Known.TIERED_PACKAGE_WITH_MINIMUM
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = TieredPackageWithMinimumConfig.Builder::class)
        @NoAutoDetect
        class TieredPackageWithMinimumConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TieredPackageWithMinimumConfig = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TieredPackageWithMinimumConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "TieredPackageWithMinimumConfig{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig) =
                    apply {
                        additionalProperties(tieredPackageWithMinimumConfig.additionalProperties)
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredPackageWithMinimumConfig =
                    TieredPackageWithMinimumConfig(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = PackageWithAllocationPrice.Builder::class)
    @NoAutoDetect
    class PackageWithAllocationPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val packageWithAllocationConfig: JsonField<PackageWithAllocationConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun packageWithAllocationConfig(): PackageWithAllocationConfig =
            packageWithAllocationConfig.getRequired("package_with_allocation_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("package_with_allocation_config")
        @ExcludeMissing
        fun _packageWithAllocationConfig() = packageWithAllocationConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PackageWithAllocationPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                packageWithAllocationConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PackageWithAllocationPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.packageWithAllocationConfig == other.packageWithAllocationConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        packageWithAllocationConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PackageWithAllocationPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, packageWithAllocationConfig=$packageWithAllocationConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var packageWithAllocationConfig: JsonField<PackageWithAllocationConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(packageWithAllocationPrice: PackageWithAllocationPrice) = apply {
                this.id = packageWithAllocationPrice.id
                this.name = packageWithAllocationPrice.name
                this.externalPriceId = packageWithAllocationPrice.externalPriceId
                this.priceType = packageWithAllocationPrice.priceType
                this.modelType = packageWithAllocationPrice.modelType
                this.createdAt = packageWithAllocationPrice.createdAt
                this.cadence = packageWithAllocationPrice.cadence
                this.billableMetric = packageWithAllocationPrice.billableMetric
                this.fixedPriceQuantity = packageWithAllocationPrice.fixedPriceQuantity
                this.planPhaseOrder = packageWithAllocationPrice.planPhaseOrder
                this.currency = packageWithAllocationPrice.currency
                this.conversionRate = packageWithAllocationPrice.conversionRate
                this.item = packageWithAllocationPrice.item
                this.creditAllocation = packageWithAllocationPrice.creditAllocation
                this.discount = packageWithAllocationPrice.discount
                this.minimum = packageWithAllocationPrice.minimum
                this.minimumAmount = packageWithAllocationPrice.minimumAmount
                this.maximum = packageWithAllocationPrice.maximum
                this.maximumAmount = packageWithAllocationPrice.maximumAmount
                this.packageWithAllocationConfig =
                    packageWithAllocationPrice.packageWithAllocationConfig
                additionalProperties(packageWithAllocationPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun packageWithAllocationConfig(
                packageWithAllocationConfig: PackageWithAllocationConfig
            ) = packageWithAllocationConfig(JsonField.of(packageWithAllocationConfig))

            @JsonProperty("package_with_allocation_config")
            @ExcludeMissing
            fun packageWithAllocationConfig(
                packageWithAllocationConfig: JsonField<PackageWithAllocationConfig>
            ) = apply { this.packageWithAllocationConfig = packageWithAllocationConfig }

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

            fun build(): PackageWithAllocationPrice =
                PackageWithAllocationPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    packageWithAllocationConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val PACKAGE_WITH_ALLOCATION = ModelType(JsonField.of("package_with_allocation"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                PACKAGE_WITH_ALLOCATION,
            }

            enum class Value {
                PACKAGE_WITH_ALLOCATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PACKAGE_WITH_ALLOCATION -> Value.PACKAGE_WITH_ALLOCATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PACKAGE_WITH_ALLOCATION -> Known.PACKAGE_WITH_ALLOCATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = PackageWithAllocationConfig.Builder::class)
        @NoAutoDetect
        class PackageWithAllocationConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PackageWithAllocationConfig = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PackageWithAllocationConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "PackageWithAllocationConfig{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(packageWithAllocationConfig: PackageWithAllocationConfig) =
                    apply {
                        additionalProperties(packageWithAllocationConfig.additionalProperties)
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PackageWithAllocationConfig =
                    PackageWithAllocationConfig(additionalProperties.toUnmodifiable())
            }
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = UnitWithPercentPrice.Builder::class)
    @NoAutoDetect
    class UnitWithPercentPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val unitWithPercentConfig: JsonField<UnitWithPercentConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun unitWithPercentConfig(): UnitWithPercentConfig =
            unitWithPercentConfig.getRequired("unit_with_percent_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("unit_with_percent_config")
        @ExcludeMissing
        fun _unitWithPercentConfig() = unitWithPercentConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UnitWithPercentPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                unitWithPercentConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnitWithPercentPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.unitWithPercentConfig == other.unitWithPercentConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        unitWithPercentConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "UnitWithPercentPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, unitWithPercentConfig=$unitWithPercentConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var unitWithPercentConfig: JsonField<UnitWithPercentConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unitWithPercentPrice: UnitWithPercentPrice) = apply {
                this.id = unitWithPercentPrice.id
                this.name = unitWithPercentPrice.name
                this.externalPriceId = unitWithPercentPrice.externalPriceId
                this.priceType = unitWithPercentPrice.priceType
                this.modelType = unitWithPercentPrice.modelType
                this.createdAt = unitWithPercentPrice.createdAt
                this.cadence = unitWithPercentPrice.cadence
                this.billableMetric = unitWithPercentPrice.billableMetric
                this.fixedPriceQuantity = unitWithPercentPrice.fixedPriceQuantity
                this.planPhaseOrder = unitWithPercentPrice.planPhaseOrder
                this.currency = unitWithPercentPrice.currency
                this.conversionRate = unitWithPercentPrice.conversionRate
                this.item = unitWithPercentPrice.item
                this.creditAllocation = unitWithPercentPrice.creditAllocation
                this.discount = unitWithPercentPrice.discount
                this.minimum = unitWithPercentPrice.minimum
                this.minimumAmount = unitWithPercentPrice.minimumAmount
                this.maximum = unitWithPercentPrice.maximum
                this.maximumAmount = unitWithPercentPrice.maximumAmount
                this.unitWithPercentConfig = unitWithPercentPrice.unitWithPercentConfig
                additionalProperties(unitWithPercentPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun unitWithPercentConfig(unitWithPercentConfig: UnitWithPercentConfig) =
                unitWithPercentConfig(JsonField.of(unitWithPercentConfig))

            @JsonProperty("unit_with_percent_config")
            @ExcludeMissing
            fun unitWithPercentConfig(unitWithPercentConfig: JsonField<UnitWithPercentConfig>) =
                apply {
                    this.unitWithPercentConfig = unitWithPercentConfig
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

            fun build(): UnitWithPercentPrice =
                UnitWithPercentPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    unitWithPercentConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val UNIT_WITH_PERCENT = ModelType(JsonField.of("unit_with_percent"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                UNIT_WITH_PERCENT,
            }

            enum class Value {
                UNIT_WITH_PERCENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNIT_WITH_PERCENT -> Value.UNIT_WITH_PERCENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    UNIT_WITH_PERCENT -> Known.UNIT_WITH_PERCENT
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = UnitWithPercentConfig.Builder::class)
        @NoAutoDetect
        class UnitWithPercentConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnitWithPercentConfig = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnitWithPercentConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "UnitWithPercentConfig{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unitWithPercentConfig: UnitWithPercentConfig) = apply {
                    additionalProperties(unitWithPercentConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnitWithPercentConfig =
                    UnitWithPercentConfig(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = MatrixWithAllocationPrice.Builder::class)
    @NoAutoDetect
    class MatrixWithAllocationPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val matrixWithAllocationConfig: JsonField<MatrixWithAllocationConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun matrixWithAllocationConfig(): MatrixWithAllocationConfig =
            matrixWithAllocationConfig.getRequired("matrix_with_allocation_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("matrix_with_allocation_config")
        @ExcludeMissing
        fun _matrixWithAllocationConfig() = matrixWithAllocationConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): MatrixWithAllocationPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                matrixWithAllocationConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MatrixWithAllocationPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.matrixWithAllocationConfig == other.matrixWithAllocationConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        matrixWithAllocationConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "MatrixWithAllocationPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, matrixWithAllocationConfig=$matrixWithAllocationConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var matrixWithAllocationConfig: JsonField<MatrixWithAllocationConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(matrixWithAllocationPrice: MatrixWithAllocationPrice) = apply {
                this.id = matrixWithAllocationPrice.id
                this.name = matrixWithAllocationPrice.name
                this.externalPriceId = matrixWithAllocationPrice.externalPriceId
                this.priceType = matrixWithAllocationPrice.priceType
                this.modelType = matrixWithAllocationPrice.modelType
                this.createdAt = matrixWithAllocationPrice.createdAt
                this.cadence = matrixWithAllocationPrice.cadence
                this.billableMetric = matrixWithAllocationPrice.billableMetric
                this.fixedPriceQuantity = matrixWithAllocationPrice.fixedPriceQuantity
                this.planPhaseOrder = matrixWithAllocationPrice.planPhaseOrder
                this.currency = matrixWithAllocationPrice.currency
                this.conversionRate = matrixWithAllocationPrice.conversionRate
                this.item = matrixWithAllocationPrice.item
                this.creditAllocation = matrixWithAllocationPrice.creditAllocation
                this.discount = matrixWithAllocationPrice.discount
                this.minimum = matrixWithAllocationPrice.minimum
                this.minimumAmount = matrixWithAllocationPrice.minimumAmount
                this.maximum = matrixWithAllocationPrice.maximum
                this.maximumAmount = matrixWithAllocationPrice.maximumAmount
                this.matrixWithAllocationConfig =
                    matrixWithAllocationPrice.matrixWithAllocationConfig
                additionalProperties(matrixWithAllocationPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun matrixWithAllocationConfig(matrixWithAllocationConfig: MatrixWithAllocationConfig) =
                matrixWithAllocationConfig(JsonField.of(matrixWithAllocationConfig))

            @JsonProperty("matrix_with_allocation_config")
            @ExcludeMissing
            fun matrixWithAllocationConfig(
                matrixWithAllocationConfig: JsonField<MatrixWithAllocationConfig>
            ) = apply { this.matrixWithAllocationConfig = matrixWithAllocationConfig }

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

            fun build(): MatrixWithAllocationPrice =
                MatrixWithAllocationPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    matrixWithAllocationConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = MatrixWithAllocationConfig.Builder::class)
        @NoAutoDetect
        class MatrixWithAllocationConfig
        private constructor(
            private val dimensions: JsonField<List<String?>>,
            private val defaultUnitAmount: JsonField<String>,
            private val matrixValues: JsonField<List<MatrixValue>>,
            private val allocation: JsonField<Double>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** One or two event property values to evaluate matrix groups by */
            fun dimensions(): List<String?> = dimensions.getRequired("dimensions")

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            fun defaultUnitAmount(): String = defaultUnitAmount.getRequired("default_unit_amount")

            /** Matrix values for specified matrix grouping keys */
            fun matrixValues(): List<MatrixValue> = matrixValues.getRequired("matrix_values")

            /** Allocation to be used to calculate the price */
            fun allocation(): Double = allocation.getRequired("allocation")

            /** One or two event property values to evaluate matrix groups by */
            @JsonProperty("dimensions") @ExcludeMissing fun _dimensions() = dimensions

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            @JsonProperty("default_unit_amount")
            @ExcludeMissing
            fun _defaultUnitAmount() = defaultUnitAmount

            /** Matrix values for specified matrix grouping keys */
            @JsonProperty("matrix_values") @ExcludeMissing fun _matrixValues() = matrixValues

            /** Allocation to be used to calculate the price */
            @JsonProperty("allocation") @ExcludeMissing fun _allocation() = allocation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): MatrixWithAllocationConfig = apply {
                if (!validated) {
                    dimensions()
                    defaultUnitAmount()
                    matrixValues().forEach { it.validate() }
                    allocation()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MatrixWithAllocationConfig &&
                    this.dimensions == other.dimensions &&
                    this.defaultUnitAmount == other.defaultUnitAmount &&
                    this.matrixValues == other.matrixValues &&
                    this.allocation == other.allocation &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            dimensions,
                            defaultUnitAmount,
                            matrixValues,
                            allocation,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "MatrixWithAllocationConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, allocation=$allocation, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var dimensions: JsonField<List<String?>> = JsonMissing.of()
                private var defaultUnitAmount: JsonField<String> = JsonMissing.of()
                private var matrixValues: JsonField<List<MatrixValue>> = JsonMissing.of()
                private var allocation: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixWithAllocationConfig: MatrixWithAllocationConfig) = apply {
                    this.dimensions = matrixWithAllocationConfig.dimensions
                    this.defaultUnitAmount = matrixWithAllocationConfig.defaultUnitAmount
                    this.matrixValues = matrixWithAllocationConfig.matrixValues
                    this.allocation = matrixWithAllocationConfig.allocation
                    additionalProperties(matrixWithAllocationConfig.additionalProperties)
                }

                /** One or two event property values to evaluate matrix groups by */
                fun dimensions(dimensions: List<String?>) = dimensions(JsonField.of(dimensions))

                /** One or two event property values to evaluate matrix groups by */
                @JsonProperty("dimensions")
                @ExcludeMissing
                fun dimensions(dimensions: JsonField<List<String?>>) = apply {
                    this.dimensions = dimensions
                }

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                fun defaultUnitAmount(defaultUnitAmount: String) =
                    defaultUnitAmount(JsonField.of(defaultUnitAmount))

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                @JsonProperty("default_unit_amount")
                @ExcludeMissing
                fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
                    this.defaultUnitAmount = defaultUnitAmount
                }

                /** Matrix values for specified matrix grouping keys */
                fun matrixValues(matrixValues: List<MatrixValue>) =
                    matrixValues(JsonField.of(matrixValues))

                /** Matrix values for specified matrix grouping keys */
                @JsonProperty("matrix_values")
                @ExcludeMissing
                fun matrixValues(matrixValues: JsonField<List<MatrixValue>>) = apply {
                    this.matrixValues = matrixValues
                }

                /** Allocation to be used to calculate the price */
                fun allocation(allocation: Double) = allocation(JsonField.of(allocation))

                /** Allocation to be used to calculate the price */
                @JsonProperty("allocation")
                @ExcludeMissing
                fun allocation(allocation: JsonField<Double>) = apply {
                    this.allocation = allocation
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): MatrixWithAllocationConfig =
                    MatrixWithAllocationConfig(
                        dimensions.map { it.toUnmodifiable() },
                        defaultUnitAmount,
                        matrixValues.map { it.toUnmodifiable() },
                        allocation,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = MatrixValue.Builder::class)
            @NoAutoDetect
            class MatrixValue
            private constructor(
                private val unitAmount: JsonField<String>,
                private val dimensionValues: JsonField<List<String?>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Unit price for the specified dimension_values */
                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                fun dimensionValues(): List<String?> =
                    dimensionValues.getRequired("dimension_values")

                /** Unit price for the specified dimension_values */
                @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                @JsonProperty("dimension_values")
                @ExcludeMissing
                fun _dimensionValues() = dimensionValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): MatrixValue = apply {
                    if (!validated) {
                        unitAmount()
                        dimensionValues()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MatrixValue &&
                        this.unitAmount == other.unitAmount &&
                        this.dimensionValues == other.dimensionValues &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                unitAmount,
                                dimensionValues,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var unitAmount: JsonField<String> = JsonMissing.of()
                    private var dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixValue: MatrixValue) = apply {
                        this.unitAmount = matrixValue.unitAmount
                        this.dimensionValues = matrixValue.dimensionValues
                        additionalProperties(matrixValue.additionalProperties)
                    }

                    /** Unit price for the specified dimension_values */
                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                    /** Unit price for the specified dimension_values */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun unitAmount(unitAmount: JsonField<String>) = apply {
                        this.unitAmount = unitAmount
                    }

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    fun dimensionValues(dimensionValues: List<String?>) =
                        dimensionValues(JsonField.of(dimensionValues))

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                        this.dimensionValues = dimensionValues
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): MatrixValue =
                        MatrixValue(
                            unitAmount,
                            dimensionValues.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val MATRIX_WITH_ALLOCATION = ModelType(JsonField.of("matrix_with_allocation"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                MATRIX_WITH_ALLOCATION,
            }

            enum class Value {
                MATRIX_WITH_ALLOCATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MATRIX_WITH_ALLOCATION -> Value.MATRIX_WITH_ALLOCATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MATRIX_WITH_ALLOCATION -> Known.MATRIX_WITH_ALLOCATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = TieredWithProrationPrice.Builder::class)
    @NoAutoDetect
    class TieredWithProrationPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val tieredWithProrationConfig: JsonField<TieredWithProrationConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun tieredWithProrationConfig(): TieredWithProrationConfig =
            tieredWithProrationConfig.getRequired("tiered_with_proration_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("tiered_with_proration_config")
        @ExcludeMissing
        fun _tieredWithProrationConfig() = tieredWithProrationConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TieredWithProrationPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                tieredWithProrationConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TieredWithProrationPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.tieredWithProrationConfig == other.tieredWithProrationConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        tieredWithProrationConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TieredWithProrationPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, tieredWithProrationConfig=$tieredWithProrationConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var tieredWithProrationConfig: JsonField<TieredWithProrationConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tieredWithProrationPrice: TieredWithProrationPrice) = apply {
                this.id = tieredWithProrationPrice.id
                this.name = tieredWithProrationPrice.name
                this.externalPriceId = tieredWithProrationPrice.externalPriceId
                this.priceType = tieredWithProrationPrice.priceType
                this.modelType = tieredWithProrationPrice.modelType
                this.createdAt = tieredWithProrationPrice.createdAt
                this.cadence = tieredWithProrationPrice.cadence
                this.billableMetric = tieredWithProrationPrice.billableMetric
                this.fixedPriceQuantity = tieredWithProrationPrice.fixedPriceQuantity
                this.planPhaseOrder = tieredWithProrationPrice.planPhaseOrder
                this.currency = tieredWithProrationPrice.currency
                this.conversionRate = tieredWithProrationPrice.conversionRate
                this.item = tieredWithProrationPrice.item
                this.creditAllocation = tieredWithProrationPrice.creditAllocation
                this.discount = tieredWithProrationPrice.discount
                this.minimum = tieredWithProrationPrice.minimum
                this.minimumAmount = tieredWithProrationPrice.minimumAmount
                this.maximum = tieredWithProrationPrice.maximum
                this.maximumAmount = tieredWithProrationPrice.maximumAmount
                this.tieredWithProrationConfig = tieredWithProrationPrice.tieredWithProrationConfig
                additionalProperties(tieredWithProrationPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun tieredWithProrationConfig(tieredWithProrationConfig: TieredWithProrationConfig) =
                tieredWithProrationConfig(JsonField.of(tieredWithProrationConfig))

            @JsonProperty("tiered_with_proration_config")
            @ExcludeMissing
            fun tieredWithProrationConfig(
                tieredWithProrationConfig: JsonField<TieredWithProrationConfig>
            ) = apply { this.tieredWithProrationConfig = tieredWithProrationConfig }

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

            fun build(): TieredWithProrationPrice =
                TieredWithProrationPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    tieredWithProrationConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_WITH_PRORATION = ModelType(JsonField.of("tiered_with_proration"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_WITH_PRORATION,
            }

            enum class Value {
                TIERED_WITH_PRORATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_WITH_PRORATION -> Value.TIERED_WITH_PRORATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_WITH_PRORATION -> Known.TIERED_WITH_PRORATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = TieredWithProrationConfig.Builder::class)
        @NoAutoDetect
        class TieredWithProrationConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TieredWithProrationConfig = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TieredWithProrationConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "TieredWithProrationConfig{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredWithProrationConfig: TieredWithProrationConfig) = apply {
                    additionalProperties(tieredWithProrationConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredWithProrationConfig =
                    TieredWithProrationConfig(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = UnitWithProrationPrice.Builder::class)
    @NoAutoDetect
    class UnitWithProrationPrice
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val externalPriceId: JsonField<String>,
        private val priceType: JsonField<PriceType>,
        private val modelType: JsonField<ModelType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val cadence: JsonField<Cadence>,
        private val billableMetric: JsonField<BillableMetric>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val planPhaseOrder: JsonField<Long>,
        private val currency: JsonField<String>,
        private val conversionRate: JsonField<Double>,
        private val item: JsonField<Item>,
        private val creditAllocation: JsonField<CreditAllocation>,
        private val discount: JsonField<Discount>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val unitWithProrationConfig: JsonField<UnitWithProrationConfig>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        fun priceType(): PriceType = priceType.getRequired("price_type")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun cadence(): Cadence = cadence.getRequired("cadence")

        fun billableMetric(): BillableMetric? = billableMetric.getNullable("billable_metric")

        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        fun currency(): String = currency.getRequired("currency")

        fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

        fun item(): Item = item.getRequired("item")

        fun creditAllocation(): CreditAllocation? =
            creditAllocation.getNullable("credit_allocation")

        fun discount(): Discount? = discount.getNullable("discount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun unitWithProrationConfig(): UnitWithProrationConfig =
            unitWithProrationConfig.getRequired("unit_with_proration_config")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("external_price_id") @ExcludeMissing fun _externalPriceId() = externalPriceId

        @JsonProperty("price_type") @ExcludeMissing fun _priceType() = priceType

        @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

        @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity() = fixedPriceQuantity

        @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

        @JsonProperty("item") @ExcludeMissing fun _item() = item

        @JsonProperty("credit_allocation")
        @ExcludeMissing
        fun _creditAllocation() = creditAllocation

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("unit_with_proration_config")
        @ExcludeMissing
        fun _unitWithProrationConfig() = unitWithProrationConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UnitWithProrationPrice = apply {
            if (!validated) {
                id()
                name()
                externalPriceId()
                priceType()
                modelType()
                createdAt()
                cadence()
                billableMetric()?.validate()
                fixedPriceQuantity()
                planPhaseOrder()
                currency()
                conversionRate()
                item().validate()
                creditAllocation()?.validate()
                discount()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                unitWithProrationConfig().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnitWithProrationPrice &&
                this.id == other.id &&
                this.name == other.name &&
                this.externalPriceId == other.externalPriceId &&
                this.priceType == other.priceType &&
                this.modelType == other.modelType &&
                this.createdAt == other.createdAt &&
                this.cadence == other.cadence &&
                this.billableMetric == other.billableMetric &&
                this.fixedPriceQuantity == other.fixedPriceQuantity &&
                this.planPhaseOrder == other.planPhaseOrder &&
                this.currency == other.currency &&
                this.conversionRate == other.conversionRate &&
                this.item == other.item &&
                this.creditAllocation == other.creditAllocation &&
                this.discount == other.discount &&
                this.minimum == other.minimum &&
                this.minimumAmount == other.minimumAmount &&
                this.maximum == other.maximum &&
                this.maximumAmount == other.maximumAmount &&
                this.unitWithProrationConfig == other.unitWithProrationConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        externalPriceId,
                        priceType,
                        modelType,
                        createdAt,
                        cadence,
                        billableMetric,
                        fixedPriceQuantity,
                        planPhaseOrder,
                        currency,
                        conversionRate,
                        item,
                        creditAllocation,
                        discount,
                        minimum,
                        minimumAmount,
                        maximum,
                        maximumAmount,
                        unitWithProrationConfig,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "UnitWithProrationPrice{id=$id, name=$name, externalPriceId=$externalPriceId, priceType=$priceType, modelType=$modelType, createdAt=$createdAt, cadence=$cadence, billableMetric=$billableMetric, fixedPriceQuantity=$fixedPriceQuantity, planPhaseOrder=$planPhaseOrder, currency=$currency, conversionRate=$conversionRate, item=$item, creditAllocation=$creditAllocation, discount=$discount, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, unitWithProrationConfig=$unitWithProrationConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceType: JsonField<PriceType> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cadence: JsonField<Cadence> = JsonMissing.of()
            private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var conversionRate: JsonField<Double> = JsonMissing.of()
            private var item: JsonField<Item> = JsonMissing.of()
            private var creditAllocation: JsonField<CreditAllocation> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var unitWithProrationConfig: JsonField<UnitWithProrationConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unitWithProrationPrice: UnitWithProrationPrice) = apply {
                this.id = unitWithProrationPrice.id
                this.name = unitWithProrationPrice.name
                this.externalPriceId = unitWithProrationPrice.externalPriceId
                this.priceType = unitWithProrationPrice.priceType
                this.modelType = unitWithProrationPrice.modelType
                this.createdAt = unitWithProrationPrice.createdAt
                this.cadence = unitWithProrationPrice.cadence
                this.billableMetric = unitWithProrationPrice.billableMetric
                this.fixedPriceQuantity = unitWithProrationPrice.fixedPriceQuantity
                this.planPhaseOrder = unitWithProrationPrice.planPhaseOrder
                this.currency = unitWithProrationPrice.currency
                this.conversionRate = unitWithProrationPrice.conversionRate
                this.item = unitWithProrationPrice.item
                this.creditAllocation = unitWithProrationPrice.creditAllocation
                this.discount = unitWithProrationPrice.discount
                this.minimum = unitWithProrationPrice.minimum
                this.minimumAmount = unitWithProrationPrice.minimumAmount
                this.maximum = unitWithProrationPrice.maximum
                this.maximumAmount = unitWithProrationPrice.maximumAmount
                this.unitWithProrationConfig = unitWithProrationPrice.unitWithProrationConfig
                additionalProperties(unitWithProrationPrice.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun externalPriceId(externalPriceId: String) =
                externalPriceId(JsonField.of(externalPriceId))

            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            fun priceType(priceType: PriceType) = priceType(JsonField.of(priceType))

            @JsonProperty("price_type")
            @ExcludeMissing
            fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            @JsonProperty("model_type")
            @ExcludeMissing
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            @JsonProperty("cadence")
            @ExcludeMissing
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            fun billableMetric(billableMetric: BillableMetric) =
                billableMetric(JsonField.of(billableMetric))

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                this.billableMetric = billableMetric
            }

            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(JsonField.of(planPhaseOrder))

            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            fun item(item: Item) = item(JsonField.of(item))

            @JsonProperty("item")
            @ExcludeMissing
            fun item(item: JsonField<Item>) = apply { this.item = item }

            fun creditAllocation(creditAllocation: CreditAllocation) =
                creditAllocation(JsonField.of(creditAllocation))

            @JsonProperty("credit_allocation")
            @ExcludeMissing
            fun creditAllocation(creditAllocation: JsonField<CreditAllocation>) = apply {
                this.creditAllocation = creditAllocation
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun unitWithProrationConfig(unitWithProrationConfig: UnitWithProrationConfig) =
                unitWithProrationConfig(JsonField.of(unitWithProrationConfig))

            @JsonProperty("unit_with_proration_config")
            @ExcludeMissing
            fun unitWithProrationConfig(
                unitWithProrationConfig: JsonField<UnitWithProrationConfig>
            ) = apply { this.unitWithProrationConfig = unitWithProrationConfig }

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

            fun build(): UnitWithProrationPrice =
                UnitWithProrationPrice(
                    id,
                    name,
                    externalPriceId,
                    priceType,
                    modelType,
                    createdAt,
                    cadence,
                    billableMetric,
                    fixedPriceQuantity,
                    planPhaseOrder,
                    currency,
                    conversionRate,
                    item,
                    creditAllocation,
                    discount,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    unitWithProrationConfig,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BillableMetric.Builder::class)
        @NoAutoDetect
        class BillableMetric
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BillableMetric = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillableMetric &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "BillableMetric{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billableMetric: BillableMetric) = apply {
                    this.id = billableMetric.id
                    additionalProperties(billableMetric.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillableMetric =
                    BillableMetric(id, additionalProperties.toUnmodifiable())
            }
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cadence && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val ANNUAL = Cadence(JsonField.of("annual"))

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                ONE_TIME,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditAllocation.Builder::class)
        @NoAutoDetect
        class CreditAllocation
        private constructor(
            private val currency: JsonField<String>,
            private val allowsRollover: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun currency(): String = currency.getRequired("currency")

            fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("allows_rollover") @ExcludeMissing fun _allowsRollover() = allowsRollover

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditAllocation = apply {
                if (!validated) {
                    currency()
                    allowsRollover()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditAllocation &&
                    this.currency == other.currency &&
                    this.allowsRollover == other.allowsRollover &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            currency,
                            allowsRollover,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditAllocation{currency=$currency, allowsRollover=$allowsRollover, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var currency: JsonField<String> = JsonMissing.of()
                private var allowsRollover: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditAllocation: CreditAllocation) = apply {
                    this.currency = creditAllocation.currency
                    this.allowsRollover = creditAllocation.allowsRollover
                    additionalProperties(creditAllocation.additionalProperties)
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun allowsRollover(allowsRollover: Boolean) =
                    allowsRollover(JsonField.of(allowsRollover))

                @JsonProperty("allows_rollover")
                @ExcludeMissing
                fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
                    this.allowsRollover = allowsRollover
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditAllocation =
                    CreditAllocation(
                        currency,
                        allowsRollover,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Item.Builder::class)
        @NoAutoDetect
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Item = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Item{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    this.id = item.id
                    this.name = item.name
                    additionalProperties(item.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Item =
                    Item(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Maximum &&
                    this.maximumAmount == other.maximumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            maximumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    this.maximumAmount = maximum.maximumAmount
                    this.appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties(maximum.additionalProperties)
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Minimum &&
                    this.minimumAmount == other.minimumAmount &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            minimumAmount,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    this.minimumAmount = minimum.minimumAmount
                    this.appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties(minimum.additionalProperties)
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val UNIT_WITH_PRORATION = ModelType(JsonField.of("unit_with_proration"))

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                UNIT_WITH_PRORATION,
            }

            enum class Value {
                UNIT_WITH_PRORATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNIT_WITH_PRORATION -> Value.UNIT_WITH_PRORATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    UNIT_WITH_PRORATION -> Known.UNIT_WITH_PRORATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class PriceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PriceType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE_PRICE = PriceType(JsonField.of("usage_price"))

                val FIXED_PRICE = PriceType(JsonField.of("fixed_price"))

                fun of(value: String) = PriceType(JsonField.of(value))
            }

            enum class Known {
                USAGE_PRICE,
                FIXED_PRICE,
            }

            enum class Value {
                USAGE_PRICE,
                FIXED_PRICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE_PRICE -> Value.USAGE_PRICE
                    FIXED_PRICE -> Value.FIXED_PRICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE_PRICE -> Known.USAGE_PRICE
                    FIXED_PRICE -> Known.FIXED_PRICE
                    else -> throw OrbInvalidDataException("Unknown PriceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = UnitWithProrationConfig.Builder::class)
        @NoAutoDetect
        class UnitWithProrationConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnitWithProrationConfig = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnitWithProrationConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "UnitWithProrationConfig{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unitWithProrationConfig: UnitWithProrationConfig) = apply {
                    additionalProperties(unitWithProrationConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnitWithProrationConfig =
                    UnitWithProrationConfig(additionalProperties.toUnmodifiable())
            }
        }
    }
}
