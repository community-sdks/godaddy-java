package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificateEmailHistoryRequest {
    public final String certificateId;

    public CertificateEmailHistoryRequest() {
        this.certificateId = null;
    }

    public CertificateEmailHistoryRequest(String certificateId) {
        this.certificateId = certificateId;
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
        return null;
    }
}
