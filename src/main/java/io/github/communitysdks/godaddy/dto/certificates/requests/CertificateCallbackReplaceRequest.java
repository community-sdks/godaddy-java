package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificateCallbackReplaceRequest {
    public final String certificateId;
    public final String callbackUrl;

    public CertificateCallbackReplaceRequest() {
        this.certificateId = null;
        this.callbackUrl = null;
    }

    public CertificateCallbackReplaceRequest(String certificateId, String callbackUrl) {
        this.certificateId = certificateId;
        this.callbackUrl = callbackUrl;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("certificateId", certificateId));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("callbackUrl", callbackUrl));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
