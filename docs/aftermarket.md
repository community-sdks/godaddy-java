# AftermarketService

Aftermarket listing and sales endpoints for secondary-market domain workflows.

## Accessor

```java
var service = client.aftermarket();
```

## Endpoints

### getListings

Calls `GET /v1/customers/{customerId}/auctions/listings`.

```java
var response = client.aftermarket().getListings("sample", List.of("sample"), List.of("sample"), "sample", "sample", 1L, 1L);
```

```json
{}
```

### deleteListings

Calls `DELETE /v1/aftermarket/listings`.

```java
var response = client.aftermarket().deleteListings(List.of("sample"));
```

```json
{}
```

### addExpiryListings

Calls `POST /v1/aftermarket/listings/expiry`.

```java
var response = client.aftermarket().addExpiryListings(List.of("sample"));
```

```json
{}
```

