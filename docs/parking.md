# ParkingService

## Accessor

```java
var serviceAccessor = client.parking();
```

## Method Index

- `getMetrics`: `GetMetricsResponse`
- `getMetricsByDomain`: `GetMetricsByDomainResponse`

### getMetrics

Returns: `GetMetricsResponse`

```java
import io.github.communitysdks.godaddy.dto.parking.requests.GetMetricsRequest;
GetMetricsRequest request = new GetMetricsRequest(
    "value",
    "value",
    "value",
    1L,
);
var response = client.parking().getMetrics(request);
```

```json
{
  "currencyId": "USD",
  "metrics": [
    {
      "adClickCount": 4,
      "periodPtz": "2020-02-05",
      "revenue": 4000000,
      "visitCount": 22
    }
  ],
  "pagination": {
    "first": "value",
    "last": "value",
    "next": "value",
    "previous": "value",
    "total": 1
  }
}
```

### getMetricsByDomain

Returns: `GetMetricsByDomainResponse`

```java
import io.github.communitysdks.godaddy.dto.parking.requests.GetMetricsByDomainRequest;
GetMetricsByDomainRequest request = new GetMetricsByDomainRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.parking().getMetricsByDomain(request);
```

```json
{
  "currencyId": "USD",
  "metrics": [
    {
      "adClickCount": 3,
      "domain": "example.com",
      "pageViewCount": 4,
      "revenue": 3000000,
      "visitCount": 30
    }
  ],
  "pagination": {
    "first": "value",
    "last": "value",
    "next": "value",
    "previous": "value",
    "total": 1
  },
  "startDate": "2024-01-01T00:00:00Z",
  "endDate": "2024-01-01T00:00:00Z"
}
```