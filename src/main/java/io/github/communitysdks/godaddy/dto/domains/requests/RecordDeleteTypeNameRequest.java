package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class RecordDeleteTypeNameRequest {
    public final String xShopperId;
    public final String domain;
    public final String type;
    public final String name;

    public RecordDeleteTypeNameRequest() {
        this.xShopperId = null;
        this.domain = null;
        this.type = null;
        this.name = null;
    }

    public RecordDeleteTypeNameRequest(String xShopperId, String domain, String type, String name) {
        this.xShopperId = xShopperId;
        this.domain = domain;
        this.type = type;
        this.name = name;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("domain", domain), new Param("type", type), new Param("name", name));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Shopper-Id", xShopperId));
    }

    public Object body() {
        return null;
    }
}
