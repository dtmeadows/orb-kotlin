// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCostListResponseTest {

    @Test
    fun createCustomerCostListResponse() {
        val customerCostListResponse =
            CustomerCostListResponse.builder()
                .data(
                    listOf(
                        CustomerCostListResponse.Data.builder()
                            .perPriceCosts(
                                listOf(
                                    CustomerCostListResponse.Data.PerPriceCost.builder()
                                        .price(
                                            Price.ofUnitPrice(
                                                Price.UnitPrice.builder()
                                                    .id("string")
                                                    .billableMetric(
                                                        Price.UnitPrice.BillableMetric.builder()
                                                            .id("string")
                                                            .build()
                                                    )
                                                    .cadence(Price.UnitPrice.Cadence.ONE_TIME)
                                                    .conversionRate(42.23)
                                                    .createdAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .creditAllocation(
                                                        Price.UnitPrice.CreditAllocation.builder()
                                                            .allowsRollover(true)
                                                            .currency("string")
                                                            .build()
                                                    )
                                                    .currency("string")
                                                    .discount(
                                                        Discount.ofPercentageDiscount(
                                                            Discount.PercentageDiscount.builder()
                                                                .appliesToPriceIds(listOf("string"))
                                                                .discountType(
                                                                    Discount.PercentageDiscount
                                                                        .DiscountType
                                                                        .PERCENTAGE
                                                                )
                                                                .percentageDiscount(1.0)
                                                                .reason("string")
                                                                .build()
                                                        )
                                                    )
                                                    .externalPriceId("string")
                                                    .fixedPriceQuantity(42.23)
                                                    .item(
                                                        Price.UnitPrice.Item.builder()
                                                            .id("string")
                                                            .name("string")
                                                            .build()
                                                    )
                                                    .maximum(
                                                        Price.UnitPrice.Maximum.builder()
                                                            .appliesToPriceIds(listOf("string"))
                                                            .maximumAmount("string")
                                                            .build()
                                                    )
                                                    .maximumAmount("string")
                                                    .minimum(
                                                        Price.UnitPrice.Minimum.builder()
                                                            .appliesToPriceIds(listOf("string"))
                                                            .minimumAmount("string")
                                                            .build()
                                                    )
                                                    .minimumAmount("string")
                                                    .modelType(Price.UnitPrice.ModelType.UNIT)
                                                    .name("string")
                                                    .planPhaseOrder(123L)
                                                    .priceType(
                                                        Price.UnitPrice.PriceType.USAGE_PRICE
                                                    )
                                                    .unitConfig(
                                                        Price.UnitPrice.UnitConfig.builder()
                                                            .unitAmount("string")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                        )
                                        .subtotal("string")
                                        .total("string")
                                        .quantity(42.23)
                                        .build()
                                )
                            )
                            .subtotal("string")
                            .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .total("string")
                            .build()
                    )
                )
                .build()
        assertThat(customerCostListResponse).isNotNull
        assertThat(customerCostListResponse.data())
            .containsExactly(
                CustomerCostListResponse.Data.builder()
                    .perPriceCosts(
                        listOf(
                            CustomerCostListResponse.Data.PerPriceCost.builder()
                                .price(
                                    Price.ofUnitPrice(
                                        Price.UnitPrice.builder()
                                            .id("string")
                                            .billableMetric(
                                                Price.UnitPrice.BillableMetric.builder()
                                                    .id("string")
                                                    .build()
                                            )
                                            .cadence(Price.UnitPrice.Cadence.ONE_TIME)
                                            .conversionRate(42.23)
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .creditAllocation(
                                                Price.UnitPrice.CreditAllocation.builder()
                                                    .allowsRollover(true)
                                                    .currency("string")
                                                    .build()
                                            )
                                            .currency("string")
                                            .discount(
                                                Discount.ofPercentageDiscount(
                                                    Discount.PercentageDiscount.builder()
                                                        .appliesToPriceIds(listOf("string"))
                                                        .discountType(
                                                            Discount.PercentageDiscount.DiscountType
                                                                .PERCENTAGE
                                                        )
                                                        .percentageDiscount(1.0)
                                                        .reason("string")
                                                        .build()
                                                )
                                            )
                                            .externalPriceId("string")
                                            .fixedPriceQuantity(42.23)
                                            .item(
                                                Price.UnitPrice.Item.builder()
                                                    .id("string")
                                                    .name("string")
                                                    .build()
                                            )
                                            .maximum(
                                                Price.UnitPrice.Maximum.builder()
                                                    .appliesToPriceIds(listOf("string"))
                                                    .maximumAmount("string")
                                                    .build()
                                            )
                                            .maximumAmount("string")
                                            .minimum(
                                                Price.UnitPrice.Minimum.builder()
                                                    .appliesToPriceIds(listOf("string"))
                                                    .minimumAmount("string")
                                                    .build()
                                            )
                                            .minimumAmount("string")
                                            .modelType(Price.UnitPrice.ModelType.UNIT)
                                            .name("string")
                                            .planPhaseOrder(123L)
                                            .priceType(Price.UnitPrice.PriceType.USAGE_PRICE)
                                            .unitConfig(
                                                Price.UnitPrice.UnitConfig.builder()
                                                    .unitAmount("string")
                                                    .build()
                                            )
                                            .build()
                                    )
                                )
                                .subtotal("string")
                                .total("string")
                                .quantity(42.23)
                                .build()
                        )
                    )
                    .subtotal("string")
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .total("string")
                    .build()
            )
    }
}
