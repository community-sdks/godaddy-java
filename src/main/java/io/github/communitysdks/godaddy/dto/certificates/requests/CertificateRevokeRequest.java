package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class CertificateRevokeRequest {
    public final String certificateId;
    public final Map<String, Object> certificateRevoke;

    public CertificateRevokeRequest() {
        this.certificateId = null;
        this.certificateRevoke = null;
    }

    public CertificateRevokeRequest(String certificateId, Map<String, Object> certificateRevoke) {
        this.certificateId = certificateId;
        this.certificateRevoke = certificateRevoke;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("certificateId", certificateId));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return certificateRevoke;
    }
}
