# AuctionsService

Auction listing discovery endpoints for GoDaddy Auctions inventory.

## Accessor

```java
var service = client.auctions();
```

## Endpoints

### placeBids

Calls `POST /v1/customers/{customerId}/aftermarket/listings/bids`.

```java
var response = client.auctions().placeBids("sample", Map.of("sample", true));
```

```json
{}
```

