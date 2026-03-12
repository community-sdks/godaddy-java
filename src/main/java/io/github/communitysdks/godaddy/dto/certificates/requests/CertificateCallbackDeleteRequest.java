package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificateCallbackDeleteRequest {
    public final String certificateId;

    public CertificateCallbackDeleteRequest() {
        this.certificateId = null;
    }

    public CertificateCallbackDeleteRequest(String certificateId) {
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
