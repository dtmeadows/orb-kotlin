// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertListParamsTest {

    @Test
    fun createAlertListParams() {
        AlertListParams.builder()
            .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cursor("string")
            .customerId("string")
            .externalCustomerId("string")
            .limit(123L)
            .subscriptionId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AlertListParams.builder()
                .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cursor("string")
                .customerId("string")
                .externalCustomerId("string")
                .limit(123L)
                .subscriptionId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("created_at[gt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at[gte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at[lt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at[lte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("cursor", listOf("string"))
        expected.put("customer_id", listOf("string"))
        expected.put("external_customer_id", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("subscription_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AlertListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
