// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.events

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.events.BackfillService
import com.withorb.api.models.EventBackfillListPage
import com.withorb.api.models.EventBackfillListParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class BackfillServiceTest {

    @Test
    fun callCreate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val backfillService = client.events().backfills()
      val eventBackfillCreateResponse = backfillService.create(EventBackfillCreateParams.builder()
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerId("customer_id")
          .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
          .externalCustomerId("external_customer_id")
          .replaceExistingEvents(true)
          .build())
      println(eventBackfillCreateResponse)
      eventBackfillCreateResponse.validate()
    }

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val backfillService = client.events().backfills()
      val backfills = backfillService.list(EventBackfillListParams.builder().build())
      println(backfills)
      backfills.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callClose() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val backfillService = client.events().backfills()
      val eventBackfillCloseResponse = backfillService.close(EventBackfillCloseParams.builder()
          .backfillId("backfill_id")
          .build())
      println(eventBackfillCloseResponse)
      eventBackfillCloseResponse.validate()
    }

    @Test
    fun callFetch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val backfillService = client.events().backfills()
      val eventBackfillFetchResponse = backfillService.fetch(EventBackfillFetchParams.builder()
          .backfillId("backfill_id")
          .build())
      println(eventBackfillFetchResponse)
      eventBackfillFetchResponse.validate()
    }

    @Test
    fun callRevert() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val backfillService = client.events().backfills()
      val eventBackfillRevertResponse = backfillService.revert(EventBackfillRevertParams.builder()
          .backfillId("backfill_id")
          .build())
      println(eventBackfillRevertResponse)
      eventBackfillRevertResponse.validate()
    }
}
