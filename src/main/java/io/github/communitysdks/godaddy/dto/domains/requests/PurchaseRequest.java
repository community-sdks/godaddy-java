package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class PurchaseRequest {
    public final String xShopperId;
    public final Map<String, Object> body;

    public PurchaseRequest() {
        this.xShopperId = null;
        this.body = null;
    }

    public PurchaseRequest(String xShopperId, Map<String, Object> body) {
        this.xShopperId = xShopperId;
        this.body = body;
    }

    public List<Param> toPathParams() {
        return List.of();
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
