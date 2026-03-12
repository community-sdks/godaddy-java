package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificateAlternateEmailAddressRequest {
    public final String certificateId;
    public final String emailAddress;

    public CertificateAlternateEmailAddressRequest() {
        this.certificateId = null;
        this.emailAddress = null;
    }

    public CertificateAlternateEmailAddressRequest(String certificateId, String emailAddress) {
        this.certificateId = certificateId;
        this.emailAddress = emailAddress;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("certificateId", certificateId), new Param("emailAddress", emailAddress));
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
