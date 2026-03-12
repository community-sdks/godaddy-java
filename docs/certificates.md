# CertificatesService

## Accessor

```java
var serviceAccessor = client.certificates();
```

## Method Index

- `certificateCreate`: `CertificateCreateResponse`
- `certificateValidate`: `CertificateValidateResponse`
- `certificateGet`: `CertificateGetResponse`
- `certificateActionRetrieve`: `CertificateActionRetrieveResponse`
- `certificateResendEmail`: `CertificateResendEmailResponse`
- `certificateAlternateEmailAddress`: `CertificateAlternateEmailAddressResponse`
- `certificateResendEmailAddress`: `CertificateResendEmailAddressResponse`
- `certificateEmailHistory`: `CertificateEmailHistoryResponse`
- `certificateCallbackGet`: `CertificateCallbackGetResponse`
- `certificateCallbackReplace`: `CertificateCallbackReplaceResponse`
- `certificateCallbackDelete`: `CertificateCallbackDeleteResponse`
- `certificateCancel`: `CertificateCancelResponse`
- `certificateDownload`: `CertificateDownloadResponse`
- `certificateReissue`: `CertificateReissueResponse`
- `certificateRenew`: `CertificateRenewResponse`
- `certificateRevoke`: `CertificateRevokeResponse`
- `certificateSitesealGet`: `CertificateSitesealGetResponse`
- `certificateVerifydomaincontrol`: `CertificateVerifydomaincontrolResponse`
- `certificateGetEntitlement`: `CertificateGetEntitlementResponse`
- `certificateCreateV2`: `CertificateCreateV2Response`
- `certificateDownloadEntitlement`: `CertificateDownloadEntitlementResponse`
- `getCustomerCertificatesByCustomerId`: `GetCustomerCertificatesByCustomerIdResponse`
- `getCertificateDetailByCertIdentifier`: `GetCertificateDetailByCertIdentifierResponse`
- `getDomainInformationByCertificateId`: `GetDomainInformationByCertificateIdResponse`
- `getDomainDetailsByDomain`: `GetDomainDetailsByDomainResponse`
- `getAcmeExternalAccountBinding`: `GetAcmeExternalAccountBindingResponse`
- `retrieveSslByDomainReseller`: `RetrieveSslByDomainResellerResponse`
- `retrieveSslByDomainSubscriptionReseller`: `RetrieveSslByDomainSubscriptionResellerResponse`

### certificateCreate

Returns: `CertificateCreateResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCreateRequest;
CertificateCreateRequest request = new CertificateCreateRequest(
    "value",
    "value",
);
var response = client.certificates().certificateCreate(request);
```

```json
{
  "certificateId": "abc123"
}
```

### certificateValidate

