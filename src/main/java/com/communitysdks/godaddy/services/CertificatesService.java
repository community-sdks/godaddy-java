package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificatesService extends AbstractService {
    public CertificatesService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result certificateCreate(Object certificateCreate, Object xMarketId) {
        return call(
            "POST",
            "/v1/certificates",
            List.of(),
            List.of(),
            List.of(new Param("X-Market-Id", xMarketId)),
            certificateCreate
        );
    }

    public Result certificateValidate(Object certificateCreate, Object xMarketId) {
        return call(
            "POST",
            "/v1/certificates/validate",
            List.of(),
            List.of(),
            List.of(new Param("X-Market-Id", xMarketId)),
            certificateCreate
        );
    }

    public Result certificateGet(Object certificateId) {
        return call(
            "GET",
            "/v1/certificates/{certificateId}",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateActionRetrieve(Object certificateId) {
        return call(
            "GET",
            "/v1/certificates/{certificateId}/actions",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateResendEmail(Object certificateId, Object emailId) {
        return call(
            "POST",
            "/v1/certificates/{certificateId}/email/{emailId}/resend",
            List.of(new Param("certificateId", certificateId), new Param("emailId", emailId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateAlternateEmailAddress(Object certificateId, Object emailAddress) {
        return call(
            "POST",
            "/v1/certificates/{certificateId}/email/resend/{emailAddress}",
            List.of(new Param("certificateId", certificateId), new Param("emailAddress", emailAddress)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateResendEmailAddress(Object certificateId, Object emailId, Object emailAddress) {
        return call(
            "POST",
            "/v1/certificates/{certificateId}/email/{emailId}/resend/{emailAddress}",
            List.of(new Param("certificateId", certificateId), new Param("emailId", emailId), new Param("emailAddress", emailAddress)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateEmailHistory(Object certificateId) {
        return call(
            "GET",
            "/v1/certificates/{certificateId}/email/history",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateCallbackDelete(Object certificateId) {
        return call(
            "DELETE",
            "/v1/certificates/{certificateId}/callback",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateCallbackGet(Object certificateId) {
        return call(
            "GET",
            "/v1/certificates/{certificateId}/callback",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateCallbackReplace(Object certificateId, Object callbackUrl) {
        return call(
            "PUT",
            "/v1/certificates/{certificateId}/callback",
            List.of(new Param("certificateId", certificateId)),
            List.of(new Param("callbackUrl", callbackUrl)),
            List.of(),
            null
        );
    }

    public Result certificateCancel(Object certificateId) {
        return call(
            "POST",
            "/v1/certificates/{certificateId}/cancel",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateDownload(Object certificateId) {
        return call(
            "GET",
            "/v1/certificates/{certificateId}/download",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateReissue(Object certificateId, Object reissueCreate) {
        return call(
            "POST",
            "/v1/certificates/{certificateId}/reissue",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            reissueCreate
        );
    }

    public Result certificateRenew(Object certificateId, Object renewCreate) {
        return call(
            "POST",
            "/v1/certificates/{certificateId}/renew",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            renewCreate
        );
    }

    public Result certificateRevoke(Object certificateId, Object certificateRevoke) {
        return call(
            "POST",
            "/v1/certificates/{certificateId}/revoke",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            certificateRevoke
        );
    }

    public Result certificateSitesealGet(Object certificateId, Object theme, Object locale) {
        return call(
            "GET",
            "/v1/certificates/{certificateId}/siteSeal",
            List.of(new Param("certificateId", certificateId)),
            List.of(new Param("theme", theme), new Param("locale", locale)),
            List.of(),
            null
        );
    }

    public Result certificateVerifydomaincontrol(Object certificateId) {
        return call(
            "POST",
            "/v1/certificates/{certificateId}/verifyDomainControl",
            List.of(new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result certificateGetEntitlement(Object entitlementId, Object latest) {
        return call(
            "GET",
            "/v2/certificates",
            List.of(),
            List.of(new Param("entitlementId", entitlementId), new Param("latest", latest)),
            List.of(),
            null
        );
    }

    public Result certificateCreateV2(Object subscriptionCertificateCreate, Object xMarketId) {
        return call(
            "POST",
            "/v2/certificates",
            List.of(),
            List.of(),
            List.of(new Param("X-Market-Id", xMarketId)),
            subscriptionCertificateCreate
        );
    }

    public Result certificateDownloadEntitlement(Object entitlementId) {
        return call(
            "GET",
            "/v2/certificates/download",
            List.of(),
            List.of(new Param("entitlementId", entitlementId)),
            List.of(),
            null
        );
    }

    public Result getCustomerCertificatesByCustomerId(Object customerId, Object offset, Object limit) {
        return call(
            "GET",
            "/v2/customers/{customerId}/certificates",
            List.of(new Param("customerId", customerId)),
            List.of(new Param("offset", offset), new Param("limit", limit)),
            List.of(),
            null
        );
    }

    public Result getCertificateDetailByCertIdentifier(Object customerId, Object certificateId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/certificates/{certificateId}",
            List.of(new Param("customerId", customerId), new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result getDomainInformationByCertificateId(Object customerId, Object certificateId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/certificates/{certificateId}/domainVerifications",
            List.of(new Param("customerId", customerId), new Param("certificateId", certificateId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result getDomainDetailsByDomain(Object customerId, Object certificateId, Object domain) {
        return call(
            "GET",
            "/v2/customers/{customerId}/certificates/{certificateId}/domainVerifications/{domain}",
            List.of(new Param("customerId", customerId), new Param("certificateId", certificateId), new Param("domain", domain)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result getAcmeExternalAccountBinding(Object customerId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/certificates/acme/externalAccountBinding",
            List.of(new Param("customerId", customerId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result retrieveSslByDomainReseller(Object pageSize, Object page, Object domain, Object status, Object type, Object validation) {
        return call(
            "GET",
            "/v2/certificates/subscriptions/search",
            List.of(),
            List.of(new Param("pageSize", pageSize), new Param("page", page), new Param("domain", domain), new Param("status", status), new Param("type", type), new Param("validation", validation)),
            List.of(),
            null
        );
    }

    public Result retrieveSslByDomainSubscriptionReseller(Object guid, Object pageSize, Object page, Object domain, Object status, Object type, Object validation) {
        return call(
            "GET",
            "/v2/certificates/subscription/{guid}",
            List.of(new Param("guid", guid)),
            List.of(new Param("pageSize", pageSize), new Param("page", page), new Param("domain", domain), new Param("status", status), new Param("type", type), new Param("validation", validation)),
            List.of(),
            null
        );
    }
}
