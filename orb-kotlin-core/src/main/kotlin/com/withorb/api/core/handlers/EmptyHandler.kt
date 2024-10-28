@file:JvmName("EmptyHandler")

package com.withorb.api.core.handlers

import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler

internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
