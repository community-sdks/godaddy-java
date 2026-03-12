package io.github.communitysdks.godaddy.dto.subscriptions.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class ProductGroupsRequest {
    public final String xAppKey;
    public final String xShopperId;

    public ProductGroupsRequest() {
        this.xAppKey = null;
        this.xShopperId = null;
    }

    public ProductGroupsRequest(String xAppKey, String xShopperId) {
        this.xAppKey = xAppKey;
        this.xShopperId = xShopperId;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-App-Key", xAppKey), new Param("X-Shopper-Id", xShopperId));
    }

    public Object body() {
        return null;
    }
}
