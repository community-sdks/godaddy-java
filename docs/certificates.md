# CertificatesService

SSL certificate purchase, validation, lifecycle, and revocation endpoints.

## Accessor

```java
var service = client.certificates();
```

## Endpoints

### certificateCreate

Calls `POST /v1/certificates`.

```java
var response = client.certificates().certificateCreate(Map.of("sample", true), "header-value");
```

```json
{}
```

### certificateValidate

Calls `POST /v1/certificates/validate`.

```java
var response = client.certificates().certificateValidate(Map.of("sample", true), "header-value");
```

```json
{}
```

### certificateGet

Calls `GET /v1/certificates/{certificateId}`.

```java
var response = client.certificates().certificateGet("sample");
```

```json
{}
```

### certificateActionRetrieve

Calls `GET /v1/certificates/{certificateId}/actions`.

```java
var response = client.certificates().certificateActionRetrieve("sample");
```

```json
{}
```

### certificateResendEmail

Calls `POST /v1/certificates/{certificateId}/email/{emailId}/resend`.

```java
var response = client.certificates().certificateResendEmail("sample", "sample");
```

```json
{}
```

### certificateAlternateEmailAddress

Calls `POST /v1/certificates/{certificateId}/email/resend/{emailAddress}`.

```java
var response = client.certificates().certificateAlternateEmailAddress("sample", List.of("sample"));
```

```json
{}
```

### certificateResendEmailAddress

Calls `POST /v1/certificates/{certificateId}/email/{emailId}/resend/{emailAddress}`.

```java
var response = client.certificates().certificateResendEmailAddress("sample", "sample", List.of("sample"));
```

```json
{}
```

### certificateEmailHistory

Calls `GET /v1/certificates/{certificateId}/email/history`.

```java
var response = client.certificates().certificateEmailHistory("sample");
```

```json
{}
```

### certificateCallbackDelete

Calls `DELETE /v1/certificates/{certificateId}/callback`.

```java
var response = client.certificates().certificateCallbackDelete("sample");
```

```json
{}
```

### certificateCallbackGet

Calls `GET /v1/certificates/{certificateId}/callback`.

```java
var response = client.certificates().certificateCallbackGet("sample");
```

```json
{}
```

### certificateCallbackReplace

Calls `PUT /v1/certificates/{certificateId}/callback`.

```java
var response = client.certificates().certificateCallbackReplace("sample", "sample");
```

```json
{}
```

### certificateCancel

Calls `POST /v1/certificates/{certificateId}/cancel`.

```java
var response = client.certificates().certificateCancel("sample");
```

```json
{}
```

### certificateDownload

Calls `GET /v1/certificates/{certificateId}/download`.

```java
var response = client.certificates().certificateDownload("sample");
```

```json
{}
```

### certificateReissue

Calls `POST /v1/certificates/{certificateId}/reissue`.

```java
var response = client.certificates().certificateReissue("sample", Map.of("sample", true));
```

```json
{}
```

### certificateRenew

Calls `POST /v1/certificates/{certificateId}/renew`.

```java
var response = client.certificates().certificateRenew("sample", Map.of("sample", true));
```

```json
{}
```

### certificateRevoke

Calls `POST /v1/certificates/{certificateId}/revoke`.

```java
var response = client.certificates().certificateRevoke("sample", Map.of("sample", true));
```

```json
{}
```

### certificateSitesealGet

Calls `GET /v1/certificates/{certificateId}/siteSeal`.

```java
var response = client.certificates().certificateSitesealGet("sample", "sample", "sample");
```

```json
{}
```

### certificateVerifydomaincontrol

Calls `POST /v1/certificates/{certificateId}/verifyDomainControl`.

```java
var response = client.certificates().certificateVerifydomaincontrol("sample");
```

```json
{}
```

### certificateGetEntitlement

Calls `GET /v2/certificates`.

```java
var response = client.certificates().certificateGetEntitlement("sample", Boolean.TRUE);
```

```json
{}
```

### certificateCreateV2

Calls `POST /v2/certificates`.

```java
var response = client.certificates().certificateCreateV2(Map.of("sample", true), "header-value");
```

```json
{}
```

### certificateDownloadEntitlement

Calls `GET /v2/certificates/download`.

```java
var response = client.certificates().certificateDownloadEntitlement("sample");
```

```json
{}
```

### getCustomerCertificatesByCustomerId

Calls `GET /v2/customers/{customerId}/certificates`.

```java
var response = client.certificates().getCustomerCertificatesByCustomerId("sample", 1L, 1L);
```

```json
{}
```

### getCertificateDetailByCertIdentifier

Calls `GET /v2/customers/{customerId}/certificates/{certificateId}`.

```java
var response = client.certificates().getCertificateDetailByCertIdentifier("sample", "sample");
```

```json
{}
```

### getDomainInformationByCertificateId

Calls `GET /v2/customers/{customerId}/certificates/{certificateId}/domainVerifications`.

```java
var response = client.certificates().getDomainInformationByCertificateId("sample", "sample");
```

```json
{}
```

### getDomainDetailsByDomain

Calls `GET /v2/customers/{customerId}/certificates/{certificateId}/domainVerifications/{domain}`.

```java
var response = client.certificates().getDomainDetailsByDomain("sample", "sample", "sample");
```

```json
{}
```

### getAcmeExternalAccountBinding

Calls `GET /v2/customers/{customerId}/certificates/acme/externalAccountBinding`.

```java
var response = client.certificates().getAcmeExternalAccountBinding("sample");
```

```json
{}
```

### retrieveSslByDomainReseller

Calls `GET /v2/certificates/subscriptions/search`.

```java
var response = client.certificates().retrieveSslByDomainReseller(1L, 1L, "sample", List.of("sample"), "sample", "sample");
```

```json
{}
```

### retrieveSslByDomainSubscriptionReseller

Calls `GET /v2/certificates/subscription/{guid}`.

```java
var response = client.certificates().retrieveSslByDomainSubscriptionReseller("sample", 1L, 1L, "sample", List.of("sample"), "sample", "sample");
```

```json
{}
```

