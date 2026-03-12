package io.github.communitysdks.godaddy.dto.orders.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetRequest {
    public final String orderId;
    public final String xShopperId;
    public final String xMarketId;
    public final String xAppKey;

    public GetRequest() {
        this.orderId = null;
        this.xShopperId = null;
        this.xMarketId = null;
        this.xAppKey = null;
    }

    public GetRequest(String orderId, String xShopperId, String xMarketId, String xAppKey) {
        this.orderId = orderId;
        this.xShopperId = xShopperId;
        this.xMarketId = xMarketId;
        this.xAppKey = xAppKey;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("orderId", orderId));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Shopper-Id", xShopperId), new Param("X-Market-Id", xMarketId), new Param("X-App-Key", xAppKey));
    }

    public Object body() {
        return null;
    }
}
