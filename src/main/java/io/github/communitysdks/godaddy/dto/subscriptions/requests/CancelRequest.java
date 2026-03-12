package io.github.communitysdks.godaddy.dto.subscriptions.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CancelRequest {
    public final String xAppKey;
    public final String xShopperId;
    public final String subscriptionId;

    public CancelRequest() {
        this.xAppKey = null;
        this.xShopperId = null;
        this.subscriptionId = null;
    }

    public CancelRequest(String xAppKey, String xShopperId, String subscriptionId) {
        this.xAppKey = xAppKey;
        this.xShopperId = xShopperId;
        this.subscriptionId = subscriptionId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("subscriptionId", subscriptionId));
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
