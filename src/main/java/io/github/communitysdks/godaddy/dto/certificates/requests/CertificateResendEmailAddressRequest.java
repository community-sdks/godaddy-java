package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificateResendEmailAddressRequest {
    public final String certificateId;
    public final String emailId;
    public final String emailAddress;

    public CertificateResendEmailAddressRequest() {
        this.certificateId = null;
        this.emailId = null;
        this.emailAddress = null;
    }

    public CertificateResendEmailAddressRequest(String certificateId, String emailId, String emailAddress) {
        this.certificateId = certificateId;
        this.emailId = emailId;
        this.emailAddress = emailAddress;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("certificateId", certificateId), new Param("emailId", emailId), new Param("emailAddress", emailAddress));
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
