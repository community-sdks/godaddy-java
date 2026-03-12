package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class RecordGetRequest {
    public final String xShopperId;
    public final String domain;
    public final String type;
    public final String name;
    public final Long offset;
    public final Long limit;

    public RecordGetRequest() {
        this.xShopperId = null;
        this.domain = null;
        this.type = null;
        this.name = null;
        this.offset = null;
        this.limit = null;
    }

    public RecordGetRequest(String xShopperId, String domain, String type, String name, Long offset, Long limit) {
        this.xShopperId = xShopperId;
        this.domain = domain;
        this.type = type;
        this.name = name;
        this.offset = offset;
        this.limit = limit;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("domain", domain), new Param("type", type), new Param("name", name));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("offset", offset), new Param("limit", limit));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Shopper-Id", xShopperId));
    }

    public Object body() {
        return null;
    }
}
