# DomainsService

Domain availability, purchase, management, transfer, and DNS endpoints.

## Accessor

```java
var service = client.domains();
```

## Endpoints

### list

Calls `GET /v1/domains`.

```java
var response = client.domains().list("header-value", List.of("sample"), List.of("sample"), 1L, "sample", List.of("sample"), "sample");
```

```json
{}
```

### getAgreement

Calls `GET /v1/domains/agreements`.

```java
var response = client.domains().getAgreement(List.of("sample"), Boolean.TRUE, "header-value", Boolean.TRUE);
```

```json
{}
```

### available

Calls `GET /v1/domains/available`.

```java
var response = client.domains().available("sample", "sample", Boolean.TRUE);
```

```json
{}
```

### availableBulk

Calls `POST /v1/domains/available`.

```java
var response = client.domains().availableBulk(List.of("sample"), "sample");
```

```json
{}
```

### contactsValidate

Calls `POST /v1/domains/contacts/validate`.

```java
var response = client.domains().contactsValidate(Map.of("sample", true), "header-value", "sample");
```

```json
{}
```

### purchase

Calls `POST /v1/domains/purchase`.

```java
var response = client.domains().purchase(Map.of("sample", true), "header-value");
```

```json
{}
```

### schema

Calls `GET /v1/domains/purchase/schema/{tld}`.

```java
var response = client.domains().schema("sample");
```

```json
{}
```

### validate

Calls `POST /v1/domains/purchase/validate`.

```java
var response = client.domains().validate(Map.of("sample", true));
```

```json
{}
```

### suggest

Calls `GET /v1/domains/suggest`.

```java
var response = client.domains().suggest("header-value", "sample", "sample", "sample", List.of("sample"), List.of("sample"), 1L, 1L, 1L, 1L);
```

```json
{}
```

### tlds

Calls `GET /v1/domains/tlds`.

```java
var response = client.domains().tlds();
```

```json
{}
```

### cancel

Calls `DELETE /v1/domains/{domain}`.

```java
var response = client.domains().cancel("sample");
```

```json
{}
```

### get

Calls `GET /v1/domains/{domain}`.

```java
var response = client.domains().get("sample", "header-value");
```

```json
{}
```

### update

Calls `PATCH /v1/domains/{domain}`.

