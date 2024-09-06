// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUpdateParamsTest {

    @Test
    fun createCustomerUpdateParams() {
        CustomerUpdateParams.builder()
            .customerId("customer_id")
            .accountingSyncConfiguration(
                CustomerUpdateParams.AccountingSyncConfiguration.builder()
                    .accountingProviders(
                        listOf(
                            CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
                                .builder()
                                .externalProviderId("external_provider_id")
                                .providerType("provider_type")
                                .build()
                        )
                    )
                    .excluded(true)
                    .build()
            )
            .additionalEmails(listOf("string"))
            .autoCollection(true)
            .billingAddress(
                CustomerUpdateParams.BillingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .currency("currency")
            .email("email")
            .emailDelivery(true)
            .externalCustomerId("external_customer_id")
            .metadata(CustomerUpdateParams.Metadata.builder().build())
            .name("name")
            .paymentProvider(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
            .paymentProviderId("payment_provider_id")
            .reportingConfiguration(
                CustomerUpdateParams.ReportingConfiguration.builder().exempt(true).build()
            )
            .shippingAddress(
                CustomerUpdateParams.ShippingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .taxId(
                CustomerUpdateParams.TaxId.builder()
                    .country(CustomerUpdateParams.TaxId.Country.AD)
                    .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("customer_id")
                .accountingSyncConfiguration(
                    CustomerUpdateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
                                    .build()
                            )
                        )
                        .excluded(true)
                        .build()
                )
                .additionalEmails(listOf("string"))
                .autoCollection(true)
                .billingAddress(
                    CustomerUpdateParams.BillingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .currency("currency")
                .email("email")
                .emailDelivery(true)
                .externalCustomerId("external_customer_id")
                .metadata(CustomerUpdateParams.Metadata.builder().build())
                .name("name")
                .paymentProvider(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerUpdateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerUpdateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxId(
                    CustomerUpdateParams.TaxId.builder()
                        .country(CustomerUpdateParams.TaxId.Country.AD)
                        .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountingSyncConfiguration())
            .isEqualTo(
                CustomerUpdateParams.AccountingSyncConfiguration.builder()
                    .accountingProviders(
                        listOf(
                            CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
                                .builder()
                                .externalProviderId("external_provider_id")
                                .providerType("provider_type")
                                .build()
                        )
                    )
                    .excluded(true)
                    .build()
            )
        assertThat(body.additionalEmails()).isEqualTo(listOf("string"))
        assertThat(body.autoCollection()).isEqualTo(true)
        assertThat(body.billingAddress())
            .isEqualTo(
                CustomerUpdateParams.BillingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.email()).isEqualTo("email")
        assertThat(body.emailDelivery()).isEqualTo(true)
        assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
        assertThat(body.metadata()).isEqualTo(CustomerUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.paymentProvider())
            .isEqualTo(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
        assertThat(body.paymentProviderId()).isEqualTo("payment_provider_id")
        assertThat(body.reportingConfiguration())
            .isEqualTo(CustomerUpdateParams.ReportingConfiguration.builder().exempt(true).build())
        assertThat(body.shippingAddress())
            .isEqualTo(
                CustomerUpdateParams.ShippingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.taxId())
            .isEqualTo(
                CustomerUpdateParams.TaxId.builder()
                    .country(CustomerUpdateParams.TaxId.Country.AD)
                    .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CustomerUpdateParams.builder().customerId("customer_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CustomerUpdateParams.builder().customerId("customer_id").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
