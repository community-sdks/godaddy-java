package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class CertificateReissueRequest {
    public final String certificateId;
    public final Map<String, Object> reissueCreate;

    public CertificateReissueRequest() {
        this.certificateId = null;
        this.reissueCreate = null;
    }

    public CertificateReissueRequest(String certificateId, Map<String, Object> reissueCreate) {
        this.certificateId = certificateId;
        this.reissueCreate = reissueCreate;
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
        return reissueCreate;
    }
}
