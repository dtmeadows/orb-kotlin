# Orb Kotlin API Library

The Orb Kotlin SDK provides convenient access to the Orb REST API from applications written in Kotlin. It includes helper classes with helpful types and documentation for every request and response property.

The Orb Kotlin SDK is similar to the Orb Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

## Documentation

The REST API documentation can be found on [docs.withorb.com](https://docs.withorb.com/reference/api-reference).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.withorb.api:orb-kotlin:0.1.0-alpha.7")
```

#### Maven

```xml
<dependency>
    <groupId>com.withorb.api</groupId>
    <artifactId>orb-kotlin</artifactId>
    <version>0.1.0-alpha.7</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `OrbOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()`:

```kotlin
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient

val client = OrbOkHttpClient.builder()
    .apiKey("My API Key")
    .build()
```

Alternately, set the environment with `ORB_API_KEY` or `ORB_WEBHOOK_SECRET`, and use `OrbOkHttpClient.fromEnv()` to read from the environment.

```kotlin
val client = OrbOkHttpClient.fromEnv()

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
val client = OrbOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build()
```

| Property      | Environment variable | Required | Default value |
| ------------- | -------------------- | -------- | ------------- |
| apiKey        | `ORB_API_KEY`        | true     | —             |
| webhookSecret | `ORB_WEBHOOK_SECRET` | false    | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new customer, first use the `CustomerCreateParams` builder to specify attributes,
then pass that to the `create` method of the `customers` service.

```kotlin
import com.withorb.api.models.Customer
import com.withorb.api.models.CustomerCreateParams

val params = CustomerCreateParams.builder()
    .email("example-customer@withorb.com")
    .name("My Customer")
    .build()
val customer = client.customers().create(params)
```

### Example: listing resources

The Orb API provides a `list` method to get a paginated list of coupons.
You can retrieve the first page by:

```kotlin
import com.withorb.api.models.Coupon
import com.withorb.api.models.Page

val page = client.coupons().list()
for (coupon: Coupon in page.data()) {
    print(coupon)
}
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Orb API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `CustomerCreateParams.builder()` to pass to
the `create` method of the `customers` service.

Sometimes, the API may support other properties that are not yet supported in the Kotlin SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```kotlin
import com.withorb.api.models.core.JsonValue
val params = CustomerCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", JsonValue.from("4242"))
    .build()
```

## Responses

### Response validation

When receiving a response, the Orb Kotlin SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Kotlin type. If you directly access the mistaken property, the SDK will throw an unchecked `OrbInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```kotlin
val customer = client.customers().create().validate()
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```kotlin
val field = responseObj._field

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  val jsonString: String? = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  val myObj = responseObj._field.asUnknown()?.convert(MyClass.class)
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```kotlin
val secret = amountDiscount._additionalProperties().get("secret_field")
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access
the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`,
which automatically handles fetching more pages for you:

### Synchronous

```kotlin
// As a Sequence:
client.coupons().list(params).autoPager()
    .take(50)
    .forEach { coupon -> print(coupon) }
```

### Asynchronous

```kotlin
// As a Flow:
asyncClient.coupons().list(params).autoPager()
    .take(50)
    .collect { coupon -> print(coupon) }
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one.
A page of results has a `data()` method to fetch the list of objects, as well as top-level
`response` and other methods to fetch top-level data about the page. It also has methods
`hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```kotlin
val page = client.coupons().list(params)
while (page != null) {
    for (coupon in page.data) {
        print(coupon)
    }

    page = page.getNextPage()
}
```

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`OrbException`** - Base exception for all exceptions

  - **`OrbServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

    | 400    | BadRequestException           |
    | ------ | ----------------------------- |
    | 401    | AuthenticationException       |
    | 403    | PermissionDeniedException     |
    | 404    | NotFoundException             |
    | 422    | UnprocessableEntityException  |
    | 429    | RateLimitException            |
    | 5xx    | InternalServerException       |
    | others | UnexpectedStatusCodeException |

  - **`OrbIoException`** - I/O networking errors
  - **`OrbInvalidDataException`** - any other exceptions on the client side, e.g.:
    - We failed to serialize the request body
    - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```kotlin
val client = OrbOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```kotlin
val client = OrbOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```kotlin
val client = OrbOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build()
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals)_.
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/orbcorp/orb-kotlin/issues) with questions, bugs, or suggestions.

## Requirements

This library requires Java 8 or later.
