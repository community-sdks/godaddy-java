# DomainsService

## Accessor

```java
var serviceAccessor = client.domains();
```

## Method Index

- `list`: `ListResponse`
- `getAgreement`: `GetAgreementResponse`
- `available`: `AvailableResponse`
- `availableBulk`: `AvailableBulkResponse`
- `contactsValidate`: `ContactsValidateResponse`
- `purchase`: `PurchaseResponse`
- `schema`: `SchemaResponse`
- `validate`: `ValidateResponse`
- `suggest`: `SuggestResponse`
- `tlds`: `TldsResponse`
- `get`: `GetResponse`
- `update`: `UpdateResponse`
- `cancel`: `CancelResponse`
- `updateContacts`: `UpdateContactsResponse`
- `cancelPrivacy`: `CancelPrivacyResponse`
- `purchasePrivacy`: `PurchasePrivacyResponse`
- `recordReplace`: `RecordReplaceResponse`
- `recordAdd`: `RecordAddResponse`
- `recordGet`: `RecordGetResponse`
- `recordReplaceTypeName`: `RecordReplaceTypeNameResponse`
- `recordDeleteTypeName`: `RecordDeleteTypeNameResponse`
- `recordReplaceType`: `RecordReplaceTypeResponse`
- `renew`: `RenewResponse`
- `transferIn`: `TransferInResponse`
- `verifyEmail`: `VerifyEmailResponse`
- `getV2CustomersCustomerIdDomainsDomain`: `GetV2CustomersCustomerIdDomainsDomainResponse`
- `getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant`: `GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse`
- `deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant`: `DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse`
- `patchV2CustomersCustomerIdDomainsDomainDnssecRecords`: `PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse`
- `deleteV2CustomersCustomerIdDomainsDomainDnssecRecords`: `DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse`
- `putV2CustomersCustomerIdDomainsDomainNameServers`: `PutV2CustomersCustomerIdDomainsDomainNameServersResponse`
- `getV2CustomersCustomerIdDomainsDomainPrivacyForwarding`: `GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse`
- `patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding`: `PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse`
- `postV2CustomersCustomerIdDomainsDomainRedeem`: `PostV2CustomersCustomerIdDomainsDomainRedeemResponse`
- `postV2CustomersCustomerIdDomainsDomainRenew`: `PostV2CustomersCustomerIdDomainsDomainRenewResponse`
- `getV2CustomersCustomerIdDomainsDomainTransfer`: `GetV2CustomersCustomerIdDomainsDomainTransferResponse`
- `postV2CustomersCustomerIdDomainsDomainTransfer`: `PostV2CustomersCustomerIdDomainsDomainTransferResponse`
- `postV2CustomersCustomerIdDomainsDomainTransferValidate`: `PostV2CustomersCustomerIdDomainsDomainTransferValidateResponse`
- `postV2CustomersCustomerIdDomainsDomainTransferInAccept`: `PostV2CustomersCustomerIdDomainsDomainTransferInAcceptResponse`
- `postV2CustomersCustomerIdDomainsDomainTransferInCancel`: `PostV2CustomersCustomerIdDomainsDomainTransferInCancelResponse`
- `postV2CustomersCustomerIdDomainsDomainTransferInRestart`: `PostV2CustomersCustomerIdDomainsDomainTransferInRestartResponse`
- `postV2CustomersCustomerIdDomainsDomainTransferInRetry`: `PostV2CustomersCustomerIdDomainsDomainTransferInRetryResponse`
- `postV2CustomersCustomerIdDomainsDomainTransferOut`: `PostV2CustomersCustomerIdDomainsDomainTransferOutResponse`
- `postV2CustomersCustomerIdDomainsDomainTransferOutAccept`: `PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptResponse`
- `postV2CustomersCustomerIdDomainsDomainTransferOutReject`: `PostV2CustomersCustomerIdDomainsDomainTransferOutRejectResponse`
- `domainsForwardsGet`: `DomainsForwardsGetResponse`
- `domainsForwardsPost`: `DomainsForwardsPostResponse`
- `domainsForwardsPut`: `DomainsForwardsPutResponse`
- `domainsForwardsDelete`: `DomainsForwardsDeleteResponse`
- `getV2CustomersCustomerIdDomainsDomainActions`: `GetV2CustomersCustomerIdDomainsDomainActionsResponse`
- `getV2CustomersCustomerIdDomainsDomainActionsType`: `GetV2CustomersCustomerIdDomainsDomainActionsTypeResponse`
- `deleteV2CustomersCustomerIdDomainsDomainActionsType`: `DeleteV2CustomersCustomerIdDomainsDomainActionsTypeResponse`
- `getV2CustomersCustomerIdDomainsNotifications`: `GetV2CustomersCustomerIdDomainsNotificationsResponse`
- `getV2CustomersCustomerIdDomainsNotificationsOptIn`: `GetV2CustomersCustomerIdDomainsNotificationsOptInResponse`
- `putV2CustomersCustomerIdDomainsNotificationsOptIn`: `PutV2CustomersCustomerIdDomainsNotificationsOptInResponse`
- `getV2CustomersCustomerIdDomainsNotificationsSchemasType`: `GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeResponse`
- `postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge`: `PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeResponse`
- `postV2CustomersCustomerIdDomainsRegister`: `PostV2CustomersCustomerIdDomainsRegisterResponse`
- `getV2CustomersCustomerIdDomainsRegisterSchemaTld`: `GetV2CustomersCustomerIdDomainsRegisterSchemaTldResponse`
- `postV2CustomersCustomerIdDomainsRegisterValidate`: `PostV2CustomersCustomerIdDomainsRegisterValidateResponse`
- `getV2DomainsMaintenances`: `GetV2DomainsMaintenancesResponse`
- `getV2DomainsMaintenancesMaintenanceId`: `GetV2DomainsMaintenancesMaintenanceIdResponse`
- `getV2DomainsUsageYyyymm`: `GetV2DomainsUsageYyyymmResponse`
- `patchV2CustomersCustomerIdDomainsDomainContacts`: `PatchV2CustomersCustomerIdDomainsDomainContactsResponse`
- `postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode`: `PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeResponse`

