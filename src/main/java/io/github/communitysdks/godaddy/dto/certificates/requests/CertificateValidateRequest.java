package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class CertificateValidateRequest {
    public final String xMarketId;
    public final Map<String, Object> certificateCreate;

    public CertificateValidateRequest() {
        this.xMarketId = null;
        this.certificateCreate = null;
    }

    public CertificateValidateRequest(String xMarketId, Map<String, Object> certificateCreate) {
        this.xMarketId = xMarketId;
        this.certificateCreate = certificateCreate;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Market-Id", xMarketId));
    }

    public Object body() {
        return certificateCreate;
    }
}
