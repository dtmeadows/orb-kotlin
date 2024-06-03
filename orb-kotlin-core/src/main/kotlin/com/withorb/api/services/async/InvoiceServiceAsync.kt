// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceListPageAsync
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoiceVoidParams

interface InvoiceServiceAsync {

    /** This endpoint is used to create a one-off invoice for a customer. */
    suspend fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Invoice

    /**
     * This endpoint returns a list of all [`Invoice`](../guides/concepts#invoice)s for an account
     * in a list format.
     *
     * The list of invoices is ordered starting from the most recently issued invoice date. The
     * response also includes [`pagination_metadata`](../reference/pagination), which lets the
     * caller retrieve the next page of results if they exist.
     *
     * By default, this only returns invoices that are `issued`, `paid`, or `synced`.
     */
    suspend fun list(
        params: InvoiceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InvoiceListPageAsync

    /**
     * This endpoint is used to fetch an [`Invoice`](../guides/concepts#invoice) given an
     * identifier.
     */
    suspend fun fetch(
        params: InvoiceFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Invoice

    /**
     * This endpoint can be used to fetch the upcoming [invoice](../guides/concepts#invoice) for the
     * current billing period given a subscription.
     */
    suspend fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InvoiceFetchUpcomingResponse

    /**
     * This endpoint allows an eligible invoice to be issued manually. This is only possible with
     * invoices where status is `draft`, `will_auto_issue` is false, and an `eligible_to_issue_at`
     * is a time in the past. Issuing an invoice could possibly trigger side effects, some of which
     * could be customer-visible (e.g. sending emails, auto-collecting payment, syncing the invoice
     * to external providers, etc).
     */
    suspend fun issue(
        params: InvoiceIssueParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Invoice

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can only be done
     * to invoices that are in the `issued` status.
     */
    suspend fun markPaid(
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Invoice

    /**
     * This endpoint allows an invoice's status to be set the `void` status. This can only be done
     * to invoices that are in the `issued` status.
     *
     * If the associated invoice has used the customer balance to change the amount due, the
     * customer balance operation will be reverted. For example, if the invoice used $10 of customer
     * balance, that amount will be added back to the customer balance upon voiding.
     */
    suspend fun void(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Invoice
}