```java
var response = client.domains().update("sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### updateContacts

Calls `PATCH /v1/domains/{domain}/contacts`.

```java
var response = client.domains().updateContacts("sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### cancelPrivacy

Calls `DELETE /v1/domains/{domain}/privacy`.

```java
var response = client.domains().cancelPrivacy("sample", "header-value");
```

```json
{}
```

### purchasePrivacy

Calls `POST /v1/domains/{domain}/privacy/purchase`.

```java
var response = client.domains().purchasePrivacy("sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### recordAdd

Calls `PATCH /v1/domains/{domain}/records`.

```java
var response = client.domains().recordAdd("sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### recordReplace

Calls `PUT /v1/domains/{domain}/records`.

```java
var response = client.domains().recordReplace("sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### recordGet

Calls `GET /v1/domains/{domain}/records/{type}/{name}`.

```java
var response = client.domains().recordGet("sample", "sample", "sample", "header-value", 1L, 1L);
```

```json
{}
```

### recordReplaceTypeName

Calls `PUT /v1/domains/{domain}/records/{type}/{name}`.

```java
var response = client.domains().recordReplaceTypeName("sample", "sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### recordDeleteTypeName

Calls `DELETE /v1/domains/{domain}/records/{type}/{name}`.

```java
var response = client.domains().recordDeleteTypeName("sample", "sample", "sample", "header-value");
```

```json
{}
```

### recordReplaceType

Calls `PUT /v1/domains/{domain}/records/{type}`.

```java
var response = client.domains().recordReplaceType("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### renew

Calls `POST /v1/domains/{domain}/renew`.

```java
var response = client.domains().renew("sample", "header-value", Map.of("sample", true));
```

```json
{}
```

### transferIn

Calls `POST /v1/domains/{domain}/transfer`.

```java
var response = client.domains().transferIn("sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### verifyEmail

Calls `POST /v1/domains/{domain}/verifyRegistrantEmail`.

```java
var response = client.domains().verifyEmail("sample", "header-value");
```

```json
{}
```

### getV2CustomersCustomerIdDomainsDomain

Calls `GET /v2/customers/{customerId}/domains/{domain}`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsDomain("sample", "sample", "header-value", List.of("sample"));
```

```json
{}
```

### deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant

Calls `DELETE /v2/customers/{customerId}/domains/{domain}/changeOfRegistrant`.

```java
var response = client.domains().deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant("sample", "sample", "header-value");
```

```json
{}
```

### getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant

Calls `GET /v2/customers/{customerId}/domains/{domain}/changeOfRegistrant`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant("sample", "sample", "header-value");
```

```json
{}
```

### patchV2CustomersCustomerIdDomainsDomainDnssecRecords

Calls `PATCH /v2/customers/{customerId}/domains/{domain}/dnssecRecords`.

```java
var response = client.domains().patchV2CustomersCustomerIdDomainsDomainDnssecRecords("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### deleteV2CustomersCustomerIdDomainsDomainDnssecRecords

Calls `DELETE /v2/customers/{customerId}/domains/{domain}/dnssecRecords`.

```java
var response = client.domains().deleteV2CustomersCustomerIdDomainsDomainDnssecRecords("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### putV2CustomersCustomerIdDomainsDomainNameServers

Calls `PUT /v2/customers/{customerId}/domains/{domain}/nameServers`.

```java
var response = client.domains().putV2CustomersCustomerIdDomainsDomainNameServers("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### getV2CustomersCustomerIdDomainsDomainPrivacyForwarding

Calls `GET /v2/customers/{customerId}/domains/{domain}/privacy/forwarding`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsDomainPrivacyForwarding("sample", "sample", "header-value");
```

```json
{}
```

### patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding

Calls `PATCH /v2/customers/{customerId}/domains/{domain}/privacy/forwarding`.

```java
var response = client.domains().patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainRedeem

Calls `POST /v2/customers/{customerId}/domains/{domain}/redeem`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainRedeem("sample", "sample", "header-value", Map.of("sample", true));
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainRenew

Calls `POST /v2/customers/{customerId}/domains/{domain}/renew`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainRenew("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainTransfer

Calls `POST /v2/customers/{customerId}/domains/{domain}/transfer`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransfer("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### getV2CustomersCustomerIdDomainsDomainTransfer

Calls `GET /v2/customers/{customerId}/domains/{domain}/transfer`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsDomainTransfer("sample", "sample", "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainTransferValidate

Calls `POST /v2/customers/{customerId}/domains/{domain}/transfer/validate`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferValidate("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainTransferInAccept

Calls `POST /v2/customers/{customerId}/domains/{domain}/transferInAccept`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferInAccept("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainTransferInCancel

Calls `POST /v2/customers/{customerId}/domains/{domain}/transferInCancel`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferInCancel("sample", "sample", "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainTransferInRestart

Calls `POST /v2/customers/{customerId}/domains/{domain}/transferInRestart`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferInRestart("sample", "sample", "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainTransferInRetry

Calls `POST /v2/customers/{customerId}/domains/{domain}/transferInRetry`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferInRetry("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainTransferOut

Calls `POST /v2/customers/{customerId}/domains/{domain}/transferOut`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferOut("sample", "sample", "sample", "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainTransferOutAccept

Calls `POST /v2/customers/{customerId}/domains/{domain}/transferOutAccept`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferOutAccept("sample", "sample", "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainTransferOutReject

Calls `POST /v2/customers/{customerId}/domains/{domain}/transferOutReject`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainTransferOutReject("sample", "sample", "header-value", "sample");
```

```json
{}
```

### domainsForwardsDelete

Calls `DELETE /v2/customers/{customerId}/domains/forwards/{fqdn}`.

```java
var response = client.domains().domainsForwardsDelete("sample", "sample");
```

```json
{}
```

### domainsForwardsGet

Calls `GET /v2/customers/{customerId}/domains/forwards/{fqdn}`.

```java
var response = client.domains().domainsForwardsGet("sample", "sample", Boolean.TRUE);
```

```json
{}
```

### domainsForwardsPut

Calls `PUT /v2/customers/{customerId}/domains/forwards/{fqdn}`.

```java
var response = client.domains().domainsForwardsPut("sample", "sample", Map.of("sample", true));
```

```json
{}
```

### domainsForwardsPost

Calls `POST /v2/customers/{customerId}/domains/forwards/{fqdn}`.

```java
var response = client.domains().domainsForwardsPost("sample", "sample", Map.of("sample", true));
```

```json
{}
```

### getV2CustomersCustomerIdDomainsDomainActions

Calls `GET /v2/customers/{customerId}/domains/{domain}/actions`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsDomainActions("sample", "sample", "header-value");
```

```json
{}
```

### deleteV2CustomersCustomerIdDomainsDomainActionsType

Calls `DELETE /v2/customers/{customerId}/domains/{domain}/actions/{type}`.

```java
var response = client.domains().deleteV2CustomersCustomerIdDomainsDomainActionsType("sample", "sample", "sample", "header-value");
```

```json
{}
```

### getV2CustomersCustomerIdDomainsDomainActionsType

Calls `GET /v2/customers/{customerId}/domains/{domain}/actions/{type}`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsDomainActionsType("sample", "sample", "sample", "header-value");
```

```json
{}
```

### getV2CustomersCustomerIdDomainsNotifications

Calls `GET /v2/customers/{customerId}/domains/notifications`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsNotifications("sample", "header-value");
```

```json
{}
```

### getV2CustomersCustomerIdDomainsNotificationsOptIn

Calls `GET /v2/customers/{customerId}/domains/notifications/optIn`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsNotificationsOptIn("sample", "header-value");
```

```json
{}
```

### putV2CustomersCustomerIdDomainsNotificationsOptIn

Calls `PUT /v2/customers/{customerId}/domains/notifications/optIn`.

```java
var response = client.domains().putV2CustomersCustomerIdDomainsNotificationsOptIn("sample", List.of("sample"), "header-value");
```

```json
{}
```

### getV2CustomersCustomerIdDomainsNotificationsSchemasType

Calls `GET /v2/customers/{customerId}/domains/notifications/schemas/{type}`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsNotificationsSchemasType("sample", "sample", "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge

Calls `POST /v2/customers/{customerId}/domains/notifications/{notificationId}/acknowledge`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge("sample", "sample", "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsRegister

Calls `POST /v2/customers/{customerId}/domains/register`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsRegister("sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### getV2CustomersCustomerIdDomainsRegisterSchemaTld

Calls `GET /v2/customers/{customerId}/domains/register/schema/{tld}`.

```java
var response = client.domains().getV2CustomersCustomerIdDomainsRegisterSchemaTld("sample", "sample", "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsRegisterValidate

Calls `POST /v2/customers/{customerId}/domains/register/validate`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsRegisterValidate("sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### getV2DomainsMaintenances

Calls `GET /v2/domains/maintenances`.

```java
var response = client.domains().getV2DomainsMaintenances("header-value", List.of("sample"), "sample", "sample", 1L);
```

```json
{}
```

### getV2DomainsMaintenancesMaintenanceId

Calls `GET /v2/domains/maintenances/{maintenanceId}`.

```java
var response = client.domains().getV2DomainsMaintenancesMaintenanceId("sample", "header-value");
```

```json
{}
```

### getV2DomainsUsageYyyymm

Calls `GET /v2/domains/usage/{yyyymm}`.

```java
var response = client.domains().getV2DomainsUsageYyyymm("sample", "header-value", List.of("sample"));
```

```json
{}
```

### patchV2CustomersCustomerIdDomainsDomainContacts

Calls `PATCH /v2/customers/{customerId}/domains/{domain}/contacts`.

```java
var response = client.domains().patchV2CustomersCustomerIdDomainsDomainContacts("sample", "sample", Map.of("sample", true), "header-value");
```

```json
{}
```

### postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode

Calls `POST /v2/customers/{customerId}/domains/{domain}/regenerateAuthCode`.

```java
var response = client.domains().postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode("sample", "sample", "header-value");
```

```json
{}
```

