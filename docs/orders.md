# OrdersService

Order lookup endpoints for commerce and fulfillment status.

## Accessor

```java
var service = client.orders();
```

## Endpoints

### list

Calls `GET /v1/orders`.

```java
var response = client.orders().list("header-value", "sample", "sample", "sample", "sample", "sample", "sample", 1L, 1L, "sample", "header-value");
```

```json
{}
```

### get

Calls `GET /v1/orders/{orderId}`.

```java
var response = client.orders().get("sample", "header-value", "header-value", "header-value");
```

```json
{}
```

