// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

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
import com.withorb.api.services.blocking.MetricService
import com.withorb.api.models.MetricListPage
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class MetricServiceTest {

    @Test
    fun callCreate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricService = client.metrics()
      val billableMetric = metricService.create(MetricCreateParams.builder()
          .description("Sum of bytes downloaded in fast mode")
          .itemId("item_id")
          .name("Bytes downloaded")
          .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
          .metadata(MetricCreateParams.Metadata.builder().build())
          .build())
      println(billableMetric)
      billableMetric.validate()
    }

    @Test
    fun callUpdate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricService = client.metrics()
      val billableMetric = metricService.update(MetricUpdateParams.builder()
          .metricId("metric_id")
          .metadata(MetricUpdateParams.Metadata.builder().build())
          .build())
      println(billableMetric)
      billableMetric.validate()
    }

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricService = client.metrics()
      val billableMetrics = metricService.list(MetricListParams.builder().build())
      println(billableMetrics)
      billableMetrics.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callFetch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricService = client.metrics()
      val billableMetric = metricService.fetch(MetricFetchParams.builder()
          .metricId("metric_id")
          .build())
      println(billableMetric)
      billableMetric.validate()
    }
}
