package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class CertificateRenewRequest {
    public final String certificateId;
    public final Map<String, Object> renewCreate;

    public CertificateRenewRequest() {
        this.certificateId = null;
        this.renewCreate = null;
    }

    public CertificateRenewRequest(String certificateId, Map<String, Object> renewCreate) {
        this.certificateId = certificateId;
        this.renewCreate = renewCreate;
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
        return renewCreate;
    }
}
