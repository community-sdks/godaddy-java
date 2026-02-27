# ShoppersService

Shopper profile, account, and delegated access endpoints.

## Accessor

```java
var service = client.shoppers();
```

## Endpoints

### createSubaccount

Calls `POST /v1/shoppers/subaccount`.

```java
var response = client.shoppers().createSubaccount(Map.of("sample", true));
```

```json
{}
```

### get

Calls `GET /v1/shoppers/{shopperId}`.

```java
var response = client.shoppers().get(Map.of("sample", true), List.of("sample"));
```

```json
{}
```

### update

Calls `POST /v1/shoppers/{shopperId}`.

```java
var response = client.shoppers().update(Map.of("sample", true), Map.of("sample", true));
```

```json
{}
```

### delete

Calls `DELETE /v1/shoppers/{shopperId}`.

```java
var response = client.shoppers().delete(Map.of("sample", true), "sample");
```

```json
{}
```

### getStatus

Calls `GET /v1/shoppers/{shopperId}/status`.

```java
var response = client.shoppers().getStatus(Map.of("sample", true), "sample");
```

```json
{}
```

### changePassword

Calls `PUT /v1/shoppers/{shopperId}/factors/password`.

```java
var response = client.shoppers().changePassword(Map.of("sample", true), Map.of("sample", true));
```

```json
{}
```