### list

Returns: `ListResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.ListRequest;
ListRequest request = new ListRequest(
    "value",
    java.util.List.of("value"),
    java.util.List.of("value"),
    1L,
);
var response = client.domains().list(request);
```

```json
[
  {
    "authCode": "value",
    "contactAdmin": {
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
    "contactBilling": {
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
    "contactRegistrant": {
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
    "contactTech": {
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
    "createdAt": "value",
    "deletedAt": "value",
    "transferAwayEligibleAt": "value",
    "domain": "example.com",
    "domainId": 1,
    "expirationProtected": true,
    "expires": "value",
    "exposeWhois": true,
    "holdRegistrar": true,
    "locked": true,
    "nameServers": [
      "value"
    ],
    "privacy": true,
    "registrarCreatedAt": "value",
    "renewAuto": true,
    "renewDeadline": "value",
    "renewable": true,
    "status": "ACTIVE",
    "transferProtected": true
  }
]
```

### getAgreement

Returns: `GetAgreementResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetAgreementRequest;
GetAgreementRequest request = new GetAgreementRequest(
    "value",
    java.util.List.of("value"),
    Boolean.TRUE,
    Boolean.TRUE,
);
var response = client.domains().getAgreement(request);
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

### available

Returns: `AvailableResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.AvailableRequest;
AvailableRequest request = new AvailableRequest(
    "value",
    "value",
    Boolean.TRUE,
);
var response = client.domains().available(request);
```

```json
{
  "available": true,
  "currency": "value",
  "definitive": true,
  "domain": "example.com",
  "period": 1,
  "price": 1
}
```

### availableBulk

Returns: `AvailableBulkResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.AvailableBulkRequest;
AvailableBulkRequest request = new AvailableBulkRequest(
    java.util.List.of("value"),
    "value",
);
var response = client.domains().availableBulk(request);
```

```json
{
  "domains": [
    {
      "available": true,
      "currency": "value",
      "definitive": true,
      "domain": "example.com",
      "period": 1,
      "price": 1
    }
  ]
}
```

### contactsValidate

Returns: `ContactsValidateResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.ContactsValidateRequest;
ContactsValidateRequest request = new ContactsValidateRequest(
    1L,
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().contactsValidate(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### purchase

Returns: `PurchaseResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PurchaseRequest;
PurchaseRequest request = new PurchaseRequest(
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().purchase(request);
```

```json
{
  "currency": "value",
  "itemCount": 1,
  "orderId": 1,
  "total": 1
}
```

### schema

Returns: `SchemaResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.SchemaRequest;
SchemaRequest request = new SchemaRequest(
    "value",
);
var response = client.domains().schema(request);
```

```json
{
  "id": "abc123",
  "models": {},
  "properties": {},
  "required": [
    "value"
  ]
}
```

### validate

Returns: `ValidateResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.ValidateRequest;
ValidateRequest request = new ValidateRequest(
    java.util.Map.of("key", "value"),
);
var response = client.domains().validate(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### suggest

Returns: `SuggestResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.SuggestRequest;
SuggestRequest request = new SuggestRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.domains().suggest(request);
```

```json
[
  {
    "domain": "example.com"
  }
]
```

### tlds

Returns: `TldsResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.TldsRequest;
var response = client.domains().tlds(new TldsRequest());
```

```json
[
  {
    "name": "value",
    "type": "COUNTRY_CODE"
  }
]
```

### get

Returns: `GetResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetRequest;
GetRequest request = new GetRequest(
    "value",
    "value",
);
var response = client.domains().get(request);
```

```json
{
  "authCode": "value",
  "contactAdmin": {
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
  "contactBilling": {
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
  "contactRegistrant": {
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
  "contactTech": {
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
  "createdAt": "value",
  "deletedAt": "value",
  "transferAwayEligibleAt": "value",
  "domain": "example.com",
  "domainId": 1,
  "expirationProtected": true,
  "expires": "value",
  "exposeRegistrantOrganization": true,
  "exposeWhois": true,
  "holdRegistrar": true,
  "locked": true,
  "nameServers": [
    "value"
  ],
  "privacy": true,
  "registrarCreatedAt": "value",
  "renewAuto": true,
  "renewDeadline": "value",
  "status": "ACTIVE",
  "subaccountId": "abc123",
  "transferProtected": true,
  "verifications": {
    "domainName": {
      "status": "APPROVED"
    },
    "realName": {
      "status": "APPROVED"
    }
  }
}
```

### update

Returns: `UpdateResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.UpdateRequest;
UpdateRequest request = new UpdateRequest(
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().update(request);
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
import io.github.communitysdks.godaddy.dto.domains.requests.CancelRequest;
CancelRequest request = new CancelRequest(
    "value",
);
var response = client.domains().cancel(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### updateContacts

Returns: `UpdateContactsResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.UpdateContactsRequest;
UpdateContactsRequest request = new UpdateContactsRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().updateContacts(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### cancelPrivacy

Returns: `CancelPrivacyResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.CancelPrivacyRequest;
CancelPrivacyRequest request = new CancelPrivacyRequest(
    "value",
    "value",
);
var response = client.domains().cancelPrivacy(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### purchasePrivacy

Returns: `PurchasePrivacyResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PurchasePrivacyRequest;
PurchasePrivacyRequest request = new PurchasePrivacyRequest(
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().purchasePrivacy(request);
```

```json
{
  "currency": "value",
  "itemCount": 1,
  "orderId": 1,
  "total": 1
}
```

### recordReplace

Returns: `RecordReplaceResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.RecordReplaceRequest;
RecordReplaceRequest request = new RecordReplaceRequest(
    "value",
    "value",
    java.util.List.of("value"),
);
var response = client.domains().recordReplace(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### recordAdd

Returns: `RecordAddResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.RecordAddRequest;
RecordAddRequest request = new RecordAddRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().recordAdd(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### recordGet

Returns: `RecordGetResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.RecordGetRequest;
RecordGetRequest request = new RecordGetRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.domains().recordGet(request);
```

```json
[
  {
    "data": "value",
    "name": "value",
    "port": 1,
    "priority": 1,
    "protocol": "value",
    "service": "value",
    "ttl": 1,
    "type": "A",
    "weight": 1
  }
]
```

### recordReplaceTypeName

Returns: `RecordReplaceTypeNameResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.RecordReplaceTypeNameRequest;
RecordReplaceTypeNameRequest request = new RecordReplaceTypeNameRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.domains().recordReplaceTypeName(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### recordDeleteTypeName

Returns: `RecordDeleteTypeNameResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.RecordDeleteTypeNameRequest;
RecordDeleteTypeNameRequest request = new RecordDeleteTypeNameRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.domains().recordDeleteTypeName(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### recordReplaceType

Returns: `RecordReplaceTypeResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.RecordReplaceTypeRequest;
RecordReplaceTypeRequest request = new RecordReplaceTypeRequest(
    "value",
    "value",
    "value",
    java.util.List.of("value"),
);
var response = client.domains().recordReplaceType(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### renew

Returns: `RenewResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.RenewRequest;
RenewRequest request = new RenewRequest(
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().renew(request);
```

```json
{
  "currency": "value",
  "itemCount": 1,
  "orderId": 1,
  "total": 1
}
```

### transferIn

Returns: `TransferInResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.TransferInRequest;
TransferInRequest request = new TransferInRequest(
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().transferIn(request);
```

```json
{
  "currency": "value",
  "itemCount": 1,
  "orderId": 1,
  "total": 1
}
```

### verifyEmail

Returns: `VerifyEmailResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.VerifyEmailRequest;
VerifyEmailRequest request = new VerifyEmailRequest(
    "value",
    "value",
);
var response = client.domains().verifyEmail(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### getV2CustomersCustomerIdDomainsDomain

Returns: `GetV2CustomersCustomerIdDomainsDomainResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainRequest;
GetV2CustomersCustomerIdDomainsDomainRequest request = new GetV2CustomersCustomerIdDomainsDomainRequest(
    "value",
    "value",
    "value",
    java.util.List.of("value"),
);
var response = client.domains().getV2CustomersCustomerIdDomainsDomain(request);
```

```json
{
  "domainId": "example.com",
  "domain": "example.com",
  "subaccountId": "abc123",
  "status": "ACTIVE",
  "expiresAt": "value",
  "expirationProtected": true,
  "holdRegistrar": true,
  "locked": true,
  "privacy": true,
  "registrarCreatedAt": "value",
  "renewAuto": true,
  "renewDeadline": "value",
  "transferProtected": true,
  "createdAt": "value",
  "deletedAt": "value",
  "modifiedAt": "value",
  "transferAwayEligibleAt": "value",
  "authCode": "value",
  "nameServers": [
    "value"
  ],
  "hostnames": [
    "value"
  ],
  "renewal": {
    "renewable": true,
    "price": 1,
    "currency": "value"
  },
  "verifications": {
    "icann": "COMPLETED",
    "realName": "APPROVED",
    "domainName": "APPROVED"
  },
  "contacts": {
    "registrant": {
      "contactId": "abc123",
      "encoding": "ASCII",
      "nameFirst": "value",
      "nameMiddle": "abc123",
      "nameLast": "value",
      "organization": "value",
      "jobTitle": "value",
      "email": "admin@example.com",
      "phone": "value",
      "fax": "value",
      "addressMailing": {
        "address1": "value",
        "address2": "value",
        "city": "value",
        "country": "AC",
        "postalCode": "value",
        "state": "value"
      },
      "exposeRegistrantOrganization": true,
      "exposeWhois": true,
      "metadata": {},
      "tlds": [
        "value"
      ],
      "_createdAt": "value",
      "_modifiedAt": "value",
      "_deleted": true,
      "_revision": 1
    },
    "admin": {
      "contactId": "abc123",
      "encoding": "ASCII",
      "nameFirst": "value",
      "nameMiddle": "abc123",
      "nameLast": "value",
      "organization": "value",
      "jobTitle": "value",
      "email": "admin@example.com",
      "phone": "value",
      "fax": "value",
      "addressMailing": {
        "address1": "value",
        "address2": "value",
        "city": "value",
        "country": "AC",
        "postalCode": "value",
        "state": "value"
      },
      "exposeRegistrantOrganization": true,
      "exposeWhois": true,
      "metadata": {},
      "tlds": [
        "value"
      ],
      "_createdAt": "value",
      "_modifiedAt": "value",
      "_deleted": true,
      "_revision": 1
    },
    "tech": {
      "contactId": "abc123",
      "encoding": "ASCII",
      "nameFirst": "value",
      "nameMiddle": "abc123",
      "nameLast": "value",
      "organization": "value",
      "jobTitle": "value",
      "email": "admin@example.com",
      "phone": "value",
      "fax": "value",
      "addressMailing": {
        "address1": "value",
        "address2": "value",
        "city": "value",
        "country": "AC",
        "postalCode": "value",
        "state": "value"
      },
      "exposeRegistrantOrganization": true,
      "exposeWhois": true,
      "metadata": {},
      "tlds": [
        "value"
      ],
      "_createdAt": "value",
      "_modifiedAt": "value",
      "_deleted": true,
      "_revision": 1
    },
    "billing": {
      "contactId": "abc123",
      "encoding": "ASCII",
      "nameFirst": "value",
      "nameMiddle": "abc123",
      "nameLast": "value",
      "organization": "value",
      "jobTitle": "value",
      "email": "admin@example.com",
      "phone": "value",
      "fax": "value",
      "addressMailing": {
        "address1": "value",
        "address2": "value",
        "city": "value",
        "country": "AC",
        "postalCode": "value",
        "state": "value"
      },
      "exposeRegistrantOrganization": true,
      "exposeWhois": true,
      "metadata": {},
      "tlds": [
        "value"
      ],
      "_createdAt": "value",
      "_modifiedAt": "value",
      "_deleted": true,
      "_revision": 1
    }
  },
  "actions": [
    {
      "type": "AUTH_CODE_PURCHASE",
      "origination": "USER",
      "createdAt": "value",
      "startedAt": "value",
      "completedAt": "value",
      "modifiedAt": "value",
      "status": "ACCEPTED",
      "reason": {
        "code": "value",
        "message": "value",
        "fields": [
          {}
        ]
      },
      "requestId": "abc123"
    }
  ],
  "dnssecRecords": [
    {
      "algorithm": "RSAMD5",
      "keyTag": 1,
      "digestType": "SHA1",
      "digest": "value",
      "flags": "ZSK",
      "publicKey": "value",
      "maxSignatureLife": 1
    }
  ],
  "registryStatusCodes": [
    "ADD_PERIOD"
  ]
}
```

### getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant

Returns: `GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest;
GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest request = new GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant(request);
```

```json
{
  "createDate": "2024-01-01T00:00:00Z",
  "gainingContact": {
    "email": "admin@example.com",
    "firstName": "value",
    "lastName": "value",
    "organization": "value"
  },
  "losingContact": {
    "email": "admin@example.com",
    "firstName": "value",
    "lastName": "value",
    "organization": "value"
  },
  "otherDomainsAffected": 1,
  "shopperEmail": "admin@example.com"
}
```

### deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant

Returns: `DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest;
DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest request = new DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### patchV2CustomersCustomerIdDomainsDomainDnssecRecords

Returns: `PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest;
PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest request = new PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest(
    "value",
    "value",
    "value",
    java.util.List.of("value"),
);
var response = client.domains().patchV2CustomersCustomerIdDomainsDomainDnssecRecords(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### deleteV2CustomersCustomerIdDomainsDomainDnssecRecords

Returns: `DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest;
DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest request = new DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest(
    "value",
    "value",
    "value",
    java.util.List.of("value"),
);
var response = client.domains().deleteV2CustomersCustomerIdDomainsDomainDnssecRecords(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### putV2CustomersCustomerIdDomainsDomainNameServers

Returns: `PutV2CustomersCustomerIdDomainsDomainNameServersResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PutV2CustomersCustomerIdDomainsDomainNameServersRequest;
PutV2CustomersCustomerIdDomainsDomainNameServersRequest request = new PutV2CustomersCustomerIdDomainsDomainNameServersRequest(
    "value",
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().putV2CustomersCustomerIdDomainsDomainNameServers(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### getV2CustomersCustomerIdDomainsDomainPrivacyForwarding

Returns: `GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest;
GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest request = new GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().getV2CustomersCustomerIdDomainsDomainPrivacyForwarding(request);
```

```json
{
  "privateEmail": "admin@example.com",
  "forwardingEmail": "admin@example.com",
  "emailPreference": "EMAIL_FILTER"
}
```

### patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding

Returns: `PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest;
PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest request = new PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest(
    "value",
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainRedeem

Returns: `PostV2CustomersCustomerIdDomainsDomainRedeemResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainRedeemRequest;
PostV2CustomersCustomerIdDomainsDomainRedeemRequest request = new PostV2CustomersCustomerIdDomainsDomainRedeemRequest(
    "value",
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainRedeem(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainRenew

Returns: `PostV2CustomersCustomerIdDomainsDomainRenewResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainRenewRequest;
PostV2CustomersCustomerIdDomainsDomainRenewRequest request = new PostV2CustomersCustomerIdDomainsDomainRenewRequest(
    "value",
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainRenew(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### getV2CustomersCustomerIdDomainsDomainTransfer

Returns: `GetV2CustomersCustomerIdDomainsDomainTransferResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainTransferRequest;
GetV2CustomersCustomerIdDomainsDomainTransferRequest request = new GetV2CustomersCustomerIdDomainsDomainTransferRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().getV2CustomersCustomerIdDomainsDomainTransfer(request);
```

```json
{
  "transferStatusCodes": [
    "CLIENT_APPROVED"
  ]
}
```

### postV2CustomersCustomerIdDomainsDomainTransfer

Returns: `PostV2CustomersCustomerIdDomainsDomainTransferResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferRequest;
PostV2CustomersCustomerIdDomainsDomainTransferRequest request = new PostV2CustomersCustomerIdDomainsDomainTransferRequest(
    "value",
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransfer(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainTransferValidate

Returns: `PostV2CustomersCustomerIdDomainsDomainTransferValidateResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferValidateRequest;
PostV2CustomersCustomerIdDomainsDomainTransferValidateRequest request = new PostV2CustomersCustomerIdDomainsDomainTransferValidateRequest(
    "value",
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferValidate(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainTransferInAccept

Returns: `PostV2CustomersCustomerIdDomainsDomainTransferInAcceptResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferInAcceptRequest;
PostV2CustomersCustomerIdDomainsDomainTransferInAcceptRequest request = new PostV2CustomersCustomerIdDomainsDomainTransferInAcceptRequest(
    "value",
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferInAccept(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainTransferInCancel

Returns: `PostV2CustomersCustomerIdDomainsDomainTransferInCancelResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferInCancelRequest;
PostV2CustomersCustomerIdDomainsDomainTransferInCancelRequest request = new PostV2CustomersCustomerIdDomainsDomainTransferInCancelRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferInCancel(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainTransferInRestart

Returns: `PostV2CustomersCustomerIdDomainsDomainTransferInRestartResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferInRestartRequest;
PostV2CustomersCustomerIdDomainsDomainTransferInRestartRequest request = new PostV2CustomersCustomerIdDomainsDomainTransferInRestartRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferInRestart(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainTransferInRetry

Returns: `PostV2CustomersCustomerIdDomainsDomainTransferInRetryResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest;
PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest request = new PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest(
    "value",
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferInRetry(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainTransferOut

Returns: `PostV2CustomersCustomerIdDomainsDomainTransferOutResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferOutRequest;
PostV2CustomersCustomerIdDomainsDomainTransferOutRequest request = new PostV2CustomersCustomerIdDomainsDomainTransferOutRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferOut(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainTransferOutAccept

Returns: `PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptRequest;
PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptRequest request = new PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferOutAccept(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainTransferOutReject

Returns: `PostV2CustomersCustomerIdDomainsDomainTransferOutRejectResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest;
PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest request = new PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferOutReject(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### domainsForwardsGet

Returns: `DomainsForwardsGetResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.DomainsForwardsGetRequest;
DomainsForwardsGetRequest request = new DomainsForwardsGetRequest(
    "value",
    "value",
    Boolean.TRUE,
);
var response = client.domains().domainsForwardsGet(request);
```

```json
[
  {
    "fqdn": "value",
    "type": "MASKED",
    "url": "value",
    "mask": {
      "title": "value",
      "description": "value",
      "keywords": "value"
    }
  }
]
```

### domainsForwardsPost

Returns: `DomainsForwardsPostResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.DomainsForwardsPostRequest;
DomainsForwardsPostRequest request = new DomainsForwardsPostRequest(
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().domainsForwardsPost(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### domainsForwardsPut

Returns: `DomainsForwardsPutResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.DomainsForwardsPutRequest;
DomainsForwardsPutRequest request = new DomainsForwardsPutRequest(
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().domainsForwardsPut(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### domainsForwardsDelete

Returns: `DomainsForwardsDeleteResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.DomainsForwardsDeleteRequest;
DomainsForwardsDeleteRequest request = new DomainsForwardsDeleteRequest(
    "value",
    "value",
);
var response = client.domains().domainsForwardsDelete(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### getV2CustomersCustomerIdDomainsDomainActions

Returns: `GetV2CustomersCustomerIdDomainsDomainActionsResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainActionsRequest;
GetV2CustomersCustomerIdDomainsDomainActionsRequest request = new GetV2CustomersCustomerIdDomainsDomainActionsRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().getV2CustomersCustomerIdDomainsDomainActions(request);
```

```json
[
  {
    "type": "AUTH_CODE_PURCHASE",
    "origination": "USER",
    "createdAt": "value",
    "startedAt": "value",
    "completedAt": "value",
    "modifiedAt": "value",
    "status": "ACCEPTED",
    "reason": {
      "code": "value",
      "message": "value",
      "fields": [
        {
          "code": "value",
          "message": "value",
          "path": "value",
          "pathRelated": "value"
        }
      ]
    },
    "requestId": "abc123"
  }
]
```

### getV2CustomersCustomerIdDomainsDomainActionsType

Returns: `GetV2CustomersCustomerIdDomainsDomainActionsTypeResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainActionsTypeRequest;
GetV2CustomersCustomerIdDomainsDomainActionsTypeRequest request = new GetV2CustomersCustomerIdDomainsDomainActionsTypeRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.domains().getV2CustomersCustomerIdDomainsDomainActionsType(request);
```

```json
{
  "type": "AUTH_CODE_PURCHASE",
  "origination": "USER",
  "createdAt": "value",
  "startedAt": "value",
  "completedAt": "value",
  "modifiedAt": "value",
  "status": "ACCEPTED",
  "reason": {
    "code": "value",
    "message": "value",
    "fields": [
      {
        "code": "value",
        "message": "value",
        "path": "value",
        "pathRelated": "value"
      }
    ]
  },
  "requestId": "abc123"
}
```

### deleteV2CustomersCustomerIdDomainsDomainActionsType

Returns: `DeleteV2CustomersCustomerIdDomainsDomainActionsTypeResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest;
DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest request = new DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.domains().deleteV2CustomersCustomerIdDomainsDomainActionsType(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### getV2CustomersCustomerIdDomainsNotifications

Returns: `GetV2CustomersCustomerIdDomainsNotificationsResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsNotificationsRequest;
GetV2CustomersCustomerIdDomainsNotificationsRequest request = new GetV2CustomersCustomerIdDomainsNotificationsRequest(
    "value",
    "value",
);
var response = client.domains().getV2CustomersCustomerIdDomainsNotifications(request);
```

```json
{
  "notificationId": "abc123",
  "type": "AUTH_CODE_PURCHASE",
  "resource": "value",
  "resourceType": "CONTACT",
  "status": "AWAITING",
  "addedAt": "value",
  "requestId": "abc123",
  "metadata": {}
}
```

### getV2CustomersCustomerIdDomainsNotificationsOptIn

Returns: `GetV2CustomersCustomerIdDomainsNotificationsOptInResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsNotificationsOptInRequest;
GetV2CustomersCustomerIdDomainsNotificationsOptInRequest request = new GetV2CustomersCustomerIdDomainsNotificationsOptInRequest(
    "value",
    "value",
);
var response = client.domains().getV2CustomersCustomerIdDomainsNotificationsOptIn(request);
```

```json
[
  {
    "notificationId": "abc123",
    "type": "AUTH_CODE_PURCHASE",
    "resource": "value",
    "resourceType": "CONTACT",
    "status": "AWAITING",
    "addedAt": "value",
    "requestId": "abc123",
    "metadata": {}
  }
]
```

### putV2CustomersCustomerIdDomainsNotificationsOptIn

Returns: `PutV2CustomersCustomerIdDomainsNotificationsOptInResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PutV2CustomersCustomerIdDomainsNotificationsOptInRequest;
PutV2CustomersCustomerIdDomainsNotificationsOptInRequest request = new PutV2CustomersCustomerIdDomainsNotificationsOptInRequest(
    "value",
    "value",
    java.util.List.of("value"),
);
var response = client.domains().putV2CustomersCustomerIdDomainsNotificationsOptIn(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### getV2CustomersCustomerIdDomainsNotificationsSchemasType

Returns: `GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest;
GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest request = new GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().getV2CustomersCustomerIdDomainsNotificationsSchemasType(request);
```

```json
{
  "id": "abc123",
  "models": {},
  "properties": {},
  "required": [
    "value"
  ]
}
```

### postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge

Returns: `PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest;
PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest request = new PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsRegister

Returns: `PostV2CustomersCustomerIdDomainsRegisterResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsRegisterRequest;
PostV2CustomersCustomerIdDomainsRegisterRequest request = new PostV2CustomersCustomerIdDomainsRegisterRequest(
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().postV2CustomersCustomerIdDomainsRegister(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### getV2CustomersCustomerIdDomainsRegisterSchemaTld

Returns: `GetV2CustomersCustomerIdDomainsRegisterSchemaTldResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest;
GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest request = new GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().getV2CustomersCustomerIdDomainsRegisterSchemaTld(request);
```

```json
{
  "id": "abc123",
  "models": {},
  "properties": {},
  "required": [
    "value"
  ]
}
```

### postV2CustomersCustomerIdDomainsRegisterValidate

Returns: `PostV2CustomersCustomerIdDomainsRegisterValidateResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsRegisterValidateRequest;
PostV2CustomersCustomerIdDomainsRegisterValidateRequest request = new PostV2CustomersCustomerIdDomainsRegisterValidateRequest(
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().postV2CustomersCustomerIdDomainsRegisterValidate(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### getV2DomainsMaintenances

Returns: `GetV2DomainsMaintenancesResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2DomainsMaintenancesRequest;
GetV2DomainsMaintenancesRequest request = new GetV2DomainsMaintenancesRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.domains().getV2DomainsMaintenances(request);
```

```json
{
  "createdAt": "value",
  "endsAt": "value",
  "environment": "OTE",
  "maintenanceId": "abc123",
  "modifiedAt": "value",
  "reason": "EMERGENCY",
  "startsAt": "value",
  "status": "ACTIVE",
  "summary": "value",
  "tlds": [
    "value"
  ],
  "type": "API"
}
```

### getV2DomainsMaintenancesMaintenanceId

Returns: `GetV2DomainsMaintenancesMaintenanceIdResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2DomainsMaintenancesMaintenanceIdRequest;
GetV2DomainsMaintenancesMaintenanceIdRequest request = new GetV2DomainsMaintenancesMaintenanceIdRequest(
    "value",
    "value",
);
var response = client.domains().getV2DomainsMaintenancesMaintenanceId(request);
```

```json
{
  "createdAt": "value",
  "endsAt": "value",
  "environment": "OTE",
  "maintenanceId": "abc123",
  "modifiedAt": "value",
  "reason": "EMERGENCY",
  "startsAt": "value",
  "status": "ACTIVE",
  "summary": "value",
  "systems": [
    {
      "name": "DOMAIN_CHECKS",
      "impact": [
        "DELAYED"
      ]
    }
  ],
  "tlds": [
    "value"
  ],
  "type": "API"
}
```

### getV2DomainsUsageYyyymm

Returns: `GetV2DomainsUsageYyyymmResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2DomainsUsageYyyymmRequest;
GetV2DomainsUsageYyyymmRequest request = new GetV2DomainsUsageYyyymmRequest(
    "value",
    "value",
    java.util.List.of("value"),
);
var response = client.domains().getV2DomainsUsageYyyymm(request);
```

```json
{
  "details": [
    {
      "path": "value",
      "total": 1
    }
  ],
  "quota": 1,
  "total": 1,
  "yyyymm": "value"
}
```

### patchV2CustomersCustomerIdDomainsDomainContacts

Returns: `PatchV2CustomersCustomerIdDomainsDomainContactsResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PatchV2CustomersCustomerIdDomainsDomainContactsRequest;
PatchV2CustomersCustomerIdDomainsDomainContactsRequest request = new PatchV2CustomersCustomerIdDomainsDomainContactsRequest(
    "value",
    "value",
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.domains().patchV2CustomersCustomerIdDomainsDomainContacts(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode

Returns: `PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeResponse`

```java
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeRequest;
PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeRequest request = new PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeRequest(
    "value",
    "value",
    "value",
);
var response = client.domains().postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```