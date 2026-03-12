# OrdersService

## Accessor

```java
var serviceAccessor = client.orders();
```

## Method Index

- `list`: `ListResponse`
- `get`: `GetResponse`

### list

Returns: `ListResponse`

```java
import io.github.communitysdks.godaddy.dto.orders.requests.ListRequest;
ListRequest request = new ListRequest(
    "value",
    "value",
    "value",
    1L,
);
var response = client.orders().list(request);
```

```json
{
  "orders": [
    {
      "createdAt": "value",
      "currency": "value",
      "items": [
        {
          "label": "value"
        }
      ],
      "orderId": "abc123",
      "parentOrderId": "abc123",
      "pricing": {
        "total": "value"
      }
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

### get

Returns: `GetResponse`

```java
import io.github.communitysdks.godaddy.dto.orders.requests.GetRequest;
GetRequest request = new GetRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.orders().get(request);
```

```json
{
  "billTo": {
    "contact": {
      "addressMailing": {
        "address1": "value",
        "address2": "value",
        "city": "value",
        "country": "AC",
        "postalCode": "value",
        "state": "value"
      },
      "email": "admin@example.com",
      "fax": "value",
      "jobTitle": "value",
      "nameFirst": "value",
      "nameLast": "value",
      "nameMiddle": "abc123",
      "organization": "value",
      "phone": "value"
    },
    "taxId": "abc123"
  },
  "createdAt": "value",
  "currency": "value",
  "items": [
    {
      "domains": [
        "example.com"
      ],
      "label": "value",
      "period": 1,
      "periodUnit": "MONTH",
      "pfid": 1,
      "pricing": {
        "discount": 1,
        "fees": {
          "icann": 1,
          "total": 1
        },
        "list": 1,
        "sale": 1,
        "savings": 1,
        "subtotal": 1,
        "taxes": 1,
        "unit": {}
      },
      "quantity": 1,
      "taxCollector": {
        "taxCollectorId": 1
      }
    }
  ],
  "orderId": "abc123",
  "parentOrderId": "abc123",
  "payments": [
    {
      "amount": 1,
      "category": "CREDIT_CARD",
      "paymentProfileId": "abc123",
      "subcategory": "CHECKING_PERSONAL"
    }
  ],
  "pricing": {
    "discount": 1,
    "fees": {
      "icann": 1,
      "total": 1
    },
    "id": 1,
    "list": 1,
    "savings": 1,
    "subtotal": 1,
    "taxes": 1,
    "taxDetails": [
      {
        "amount": 1,
        "rate": 1
      }
    ],
    "total": 1
  }
}
```