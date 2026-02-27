# SubscriptionsService

Subscription listing and management endpoints for recurring products.

## Accessor

```java
var service = client.subscriptions();
```

## Endpoints

### list

Calls `GET /v1/subscriptions`.

```java
var response = client.subscriptions().list("header-value", "header-value", "header-value", List.of("sample"), List.of("sample"), 1L, 1L, "sample");
```

```json
{}
```

### productGroups

Calls `GET /v1/subscriptions/productGroups`.

```java
var response = client.subscriptions().productGroups("header-value", "header-value");
```

```json
{}
```

### cancel

Calls `DELETE /v1/subscriptions/{subscriptionId}`.

```java
var response = client.subscriptions().cancel(Map.of("sample", true), "header-value", "header-value");
```

```json
{}
```

### get

Calls `GET /v1/subscriptions/{subscriptionId}`.

```java
var response = client.subscriptions().get(Map.of("sample", true), "header-value", "header-value");
```

```json
{}
```

### update

Calls `PATCH /v1/subscriptions/{subscriptionId}`.

```java
var response = client.subscriptions().update(Map.of("sample", true), "header-value", Map.of("sample", true), "header-value");
```

```json
{}
```

