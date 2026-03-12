# AuctionsService

## Accessor

```java
var serviceAccessor = client.auctions();
```

## Method Index

- `placeBids`: `PlaceBidsResponse`

### placeBids

Returns: `PlaceBidsResponse`

```java
import io.github.communitysdks.godaddy.dto.auctions.requests.PlaceBidsRequest;
PlaceBidsRequest request = new PlaceBidsRequest(
    "value",
    java.util.List.of("value"),
);
var response = client.auctions().placeBids(request);
```

```json
[
  {
    "isHighestBidder": true,
    "bidId": "e8f0a45d-53c6-49e5-a1f2-08b993960e1b",
    "bidAmountUsd": 100000000,
    "status": "SUCCESS",
    "failureReason": "BID_MIN_NOT_MET"
  }
]
```