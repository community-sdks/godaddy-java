package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCreateRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateValidateRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateGetRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateActionRetrieveRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateResendEmailRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateAlternateEmailAddressRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateResendEmailAddressRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateEmailHistoryRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCallbackGetRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCallbackReplaceRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCallbackDeleteRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCancelRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateDownloadRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateReissueRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateRenewRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateRevokeRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateSitesealGetRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateVerifydomaincontrolRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateGetEntitlementRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateCreateV2Request;
import io.github.communitysdks.godaddy.dto.certificates.requests.CertificateDownloadEntitlementRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.GetCustomerCertificatesByCustomerIdRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.GetCertificateDetailByCertIdentifierRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.GetDomainInformationByCertificateIdRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.GetDomainDetailsByDomainRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.GetAcmeExternalAccountBindingRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.RetrieveSslByDomainResellerRequest;
import io.github.communitysdks.godaddy.dto.certificates.requests.RetrieveSslByDomainSubscriptionResellerRequest;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateCreateResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateValidateResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateGetResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateActionRetrieveResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateResendEmailResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateAlternateEmailAddressResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateResendEmailAddressResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateEmailHistoryResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateCallbackGetResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateCallbackReplaceResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateCallbackDeleteResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateCancelResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateDownloadResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateReissueResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateRenewResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateRevokeResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateSitesealGetResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateVerifydomaincontrolResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateGetEntitlementResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateCreateV2Response;
import io.github.communitysdks.godaddy.dto.certificates.responses.CertificateDownloadEntitlementResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.GetCustomerCertificatesByCustomerIdResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.GetCertificateDetailByCertIdentifierResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.GetDomainInformationByCertificateIdResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.GetDomainDetailsByDomainResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.GetAcmeExternalAccountBindingResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.RetrieveSslByDomainResellerResponse;
import io.github.communitysdks.godaddy.dto.certificates.responses.RetrieveSslByDomainSubscriptionResellerResponse;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesApiException;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesBadRequestException;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesConflictException;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesForbiddenException;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesNotFoundException;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesRateLimitException;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesServerException;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesUnauthorizedException;
import io.github.communitysdks.godaddy.errors.certificates.CertificatesUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class CertificatesService extends AbstractService {
    public CertificatesService(ApiClient client) {
        super(client, "certificates");
    }

    public CertificateCreateResponse certificateCreate(CertificateCreateRequest request) {
        CertificateCreateRequest safe = request == null ? new CertificateCreateRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateCreateResponse.fromMixed(response);
    }

    public CertificateValidateResponse certificateValidate(CertificateValidateRequest request) {
        CertificateValidateRequest safe = request == null ? new CertificateValidateRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates/validate",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateValidateResponse.fromMixed(response);
    }

    public CertificateGetResponse certificateGet(CertificateGetRequest request) {
        CertificateGetRequest safe = request == null ? new CertificateGetRequest() : request;
        Object response = execute(
            "GET",
            "/v1/certificates/{certificateId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateGetResponse.fromMixed(response);
    }

    public CertificateActionRetrieveResponse certificateActionRetrieve(CertificateActionRetrieveRequest request) {
        CertificateActionRetrieveRequest safe = request == null ? new CertificateActionRetrieveRequest() : request;
        Object response = execute(
            "GET",
            "/v1/certificates/{certificateId}/actions",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateActionRetrieveResponse.fromMixed(response);
    }

    public CertificateResendEmailResponse certificateResendEmail(CertificateResendEmailRequest request) {
        CertificateResendEmailRequest safe = request == null ? new CertificateResendEmailRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates/{certificateId}/email/{emailId}/resend",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateResendEmailResponse.fromMixed(response);
    }

    public CertificateAlternateEmailAddressResponse certificateAlternateEmailAddress(CertificateAlternateEmailAddressRequest request) {
        CertificateAlternateEmailAddressRequest safe = request == null ? new CertificateAlternateEmailAddressRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates/{certificateId}/email/resend/{emailAddress}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateAlternateEmailAddressResponse.fromMixed(response);
    }

    public CertificateResendEmailAddressResponse certificateResendEmailAddress(CertificateResendEmailAddressRequest request) {
        CertificateResendEmailAddressRequest safe = request == null ? new CertificateResendEmailAddressRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates/{certificateId}/email/{emailId}/resend/{emailAddress}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateResendEmailAddressResponse.fromMixed(response);
    }

    public CertificateEmailHistoryResponse certificateEmailHistory(CertificateEmailHistoryRequest request) {
        CertificateEmailHistoryRequest safe = request == null ? new CertificateEmailHistoryRequest() : request;
        Object response = execute(
            "GET",
            "/v1/certificates/{certificateId}/email/history",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateEmailHistoryResponse.fromMixed(response);
    }

    public CertificateCallbackGetResponse certificateCallbackGet(CertificateCallbackGetRequest request) {
        CertificateCallbackGetRequest safe = request == null ? new CertificateCallbackGetRequest() : request;
        Object response = execute(
            "GET",
            "/v1/certificates/{certificateId}/callback",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateCallbackGetResponse.fromMixed(response);
    }

    public CertificateCallbackReplaceResponse certificateCallbackReplace(CertificateCallbackReplaceRequest request) {
        CertificateCallbackReplaceRequest safe = request == null ? new CertificateCallbackReplaceRequest() : request;
        Object response = execute(
            "PUT",
            "/v1/certificates/{certificateId}/callback",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateCallbackReplaceResponse.fromMixed(response);
    }

    public CertificateCallbackDeleteResponse certificateCallbackDelete(CertificateCallbackDeleteRequest request) {
        CertificateCallbackDeleteRequest safe = request == null ? new CertificateCallbackDeleteRequest() : request;
        Object response = execute(
            "DELETE",
            "/v1/certificates/{certificateId}/callback",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateCallbackDeleteResponse.fromMixed(response);
    }

    public CertificateCancelResponse certificateCancel(CertificateCancelRequest request) {
        CertificateCancelRequest safe = request == null ? new CertificateCancelRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates/{certificateId}/cancel",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateCancelResponse.fromMixed(response);
    }

    public CertificateDownloadResponse certificateDownload(CertificateDownloadRequest request) {
        CertificateDownloadRequest safe = request == null ? new CertificateDownloadRequest() : request;
        Object response = execute(
            "GET",
            "/v1/certificates/{certificateId}/download",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateDownloadResponse.fromMixed(response);
    }

    public CertificateReissueResponse certificateReissue(CertificateReissueRequest request) {
        CertificateReissueRequest safe = request == null ? new CertificateReissueRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates/{certificateId}/reissue",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateReissueResponse.fromMixed(response);
    }

    public CertificateRenewResponse certificateRenew(CertificateRenewRequest request) {
        CertificateRenewRequest safe = request == null ? new CertificateRenewRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates/{certificateId}/renew",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateRenewResponse.fromMixed(response);
    }

    public CertificateRevokeResponse certificateRevoke(CertificateRevokeRequest request) {
        CertificateRevokeRequest safe = request == null ? new CertificateRevokeRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates/{certificateId}/revoke",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateRevokeResponse.fromMixed(response);
    }

    public CertificateSitesealGetResponse certificateSitesealGet(CertificateSitesealGetRequest request) {
        CertificateSitesealGetRequest safe = request == null ? new CertificateSitesealGetRequest() : request;
        Object response = execute(
            "GET",
            "/v1/certificates/{certificateId}/siteSeal",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateSitesealGetResponse.fromMixed(response);
    }

    public CertificateVerifydomaincontrolResponse certificateVerifydomaincontrol(CertificateVerifydomaincontrolRequest request) {
        CertificateVerifydomaincontrolRequest safe = request == null ? new CertificateVerifydomaincontrolRequest() : request;
        Object response = execute(
            "POST",
            "/v1/certificates/{certificateId}/verifyDomainControl",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateVerifydomaincontrolResponse.fromMixed(response);
    }

    public CertificateGetEntitlementResponse certificateGetEntitlement(CertificateGetEntitlementRequest request) {
        CertificateGetEntitlementRequest safe = request == null ? new CertificateGetEntitlementRequest() : request;
        Object response = execute(
            "GET",
            "/v2/certificates",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateGetEntitlementResponse.fromMixed(response);
    }

    public CertificateCreateV2Response certificateCreateV2(CertificateCreateV2Request request) {
        CertificateCreateV2Request safe = request == null ? new CertificateCreateV2Request() : request;
        Object response = execute(
            "POST",
            "/v2/certificates",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateCreateV2Response.fromMixed(response);
    }

    public CertificateDownloadEntitlementResponse certificateDownloadEntitlement(CertificateDownloadEntitlementRequest request) {
        CertificateDownloadEntitlementRequest safe = request == null ? new CertificateDownloadEntitlementRequest() : request;
        Object response = execute(
            "GET",
            "/v2/certificates/download",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CertificateDownloadEntitlementResponse.fromMixed(response);
    }

    public GetCustomerCertificatesByCustomerIdResponse getCustomerCertificatesByCustomerId(GetCustomerCertificatesByCustomerIdRequest request) {
        GetCustomerCertificatesByCustomerIdRequest safe = request == null ? new GetCustomerCertificatesByCustomerIdRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/certificates",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetCustomerCertificatesByCustomerIdResponse.fromMixed(response);
    }

    public GetCertificateDetailByCertIdentifierResponse getCertificateDetailByCertIdentifier(GetCertificateDetailByCertIdentifierRequest request) {
        GetCertificateDetailByCertIdentifierRequest safe = request == null ? new GetCertificateDetailByCertIdentifierRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/certificates/{certificateId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetCertificateDetailByCertIdentifierResponse.fromMixed(response);
    }

    public GetDomainInformationByCertificateIdResponse getDomainInformationByCertificateId(GetDomainInformationByCertificateIdRequest request) {
        GetDomainInformationByCertificateIdRequest safe = request == null ? new GetDomainInformationByCertificateIdRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/certificates/{certificateId}/domainVerifications",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetDomainInformationByCertificateIdResponse.fromMixed(response);
    }

    public GetDomainDetailsByDomainResponse getDomainDetailsByDomain(GetDomainDetailsByDomainRequest request) {
        GetDomainDetailsByDomainRequest safe = request == null ? new GetDomainDetailsByDomainRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/certificates/{certificateId}/domainVerifications/{domain}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetDomainDetailsByDomainResponse.fromMixed(response);
    }

    public GetAcmeExternalAccountBindingResponse getAcmeExternalAccountBinding(GetAcmeExternalAccountBindingRequest request) {
        GetAcmeExternalAccountBindingRequest safe = request == null ? new GetAcmeExternalAccountBindingRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/certificates/acme/externalAccountBinding",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetAcmeExternalAccountBindingResponse.fromMixed(response);
    }

    public RetrieveSslByDomainResellerResponse retrieveSslByDomainReseller(RetrieveSslByDomainResellerRequest request) {
        RetrieveSslByDomainResellerRequest safe = request == null ? new RetrieveSslByDomainResellerRequest() : request;
        Object response = execute(
            "GET",
            "/v2/certificates/subscriptions/search",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RetrieveSslByDomainResellerResponse.fromMixed(response);
    }

    public RetrieveSslByDomainSubscriptionResellerResponse retrieveSslByDomainSubscriptionReseller(RetrieveSslByDomainSubscriptionResellerRequest request) {
        RetrieveSslByDomainSubscriptionResellerRequest safe = request == null ? new RetrieveSslByDomainSubscriptionResellerRequest() : request;
        Object response = execute(
            "GET",
            "/v2/certificates/subscription/{guid}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RetrieveSslByDomainSubscriptionResellerResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new CertificatesBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new CertificatesUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new CertificatesForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new CertificatesNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new CertificatesConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new CertificatesUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new CertificatesRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new CertificatesGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new CertificatesServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new CertificatesApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
