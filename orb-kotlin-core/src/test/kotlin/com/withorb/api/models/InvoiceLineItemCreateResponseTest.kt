// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.models.InvoiceLineItemCreateResponse

class InvoiceLineItemCreateResponseTest {

    @Test
    fun createInvoiceLineItemCreateResponse() {
      val invoiceLineItemCreateResponse = InvoiceLineItemCreateResponse.builder()
          .id("id")
          .amount("7.00")
          .discount(Discount.ofPercentageDiscount(Discount.PercentageDiscount.builder()
              .appliesToPriceIds(listOf("string"))
              .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
              .percentageDiscount(1.0)
              .reason("reason")
              .build()))
          .endDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
          .grouping("grouping")
          .maximum(InvoiceLineItemCreateResponse.Maximum.builder()
              .appliesToPriceIds(listOf("string"))
              .maximumAmount("maximum_amount")
              .build())
          .maximumAmount("maximum_amount")
          .minimum(InvoiceLineItemCreateResponse.Minimum.builder()
              .appliesToPriceIds(listOf("string"))
              .minimumAmount("minimum_amount")
              .build())
          .minimumAmount("minimum_amount")
          .name("Fixed Fee")
          .price(Price.ofUnitPrice(Price.UnitPrice.builder()
              .id("id")
              .billableMetric(Price.UnitPrice.BillableMetric.builder()
                  .id("id")
                  .build())
              .billingCycleConfiguration(Price.UnitPrice.BillingCycleConfiguration.builder()
                  .duration(123L)
                  .durationUnit(Price.UnitPrice.BillingCycleConfiguration.DurationUnit.DAY)
                  .build())
              .cadence(Price.UnitPrice.Cadence.ONE_TIME)
              .conversionRate(42.23)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditAllocation(Price.UnitPrice.CreditAllocation.builder()
                  .allowsRollover(true)
                  .currency("currency")
                  .build())
              .currency("currency")
              .discount(Discount.ofPercentageDiscount(Discount.PercentageDiscount.builder()
                  .appliesToPriceIds(listOf("string"))
                  .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                  .percentageDiscount(1.0)
                  .reason("reason")
                  .build()))
              .externalPriceId("external_price_id")
              .fixedPriceQuantity(42.23)
              .invoicingCycleConfiguration(Price.UnitPrice.InvoicingCycleConfiguration.builder()
                  .duration(123L)
                  .durationUnit(Price.UnitPrice.InvoicingCycleConfiguration.DurationUnit.DAY)
                  .build())
              .item(Price.UnitPrice.Item.builder()
                  .id("id")
                  .name("name")
                  .build())
              .maximum(Price.UnitPrice.Maximum.builder()
                  .appliesToPriceIds(listOf("string"))
                  .maximumAmount("maximum_amount")
                  .build())
              .maximumAmount("maximum_amount")
              .metadata(Price.UnitPrice.Metadata.builder().build())
              .minimum(Price.UnitPrice.Minimum.builder()
                  .appliesToPriceIds(listOf("string"))
                  .minimumAmount("minimum_amount")
                  .build())
              .minimumAmount("minimum_amount")
              .modelType(Price.UnitPrice.ModelType.UNIT)
              .name("name")
              .planPhaseOrder(123L)
              .priceType(Price.UnitPrice.PriceType.USAGE_PRICE)
              .unitConfig(Price.UnitPrice.UnitConfig.builder()
                  .unitAmount("unit_amount")
                  .build())
              .build()))
          .quantity(42.23)
          .startDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
          .subLineItems(listOf(InvoiceLineItemCreateResponse.SubLineItem.ofMatrixSubLineItem(InvoiceLineItemCreateResponse.SubLineItem.MatrixSubLineItem.builder()
              .amount("9.00")
              .grouping(InvoiceLineItemCreateResponse.SubLineItem.MatrixSubLineItem.Grouping.builder()
                  .key("region")
                  .value("west")
                  .build())
              .matrixConfig(InvoiceLineItemCreateResponse.SubLineItem.MatrixSubLineItem.MatrixConfig.builder()
                  .dimensionValues(listOf("string"))
                  .build())
              .name("Tier One")
              .quantity(42.23)
              .type(InvoiceLineItemCreateResponse.SubLineItem.MatrixSubLineItem.Type.MATRIX)
              .build())))
          .subtotal("9.00")
          .taxAmounts(listOf(InvoiceLineItemCreateResponse.TaxAmount.builder()
              .amount("amount")
              .taxRateDescription("tax_rate_description")
              .taxRatePercentage("tax_rate_percentage")
              .build()))
          .build()
      assertThat(invoiceLineItemCreateResponse).isNotNull
      assertThat(invoiceLineItemCreateResponse.id()).isEqualTo("id")
      assertThat(invoiceLineItemCreateResponse.amount()).isEqualTo("7.00")
      assertThat(invoiceLineItemCreateResponse.discount()).isEqualTo(Discount.ofPercentageDiscount(Discount.PercentageDiscount.builder()
          .appliesToPriceIds(listOf("string"))
          .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
          .percentageDiscount(1.0)
          .reason("reason")
          .build()))
      assertThat(invoiceLineItemCreateResponse.endDate()).isEqualTo(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
      assertThat(invoiceLineItemCreateResponse.grouping()).isEqualTo("grouping")
      assertThat(invoiceLineItemCreateResponse.maximum()).isEqualTo(InvoiceLineItemCreateResponse.Maximum.builder()
          .appliesToPriceIds(listOf("string"))
          .maximumAmount("maximum_amount")
          .build())
      assertThat(invoiceLineItemCreateResponse.maximumAmount()).isEqualTo("maximum_amount")
      assertThat(invoiceLineItemCreateResponse.minimum()).isEqualTo(InvoiceLineItemCreateResponse.Minimum.builder()
          .appliesToPriceIds(listOf("string"))
          .minimumAmount("minimum_amount")
          .build())
      assertThat(invoiceLineItemCreateResponse.minimumAmount()).isEqualTo("minimum_amount")
      assertThat(invoiceLineItemCreateResponse.name()).isEqualTo("Fixed Fee")
      assertThat(invoiceLineItemCreateResponse.price()).isEqualTo(Price.ofUnitPrice(Price.UnitPrice.builder()
          .id("id")
          .billableMetric(Price.UnitPrice.BillableMetric.builder()
              .id("id")
              .build())
          .billingCycleConfiguration(Price.UnitPrice.BillingCycleConfiguration.builder()
              .duration(123L)
              .durationUnit(Price.UnitPrice.BillingCycleConfiguration.DurationUnit.DAY)
              .build())
          .cadence(Price.UnitPrice.Cadence.ONE_TIME)
          .conversionRate(42.23)
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .creditAllocation(Price.UnitPrice.CreditAllocation.builder()
              .allowsRollover(true)
              .currency("currency")
              .build())
          .currency("currency")
          .discount(Discount.ofPercentageDiscount(Discount.PercentageDiscount.builder()
              .appliesToPriceIds(listOf("string"))
              .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
              .percentageDiscount(1.0)
              .reason("reason")
              .build()))
          .externalPriceId("external_price_id")
          .fixedPriceQuantity(42.23)
          .invoicingCycleConfiguration(Price.UnitPrice.InvoicingCycleConfiguration.builder()
              .duration(123L)
              .durationUnit(Price.UnitPrice.InvoicingCycleConfiguration.DurationUnit.DAY)
              .build())
          .item(Price.UnitPrice.Item.builder()
              .id("id")
              .name("name")
              .build())
          .maximum(Price.UnitPrice.Maximum.builder()
              .appliesToPriceIds(listOf("string"))
              .maximumAmount("maximum_amount")
              .build())
          .maximumAmount("maximum_amount")
          .metadata(Price.UnitPrice.Metadata.builder().build())
          .minimum(Price.UnitPrice.Minimum.builder()
              .appliesToPriceIds(listOf("string"))
              .minimumAmount("minimum_amount")
              .build())
          .minimumAmount("minimum_amount")
          .modelType(Price.UnitPrice.ModelType.UNIT)
          .name("name")
          .planPhaseOrder(123L)
          .priceType(Price.UnitPrice.PriceType.USAGE_PRICE)
          .unitConfig(Price.UnitPrice.UnitConfig.builder()
              .unitAmount("unit_amount")
              .build())
          .build()))
      assertThat(invoiceLineItemCreateResponse.quantity()).isEqualTo(42.23)
      assertThat(invoiceLineItemCreateResponse.startDate()).isEqualTo(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
      assertThat(invoiceLineItemCreateResponse.subLineItems()).containsExactly(InvoiceLineItemCreateResponse.SubLineItem.ofMatrixSubLineItem(InvoiceLineItemCreateResponse.SubLineItem.MatrixSubLineItem.builder()
          .amount("9.00")
          .grouping(InvoiceLineItemCreateResponse.SubLineItem.MatrixSubLineItem.Grouping.builder()
              .key("region")
              .value("west")
              .build())
          .matrixConfig(InvoiceLineItemCreateResponse.SubLineItem.MatrixSubLineItem.MatrixConfig.builder()
              .dimensionValues(listOf("string"))
              .build())
          .name("Tier One")
          .quantity(42.23)
          .type(InvoiceLineItemCreateResponse.SubLineItem.MatrixSubLineItem.Type.MATRIX)
          .build()))
      assertThat(invoiceLineItemCreateResponse.subtotal()).isEqualTo("9.00")
      assertThat(invoiceLineItemCreateResponse.taxAmounts()).containsExactly(InvoiceLineItemCreateResponse.TaxAmount.builder()
          .amount("amount")
          .taxRateDescription("tax_rate_description")
          .taxRatePercentage("tax_rate_percentage")
          .build())
    }
}