Returns: `CertificateValidateResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateValidateRequest;
CertificateValidateRequest request = new CertificateValidateRequest(
    "value",
    "value",
);
var response = client.certificates().certificateValidate(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateGet

Returns: `CertificateGetResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateGetRequest;
CertificateGetRequest request = new CertificateGetRequest(
    "value",
);
var response = client.certificates().certificateGet(request);
```

```json
{
  "certificateId": "abc123",
  "commonName": "value",
  "contact": {
    "email": "admin@example.com",
    "jobTitle": "value",
    "nameFirst": "value",
    "nameLast": "value",
    "nameMiddle": "abc123",
    "phone": "value",
    "suffix": "value"
  },
  "createdAt": "value",
  "deniedReason": "value",
  "organization": {
    "address": {
      "address1": "value",
      "address2": "value",
      "city": "value",
      "country": "AC",
      "postalCode": "value",
      "state": "value"
    },
    "assumedName": "value",
    "jurisdictionOfIncorporation": {
      "city": "value",
      "country": "US",
      "county": "value",
      "state": "value"
    },
    "name": "value",
    "phone": "value",
    "registrationAgent": "value",
    "registrationNumber": "value"
  },
  "period": 1,
  "productType": "DV_SSL",
  "progress": 1,
  "revokedAt": "value",
  "rootType": "GODADDY_SHA_1",
  "serialNumber": "value",
  "serialNumberHex": "value",
  "slotSize": "FIVE",
  "status": "PENDING_ISSUANCE",
  "subjectAlternativeNames": [
    {
      "status": "PENDING",
      "subjectAlternativeName": "value"
    }
  ],
  "validEnd": "abc123",
  "validStart": "abc123"
}
```

### certificateActionRetrieve

Returns: `CertificateActionRetrieveResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateActionRetrieveRequest;
CertificateActionRetrieveRequest request = new CertificateActionRetrieveRequest(
    "value",
);
var response = client.certificates().certificateActionRetrieve(request);
```

```json
[
  {
    "createdAt": "value",
    "type": "CERTIFICATE_ISSUED"
  }
]
```

### certificateResendEmail

Returns: `CertificateResendEmailResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateResendEmailRequest;
CertificateResendEmailRequest request = new CertificateResendEmailRequest(
    "value",
    "value",
);
var response = client.certificates().certificateResendEmail(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateAlternateEmailAddress

Returns: `CertificateAlternateEmailAddressResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateAlternateEmailAddressRequest;
CertificateAlternateEmailAddressRequest request = new CertificateAlternateEmailAddressRequest(
    "value",
    "value",
);
var response = client.certificates().certificateAlternateEmailAddress(request);
```

```json
{
  "id": 1,
  "accountId": 1,
  "templateType": "value",
  "fromType": "value",
  "recipients": "value",
  "body": "value",
  "dateEntered": "2024-01-01T00:00:00Z",
  "subject": "value"
}
```

### certificateResendEmailAddress

Returns: `CertificateResendEmailAddressResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateResendEmailAddressRequest;
CertificateResendEmailAddressRequest request = new CertificateResendEmailAddressRequest(
    "value",
    "value",
    "value",
);
var response = client.certificates().certificateResendEmailAddress(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateEmailHistory

Returns: `CertificateEmailHistoryResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateEmailHistoryRequest;
CertificateEmailHistoryRequest request = new CertificateEmailHistoryRequest(
    "value",
);
var response = client.certificates().certificateEmailHistory(request);
```

```json
{
  "id": 1,
  "accountId": 1,
  "templateType": "value",
  "fromType": "value",
  "recipients": "value",
  "body": "value",
  "dateEntered": "2024-01-01T00:00:00Z",
  "subject": "value"
}
```

### certificateCallbackGet

Returns: `CertificateCallbackGetResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCallbackGetRequest;
CertificateCallbackGetRequest request = new CertificateCallbackGetRequest(
    "value",
);
var response = client.certificates().certificateCallbackGet(request);
```

```json
{
  "callbackUrl": "value"
}
```

### certificateCallbackReplace

Returns: `CertificateCallbackReplaceResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCallbackReplaceRequest;
CertificateCallbackReplaceRequest request = new CertificateCallbackReplaceRequest(
    "value",
    "value",
);
var response = client.certificates().certificateCallbackReplace(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateCallbackDelete

Returns: `CertificateCallbackDeleteResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCallbackDeleteRequest;
CertificateCallbackDeleteRequest request = new CertificateCallbackDeleteRequest(
    "value",
);
var response = client.certificates().certificateCallbackDelete(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateCancel

Returns: `CertificateCancelResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCancelRequest;
CertificateCancelRequest request = new CertificateCancelRequest(
    "value",
);
var response = client.certificates().certificateCancel(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateDownload

Returns: `CertificateDownloadResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateDownloadRequest;
CertificateDownloadRequest request = new CertificateDownloadRequest(
    "value",
);
var response = client.certificates().certificateDownload(request);
```

```json
{
  "pems": {
    "certificate": "value",
    "cross": "value",
    "intermediate": "value",
    "root": "value"
  },
  "serialNumber": "value"
}
```

### certificateReissue

Returns: `CertificateReissueResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateReissueRequest;
CertificateReissueRequest request = new CertificateReissueRequest(
    "value",
    "value",
);
var response = client.certificates().certificateReissue(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateRenew

Returns: `CertificateRenewResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateRenewRequest;
CertificateRenewRequest request = new CertificateRenewRequest(
    "value",
    "value",
);
var response = client.certificates().certificateRenew(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateRevoke

Returns: `CertificateRevokeResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateRevokeRequest;
CertificateRevokeRequest request = new CertificateRevokeRequest(
    "value",
    "value",
);
var response = client.certificates().certificateRevoke(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateSitesealGet

Returns: `CertificateSitesealGetResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateSitesealGetRequest;
CertificateSitesealGetRequest request = new CertificateSitesealGetRequest(
    "value",
    "value",
    "value",
);
var response = client.certificates().certificateSitesealGet(request);
```

```json
{
  "html": "value"
}
```

### certificateVerifydomaincontrol

Returns: `CertificateVerifydomaincontrolResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateVerifydomaincontrolRequest;
CertificateVerifydomaincontrolRequest request = new CertificateVerifydomaincontrolRequest(
    "value",
);
var response = client.certificates().certificateVerifydomaincontrol(request);
```

```json
{
  "code": "SUCCESS",
  "message": "Request completed successfully"
}
```

### certificateGetEntitlement

Returns: `CertificateGetEntitlementResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateGetEntitlementRequest;
CertificateGetEntitlementRequest request = new CertificateGetEntitlementRequest(
    "value",
    Boolean.TRUE,
);
var response = client.certificates().certificateGetEntitlement(request);
```

```json
[
  {
    "certificateId": "abc123",
    "commonName": "value",
    "contact": {
      "email": "admin@example.com",
      "jobTitle": "value",
      "nameFirst": "value",
      "nameLast": "value",
      "nameMiddle": "abc123",
      "phone": "value",
      "suffix": "value"
    },
    "createdAt": "value",
    "deniedReason": "value",
    "organization": {
      "address": {
        "address1": "value",
        "address2": "value",
        "city": "value",
        "country": "AC",
        "postalCode": "value",
        "state": "value"
      },
      "assumedName": "value",
      "jurisdictionOfIncorporation": {
        "city": "value",
        "country": "US",
        "county": "value",
        "state": "value"
      },
      "name": "value",
      "phone": "value",
      "registrationAgent": "value",
      "registrationNumber": "value"
    },
    "period": 1,
    "productType": "DV_SSL",
    "progress": 1,
    "revokedAt": "value",
    "rootType": "GODADDY_SHA_1",
    "serialNumber": "value",
    "serialNumberHex": "value",
    "slotSize": "FIVE",
    "status": "PENDING_ISSUANCE",
    "subjectAlternativeNames": [
      {
        "status": "PENDING",
        "subjectAlternativeName": "value"
      }
    ],
    "validEnd": "abc123",
    "validStart": "abc123"
  }
]
```

### certificateCreateV2

Returns: `CertificateCreateV2Response`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCreateV2Request;
CertificateCreateV2Request request = new CertificateCreateV2Request(
    "value",
    "value",
);
var response = client.certificates().certificateCreateV2(request);
```

```json
{
  "certificateId": "abc123",
  "subscriptionId": "abc123",
  "subscriptionCreatedForOrder": true
}
```

### certificateDownloadEntitlement

Returns: `CertificateDownloadEntitlementResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateDownloadEntitlementRequest;
CertificateDownloadEntitlementRequest request = new CertificateDownloadEntitlementRequest(
    "value",
);
var response = client.certificates().certificateDownloadEntitlement(request);
```

```json
{
  "pems": {
    "certificate": "value",
    "cross": "value",
    "intermediate": "value",
    "root": "value"
  },
  "serialNumber": "value"
}
```

### getCustomerCertificatesByCustomerId

Returns: `GetCustomerCertificatesByCustomerIdResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.GetCustomerCertificatesByCustomerIdRequest;
GetCustomerCertificatesByCustomerIdRequest request = new GetCustomerCertificatesByCustomerIdRequest(
    "value",
    1L,
    1L,
);
var response = client.certificates().getCustomerCertificatesByCustomerId(request);
```

```json
{
  "certificates": [
    {
      "certificateId": "abc123",
      "commonName": "value",
      "period": 1,
      "type": "DV_SSL",
      "status": "ISSUED",
      "createdAt": "value",
      "completedAt": "value",
      "validEndAt": "abc123",
      "validStartAt": "abc123",
      "revokedAt": "value",
      "renewalAvailable": true,
      "serialNumber": "value",
      "slotSize": "FIVE",
      "subjectAlternativeNames": [
        "value"
      ]
    }
  ],
  "pagination": {
    "first": "value",
    "previous": "value",
    "next": "value",
    "last": "value",
    "total": 1
  }
}
```

### getCertificateDetailByCertIdentifier

Returns: `GetCertificateDetailByCertIdentifierResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.GetCertificateDetailByCertIdentifierRequest;
GetCertificateDetailByCertIdentifierRequest request = new GetCertificateDetailByCertIdentifierRequest(
    "value",
    "value",
);
var response = client.certificates().getCertificateDetailByCertIdentifier(request);
```

```json
{
  "certificateId": "abc123",
  "commonName": "value",
  "period": 1,
  "type": "DV_SSL",
  "status": "PENDING_ISSUANCE",
  "createdAt": "value",
  "completedAt": "value",
  "validEndAt": "abc123",
  "validStartAt": "abc123",
  "revokedAt": "value",
  "renewalAvailable": true,
  "serialNumber": "value",
  "serialNumberHex": "value",
  "slotSize": "FIVE",
  "subjectAlternativeNames": [
    "value"
  ],
  "contact": {
    "email": "admin@example.com",
    "jobTitle": "value",
    "nameFirst": "value",
    "nameLast": "value",
    "nameMiddle": "abc123",
    "phone": "value",
    "suffix": "value"
  },
  "organization": {
    "address": {
      "address1": "value",
      "address2": "value",
      "city": "value",
      "country": "AC",
      "postalCode": "value",
      "state": "value"
    },
    "assumedName": "value",
    "jurisdictionOfIncorporation": {
      "city": "value",
      "country": "US",
      "county": "value",
      "state": "value"
    },
    "name": "value",
    "phone": "value",
    "registrationAgent": "value",
    "registrationNumber": "value"
  },
  "csr": "value",
  "rootType": "GODADDY_SHA_1",
  "deniedReason": "value",
  "progress": 1
}
```

### getDomainInformationByCertificateId

Returns: `GetDomainInformationByCertificateIdResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.GetDomainInformationByCertificateIdRequest;
GetDomainInformationByCertificateIdRequest request = new GetDomainInformationByCertificateIdRequest(
    "value",
    "value",
);
var response = client.certificates().getDomainInformationByCertificateId(request);
```

```json
[
  {
    "domain": "example.com",
    "domainEntityId": 1,
    "dceToken": "value",
    "status": "COMPLETED",
    "createdAt": "value",
    "modifiedAt": "value",
    "type": "DOMAIN_CONTROL_EMAIL",
    "usage": "COMMON_NAME"
  }
]
```

### getDomainDetailsByDomain

Returns: `GetDomainDetailsByDomainResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.GetDomainDetailsByDomainRequest;
GetDomainDetailsByDomainRequest request = new GetDomainDetailsByDomainRequest(
    "value",
    "value",
    "value",
);
var response = client.certificates().getDomainDetailsByDomain(request);
```

```json
{
  "domain": "example.com",
  "domainEntityId": 1,
  "dceToken": "value",
  "status": "COMPLETED",
  "createdAt": "value",
  "modifiedAt": "value",
  "type": "DOMAIN_CONTROL_EMAIL",
  "usage": "COMMON_NAME",
  "certificateAuthorityAuthorization": {
    "status": "PENDING",
    "queryPaths": [
      "value"
    ],
    "recommendations": [
      "ADD_CA_TO_CAA"
    ],
    "completedAt": "value"
  }
}
```

### getAcmeExternalAccountBinding

Returns: `GetAcmeExternalAccountBindingResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.GetAcmeExternalAccountBindingRequest;
GetAcmeExternalAccountBindingRequest request = new GetAcmeExternalAccountBindingRequest(
    "value",
);
var response = client.certificates().getAcmeExternalAccountBinding(request);
```

```json
{
  "directoryUrl": "value",
  "keyId": "abc123",
  "hmacKey": "value"
}
```

### retrieveSslByDomainReseller

Returns: `RetrieveSslByDomainResellerResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.RetrieveSslByDomainResellerRequest;
RetrieveSslByDomainResellerRequest request = new RetrieveSslByDomainResellerRequest(
    1L,
    1L,
    "value",
    "value",
);
var response = client.certificates().retrieveSslByDomainReseller(request);
```

```json
{
  "currentPage": 1,
  "data": [
    {
      "allowedDomains": [
        "example.com"
      ],
      "domain": "example.com",
      "guid": "217c6432-b892-4d74-a75e-0e37b5dc30a0",
      "maxDomains": 1,
      "subscriptionEndDate": "2024-01-01T00:00:00Z",
      "subscriptionStartDate": "2024-01-01T00:00:00Z",
      "subscriptionStatus": "ACTIVE",
      "currentPage": 1,
      "data": [
        {
          "certificateId": "abc123",
          "completionDate": "2024-01-01T00:00:00Z",
          "domain": "example.com",
          "period": 1,
          "requestDate": "2024-01-01T00:00:00Z",
          "revocationDate": "2024-01-01T00:00:00Z",
          "sans": [],
          "serialNumber": "value",
          "slotSize": 1,
          "status": "ACTIVE",
          "type": "SINGLE",
          "validEndDate": "abc123",
          "validStartDate": "abc123",
          "validationType": "DV"
        }
      ],
      "pageSize": 1,
      "total": 1
    }
  ],
  "pageSize": 1,
  "total": 1
}
```

### retrieveSslByDomainSubscriptionReseller

Returns: `RetrieveSslByDomainSubscriptionResellerResponse`

```java
import io.github.communitysdks.godaddy.dto.certificates.requests.RetrieveSslByDomainSubscriptionResellerRequest;
RetrieveSslByDomainSubscriptionResellerRequest request = new RetrieveSslByDomainSubscriptionResellerRequest(
    "value",
    1L,
    1L,
    "value",
);
var response = client.certificates().retrieveSslByDomainSubscriptionReseller(request);
```

```json
{
  "allowedDomains": [
    "example.com"
  ],
  "domain": "example.com",
  "guid": "217c6432-b892-4d74-a75e-0e37b5dc30a0",
  "maxDomains": 1,
  "subscriptionEndDate": "2024-01-01T00:00:00Z",
  "subscriptionStartDate": "2024-01-01T00:00:00Z",
  "subscriptionStatus": "ACTIVE",
  "currentPage": 1,
  "data": [
    {
      "certificateId": "abc123",
      "completionDate": "2024-01-01T00:00:00Z",
      "domain": "example.com",
      "period": 1,
      "requestDate": "2024-01-01T00:00:00Z",
      "revocationDate": "2024-01-01T00:00:00Z",
      "sans": [
        "example.com"
      ],
      "serialNumber": "value",
      "slotSize": 1,
      "status": "ACTIVE",
      "type": "SINGLE",
      "validEndDate": "abc123",
      "validStartDate": "abc123",
      "validationType": "DV"
    }
  ],
  "pageSize": 1,
  "total": 1
}
```