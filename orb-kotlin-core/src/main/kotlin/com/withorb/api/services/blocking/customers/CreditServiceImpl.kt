// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CustomerCreditListByExternalIdPage
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPage
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.blocking.customers.credits.LedgerService
import com.withorb.api.services.blocking.customers.credits.LedgerServiceImpl
import com.withorb.api.services.blocking.customers.credits.TopUpService
import com.withorb.api.services.blocking.customers.credits.TopUpServiceImpl
import com.withorb.api.services.errorHandler
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class CreditServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val ledger: LedgerService by lazy { LedgerServiceImpl(clientOptions) }

    private val topUps: TopUpService by lazy { TopUpServiceImpl(clientOptions) }

    override fun ledger(): LedgerService = ledger

    override fun topUps(): TopUpService = topUps

    private val listHandler: Handler<CustomerCreditListPage.Response> =
        jsonHandler<CustomerCreditListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    override fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions
    ): CustomerCreditListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "credits")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerCreditListPage.of(this, params, it) }
        }
    }

    private val listByExternalIdHandler: Handler<CustomerCreditListByExternalIdPage.Response> =
        jsonHandler<CustomerCreditListByExternalIdPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    override fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions
    ): CustomerCreditListByExternalIdPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "customers",
                    "external_customer_id",
                    params.getPathParam(0),
                    "credits"
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listByExternalIdHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerCreditListByExternalIdPage.of(this, params, it) }
        }
    }
}
