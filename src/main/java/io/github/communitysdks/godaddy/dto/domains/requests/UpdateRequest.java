package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class UpdateRequest {
    public final String domain;
    public final String xShopperId;
    public final Map<String, Object> body;

    public UpdateRequest() {
        this.domain = null;
        this.xShopperId = null;
        this.body = null;
    }

    public UpdateRequest(String domain, String xShopperId, Map<String, Object> body) {
        this.domain = domain;
        this.xShopperId = xShopperId;
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
