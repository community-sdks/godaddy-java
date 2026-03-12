package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class VerifyEmailRequest {
    public final String xShopperId;
    public final String domain;

    public VerifyEmailRequest() {
        this.xShopperId = null;
        this.domain = null;
    }

    public VerifyEmailRequest(String xShopperId, String domain) {
        this.xShopperId = xShopperId;
        this.domain = domain;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("domain", domain));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Shopper-Id", xShopperId));
    }

    public Object body() {
        return null;
    }
}
