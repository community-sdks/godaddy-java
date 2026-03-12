package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CertificateSitesealGetRequest {
    public final String certificateId;
    public final String theme;
    public final String locale;

    public CertificateSitesealGetRequest() {
        this.certificateId = null;
        this.theme = null;
        this.locale = null;
    }

    public CertificateSitesealGetRequest(String certificateId, String theme, String locale) {
        this.certificateId = certificateId;
        this.theme = theme;
        this.locale = locale;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("certificateId", certificateId));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("theme", theme), new Param("locale", locale));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
