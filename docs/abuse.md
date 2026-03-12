# AbuseService

## Accessor

```java
var serviceAccessor = client.abuse();
```

## Method Index

- `getTickets`: `GetTicketsResponse`
- `createTicket`: `CreateTicketResponse`
- `getTicketInfo`: `GetTicketInfoResponse`
- `getTicketsV2`: `GetTicketsV2Response`
- `createTicketV2`: `CreateTicketV2Response`
- `getTicketInfoV2`: `GetTicketInfoV2Response`

### getTickets

Returns: `GetTicketsResponse`

```java
import io.github.communitysdks.godaddy.dto.abuse.requests.GetTicketsRequest;
GetTicketsRequest request = new GetTicketsRequest(
    "value",
    Boolean.TRUE,
    "value",
    "value",
);
var response = client.abuse().getTickets(request);
```

```json
{
  "pagination": {
    "first": "value",
    "last": "value",
    "next": "value",
    "previous": "value",
    "total": 1
  },
  "ticketIds": [
    "TCK-100001"
  ]
}
```

### createTicket

Returns: `CreateTicketResponse`

```java
import io.github.communitysdks.godaddy.dto.abuse.requests.CreateTicketRequest;
CreateTicketRequest request = new CreateTicketRequest(
    java.util.Map.of("key", "value"),
);
var response = client.abuse().createTicket(request);
```

```json
{
  "u_number": "value"
}
```

### getTicketInfo

Returns: `GetTicketInfoResponse`

```java
import io.github.communitysdks.godaddy.dto.abuse.requests.GetTicketInfoRequest;
GetTicketInfoRequest request = new GetTicketInfoRequest(
    "value",
);
var response = client.abuse().getTicketInfo(request);
```

```json
{
  "closed": true,
  "closedAt": "value",
  "createdAt": "value",
  "domainIp": "example.com",
  "reporter": "value",
  "source": "value",
  "target": "value",
  "ticketId": "TCK-100001",
  "type": "A_RECORD"
}
```

### getTicketsV2

Returns: `GetTicketsV2Response`

```java
import io.github.communitysdks.godaddy.dto.abuse.requests.GetTicketsV2Request;
GetTicketsV2Request request = new GetTicketsV2Request(
    "value",
    Boolean.TRUE,
    "value",
    "value",
);
var response = client.abuse().getTicketsV2(request);
```

```json
{
  "pagination": {
    "first": "value",
    "last": "value",
    "next": "value",
    "previous": "value",
    "total": 1
  },
  "ticketIds": [
    "TCK-100001"
  ]
}
```

### createTicketV2

Returns: `CreateTicketV2Response`

```java
import io.github.communitysdks.godaddy.dto.abuse.requests.CreateTicketV2Request;
CreateTicketV2Request request = new CreateTicketV2Request(
    java.util.Map.of("key", "value"),
);
var response = client.abuse().createTicketV2(request);
```

```json
{
  "u_number": "value"
}
```

### getTicketInfoV2

Returns: `GetTicketInfoV2Response`

```java
import io.github.communitysdks.godaddy.dto.abuse.requests.GetTicketInfoV2Request;
GetTicketInfoV2Request request = new GetTicketInfoV2Request(
    "value",
);
var response = client.abuse().getTicketInfoV2(request);
```

```json
{
  "closed": true,
  "closedAt": "value",
  "createdAt": "value",
  "domainIp": "example.com",
  "reporter": "value",
  "source": "value",
  "target": "value",
  "ticketId": "TCK-100001",
  "type": "A_RECORD",
  "closeReason": "ACTIONED"
}
```