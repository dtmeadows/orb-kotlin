// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.withorb.api.core.ContentTypes
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.models.*
import com.withorb.api.models.PriceExternalPriceIdUpdateParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams.PriceExternalPriceIdUpdateBody

class PriceExternalPriceIdUpdateParamsTest {

    @Test
    fun createPriceExternalPriceIdUpdateParams() {
      PriceExternalPriceIdUpdateParams.builder()
          .externalPriceId("external_price_id")
          .metadata(PriceExternalPriceIdUpdateParams.Metadata.builder().build())
          .build()
    }

    @Test
    fun getBody() {
      val params = PriceExternalPriceIdUpdateParams.builder()
          .externalPriceId("external_price_id")
          .metadata(PriceExternalPriceIdUpdateParams.Metadata.builder().build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.metadata()).isEqualTo(PriceExternalPriceIdUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = PriceExternalPriceIdUpdateParams.builder()
          .externalPriceId("external_price_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = PriceExternalPriceIdUpdateParams.builder()
          .externalPriceId("external_price_id")
          .build()
      assertThat(params).isNotNull
      // path param "externalPriceId"
      assertThat(params.getPathParam(0)).isEqualTo("external_price_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
