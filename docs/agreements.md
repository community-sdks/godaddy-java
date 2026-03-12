# AgreementsService

## Accessor

```java
var serviceAccessor = client.agreements();
```

## Method Index

- `get`: `GetResponse`

### get

Returns: `GetResponse`

```java
import io.github.communitysdks.godaddy.dto.agreements.requests.GetRequest;
GetRequest request = new GetRequest(
    1L,
    "value",
    java.util.List.of("value"),
);
var response = client.agreements().get(request);
```

```json
[
  {
    "agreementKey": "value",
    "content": "value",
    "title": "value",
    "url": "value"
  }
]
```