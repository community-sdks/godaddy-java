package io.github.communitysdks.godaddy.dto.subscriptions.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class ListRequest {
    public final String xAppKey;
    public final String xShopperId;
    public final String xMarketId;
    public final List<String> productGroupKeys;
    public final List<String> includes;
    public final Long offset;
    public final Long limit;
    public final String sort;

    public ListRequest() {
        this.xAppKey = null;
        this.xShopperId = null;
        this.xMarketId = null;
        this.productGroupKeys = null;
        this.includes = null;
        this.offset = null;
        this.limit = null;
        this.sort = null;
    }

    public ListRequest(String xAppKey, String xShopperId, String xMarketId, List<String> productGroupKeys, List<String> includes, Long offset, Long limit, String sort) {
        this.xAppKey = xAppKey;
        this.xShopperId = xShopperId;
        this.xMarketId = xMarketId;
        this.productGroupKeys = productGroupKeys;
        this.includes = includes;
        this.offset = offset;
        this.limit = limit;
        this.sort = sort;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("productGroupKeys", productGroupKeys), new Param("includes", includes), new Param("offset", offset), new Param("limit", limit), new Param("sort", sort));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-App-Key", xAppKey), new Param("X-Shopper-Id", xShopperId), new Param("X-Market-Id", xMarketId));
    }

    public Object body() {
        return null;
    }
}
