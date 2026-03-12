# AftermarketService

## Accessor

```java
var serviceAccessor = client.aftermarket();
```

## Method Index

- `getListings`: `GetListingsResponse`
- `deleteListings`: `DeleteListingsResponse`
- `addExpiryListings`: `AddExpiryListingsResponse`

### getListings

Returns: `GetListingsResponse`

```java
import io.github.communitysdks.godaddy.dto.aftermarket.requests.GetListingsRequest;
GetListingsRequest request = new GetListingsRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.aftermarket().getListings(request);
```

```json
{
  "listings": [
    {
      "listingId": 1,
      "domainName": "example.com",
      "domainCreatedAt": "example.com",
      "domainExpiresAt": "example.com",
      "domainRegistrarIanaId": 1,
      "pageViewsMonthly": 1,
      "revenueMonthly": 1,
      "auctionStartAt": "2022-04-01T02:07:14Z",
      "auctionEndAt": "2022-04-10T02:07:14Z",
      "auctionTransferAt": "2022-04-15T02:07:14Z",
      "auctionSoldAt": "2022-04-20T02:07:14Z",
      "auctionBookingAmountUsd": 1,
      "createdAt": "value",
      "updatedAt": "2024-01-01T00:00:00Z"
    }
  ],
  "pagination": {
    "first": "value",
    "previous": "value",
    "next": "value",
    "last": "value",
    "total": 1
  }
}
```

### deleteListings

Returns: `DeleteListingsResponse`

```java
import io.github.communitysdks.godaddy.dto.aftermarket.requests.DeleteListingsRequest;
DeleteListingsRequest request = new DeleteListingsRequest(
    java.util.List.of("value"),
);
var response = client.aftermarket().deleteListings(request);
```

```json
{
  "listingActionId": 1
}
```

### addExpiryListings

Returns: `AddExpiryListingsResponse`

```java
import io.github.communitysdks.godaddy.dto.aftermarket.requests.AddExpiryListingsRequest;
AddExpiryListingsRequest request = new AddExpiryListingsRequest(
    java.util.List.of("value"),
);
var response = client.aftermarket().addExpiryListings(request);
```

```json
{
  "listingActionId": 1
}
```