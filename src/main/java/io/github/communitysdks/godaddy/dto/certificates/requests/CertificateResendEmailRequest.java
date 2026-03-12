package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificateResendEmailRequest {
    public final String certificateId;
    public final String emailId;

    public CertificateResendEmailRequest() {
        this.certificateId = null;
        this.emailId = null;
    }

    public CertificateResendEmailRequest(String certificateId, String emailId) {
        this.certificateId = certificateId;
        this.emailId = emailId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("certificateId", certificateId), new Param("emailId", emailId));
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
