package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetCertificateDetailByCertIdentifierRequest {
    public final String customerId;
    public final String certificateId;

    public GetCertificateDetailByCertIdentifierRequest() {
        this.customerId = null;
        this.certificateId = null;
    }

    public GetCertificateDetailByCertIdentifierRequest(String customerId, String certificateId) {
        this.customerId = customerId;
        this.certificateId = certificateId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("certificateId", certificateId));
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
