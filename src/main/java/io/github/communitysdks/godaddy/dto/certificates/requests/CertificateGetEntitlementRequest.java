package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificateGetEntitlementRequest {
    public final String entitlementId;
    public final Boolean latest;

    public CertificateGetEntitlementRequest() {
        this.entitlementId = null;
        this.latest = null;
    }

    public CertificateGetEntitlementRequest(String entitlementId, Boolean latest) {
        this.entitlementId = entitlementId;
        this.latest = latest;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("entitlementId", entitlementId), new Param("latest", latest));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
