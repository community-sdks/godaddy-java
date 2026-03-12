# SubscriptionsService

## Accessor

```java
var serviceAccessor = client.subscriptions();
```

## Method Index

- `list`: `ListResponse`
- `productGroups`: `ProductGroupsResponse`
- `get`: `GetResponse`
- `update`: `UpdateResponse`
- `cancel`: `CancelResponse`

### list

Returns: `ListResponse`

```java
import io.github.communitysdks.godaddy.dto.subscriptions.requests.ListRequest;
ListRequest request = new ListRequest(
    "value",
    "value",
    "value",
    java.util.List.of("value"),
);
var response = client.subscriptions().list(request);
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
  "subscriptions": [
    {
      "addons": [
        {
          "commitment": "PAID",
          "pfid": 1,
          "quantity": 1
        }
      ],
      "billing": {
        "commitment": "PAID",
        "pastDueTypes": [
          "ADDON"
        ],
        "renewAt": "value",
        "status": "CURRENT"
      },
      "cancelable": true,
      "createdAt": "value",
      "expiresAt": "value",
      "label": "value",
      "launchUrl": "value",
      "paymentProfileId": 1,
      "priceLocked": true,
      "product": {
        "label": "value",
        "namespace": "value",
        "pfid": 1,
        "productGroupKey": "value",
        "renewalPeriod": 1,
        "renewalPeriodUnit": "MONTH",
        "renewalPfid": 1,
        "supportBillOn": true
      },
      "relations": {
        "children": [
          "value"
        ],
        "parent": "value"
      },
      "renewAuto": true,
      "renewable": true,
      "status": "ACTIVE",
      "subscriptionId": "abc123",
      "upgradeable": true
    }
  ]
}
```

### productGroups

Returns: `ProductGroupsResponse`

```java
import io.github.communitysdks.godaddy.dto.subscriptions.requests.ProductGroupsRequest;
ProductGroupsRequest request = new ProductGroupsRequest(
    "value",
    "value",
);
var response = client.subscriptions().productGroups(request);
```

```json
[
  {
    "productGroupKey": "value",
    "subscriptionCount": 1
  }
]
```

### get

Returns: `GetResponse`

```java
import io.github.communitysdks.godaddy.dto.subscriptions.requests.GetRequest;
GetRequest request = new GetRequest(
    "value",
    "value",
    "value",
);
var response = client.subscriptions().get(request);
```

```json
{
  "addons": [
    {
      "commitment": "PAID",
      "pfid": 1,
      "quantity": 1
    }
  ],
  "billing": {
    "commitment": "PAID",
    "pastDueTypes": [
      "ADDON"
    ],
    "renewAt": "value",
    "status": "CURRENT"
  },
  "cancelable": true,
  "createdAt": "value",
  "expiresAt": "value",
  "label": "value",
  "launchUrl": "value",
  "paymentProfileId": 1,
  "priceLocked": true,
  "product": {
    "label": "value",
    "namespace": "value",
    "pfid": 1,
    "productGroupKey": "value",
    "renewalPeriod": 1,
    "renewalPeriodUnit": "MONTH",
    "renewalPfid": 1,
    "supportBillOn": true
  },
  "relations": {
    "children": [
      "value"
    ],
    "parent": "value"
  },
  "renewAuto": true,
  "renewable": true,
  "status": "ACTIVE",
  "subscriptionId": "abc123",
  "upgradeable": true
}
```

### update

Returns: `UpdateResponse`

```java
import io.github.communitysdks.godaddy.dto.subscriptions.requests.UpdateRequest;
UpdateRequest request = new UpdateRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.subscriptions().update(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### cancel

Returns: `CancelResponse`

```java
import io.github.communitysdks.godaddy.dto.subscriptions.requests.CancelRequest;
CancelRequest request = new CancelRequest(
    "value",
    "value",
    "value",
);
var response = client.subscriptions().cancel(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```