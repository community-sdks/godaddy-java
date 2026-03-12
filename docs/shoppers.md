# ShoppersService

## Accessor

```java
var serviceAccessor = client.shoppers();
```

## Method Index

- `createSubaccount`: `CreateSubaccountResponse`
- `get`: `GetResponse`
- `update`: `UpdateResponse`
- `delete`: `DeleteResponse`
- `getStatus`: `GetStatusResponse`
- `changePassword`: `ChangePasswordResponse`

### createSubaccount

Returns: `CreateSubaccountResponse`

```java
import io.github.communitysdks.godaddy.dto.shoppers.requests.CreateSubaccountRequest;
CreateSubaccountRequest request = new CreateSubaccountRequest(
    "value",
);
var response = client.shoppers().createSubaccount(request);
```

```json
{
  "customerId": "123456",
  "shopperId": "987654"
}
```

### get

Returns: `GetResponse`

```java
import io.github.communitysdks.godaddy.dto.shoppers.requests.GetRequest;
GetRequest request = new GetRequest(
    "value",
    java.util.List.of("value"),
);
var response = client.shoppers().get(request);
```

```json
{
  "customerId": "123456",
  "email": "admin@example.com",
  "externalId": 1,
  "marketId": "abc123",
  "nameFirst": "value",
  "nameLast": "value",
  "shopperId": "987654"
}
```

### update

Returns: `UpdateResponse`

```java
import io.github.communitysdks.godaddy.dto.shoppers.requests.UpdateRequest;
UpdateRequest request = new UpdateRequest(
    "value",
    "value",
);
var response = client.shoppers().update(request);
```

```json
{
  "customerId": "123456",
  "shopperId": "987654"
}
```

### delete

Returns: `DeleteResponse`

```java
import io.github.communitysdks.godaddy.dto.shoppers.requests.DeleteRequest;
DeleteRequest request = new DeleteRequest(
    "value",
    "value",
);
var response = client.shoppers().delete(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### getStatus

Returns: `GetStatusResponse`

```java
import io.github.communitysdks.godaddy.dto.shoppers.requests.GetStatusRequest;
GetStatusRequest request = new GetStatusRequest(
    "value",
    "value",
);
var response = client.shoppers().getStatus(request);
```

```json
{
  "billingState": "ABANDONED"
}
```

### changePassword

Returns: `ChangePasswordResponse`

```java
import io.github.communitysdks.godaddy.dto.shoppers.requests.ChangePasswordRequest;
ChangePasswordRequest request = new ChangePasswordRequest(
    "value",
    "value",
);
var response = client.shoppers().changePassword(request);
```

```json
{
  "customerId": "123456",
  "shopperId": "987654"
}
```