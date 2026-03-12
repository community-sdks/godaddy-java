package io.github.communitysdks.godaddy.dto.subscriptions.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class UpdateRequest {
    public final String xAppKey;
    public final String xShopperId;
    public final String subscriptionId;
    public final Map<String, Object> subscription;

    public UpdateRequest() {
        this.xAppKey = null;
        this.xShopperId = null;
        this.subscriptionId = null;
        this.subscription = null;
    }

    public UpdateRequest(String xAppKey, String xShopperId, String subscriptionId, Map<String, Object> subscription) {
        this.xAppKey = xAppKey;
        this.xShopperId = xShopperId;
        this.subscriptionId = subscriptionId;
        this.subscription = subscription;
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
        return subscription;
    }
}
