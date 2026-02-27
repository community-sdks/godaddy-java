# AbuseService

Abuse reporting and ticket lookup endpoints for phishing, malware, and related investigations.

## Accessor

```java
var service = client.abuse();
```

## Endpoints

### getTickets

Calls `GET /v1/abuse/tickets`.

```java
var response = client.abuse().getTickets("sample", Boolean.TRUE, "sample", "sample", "sample", "sample", 1L, 1L);
```

```json
{}
```

### createTicket

Calls `POST /v1/abuse/tickets`.

```java
var response = client.abuse().createTicket(Map.of("sample", true));
```

```json
{}
```

### getTicketInfo

Calls `GET /v1/abuse/tickets/{ticketId}`.

```java
var response = client.abuse().getTicketInfo("sample");
```

```json
{}
```

### getTicketsV2

Calls `GET /v2/abuse/tickets`.

```java
var response = client.abuse().getTicketsV2("sample", Boolean.TRUE, "sample", "sample", "sample", "sample", 1L, 1L);
```

```json
{}
```

### createTicketV2

Calls `POST /v2/abuse/tickets`.

```java
var response = client.abuse().createTicketV2(Map.of("sample", true));
```

```json
{}
```

### getTicketInfoV2

Calls `GET /v2/abuse/tickets/{ticketId}`.

```java
var response = client.abuse().getTicketInfoV2("sample");
```

```json
{}
```

