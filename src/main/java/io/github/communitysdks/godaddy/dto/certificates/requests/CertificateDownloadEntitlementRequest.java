package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificateDownloadEntitlementRequest {
    public final String entitlementId;

    public CertificateDownloadEntitlementRequest() {
        this.entitlementId = null;
    }

    public CertificateDownloadEntitlementRequest(String entitlementId) {
        this.entitlementId = entitlementId;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("entitlementId", entitlementId));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
