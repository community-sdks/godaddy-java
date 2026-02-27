# AgreementsService

Agreement retrieval endpoints for legal terms and consent workflows.

## Accessor

```java
var service = client.agreements();
```

## Endpoints

### get

Calls `GET /v1/agreements`.

```java
var response = client.agreements().get(List.of("sample"), "header-value", "header-value");
```

```json
{}
```

