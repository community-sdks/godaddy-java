package io.github.communitysdks.godaddy.dto.agreements.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetRequest {
    public final Long xPrivateLabelId;
    public final String xMarketId;
    public final List<String> keys;

    public GetRequest() {
        this.xPrivateLabelId = null;
        this.xMarketId = null;
        this.keys = null;
    }

    public GetRequest(Long xPrivateLabelId, String xMarketId, List<String> keys) {
        this.xPrivateLabelId = xPrivateLabelId;
        this.xMarketId = xMarketId;
        this.keys = keys;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("keys", keys));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Private-Label-Id", xPrivateLabelId), new Param("X-Market-Id", xMarketId));
    }

    public Object body() {
        return null;
    }
}
