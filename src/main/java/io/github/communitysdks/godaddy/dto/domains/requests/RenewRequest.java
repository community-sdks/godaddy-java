package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class RenewRequest {
    public final String xShopperId;
    public final String domain;
    public final Map<String, Object> body;

    public RenewRequest() {
        this.xShopperId = null;
        this.domain = null;
        this.body = null;
    }

    public RenewRequest(String xShopperId, String domain, Map<String, Object> body) {
        this.xShopperId = xShopperId;
        this.domain = domain;
        this.body = body;
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
        return body;
    }
}
