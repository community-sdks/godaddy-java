# ParkingService

Domain parking optimization and template management endpoints.

## Accessor

```java
var service = client.parking();
```

## Endpoints

### getMetrics

Calls `GET /v1/customers/{customerId}/parking/metrics`.

```java
var response = client.parking().getMetrics("sample", "sample", "sample", 1L, 1L, "header-value");
```

```json
{}
```

### getMetricsByDomain

Calls `GET /v1/customers/{customerId}/parking/metricsByDomain`.

```java
var response = client.parking().getMetricsByDomain("sample", "sample", "sample", List.of("sample"), "sample", "sample", 1L, 1L, "header-value");
```

```json
{}
```

