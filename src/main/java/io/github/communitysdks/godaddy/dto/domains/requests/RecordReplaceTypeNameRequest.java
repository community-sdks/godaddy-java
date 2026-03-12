package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class RecordReplaceTypeNameRequest {
    public final String xShopperId;
    public final String domain;
    public final String type;
    public final String name;
    public final List<Map<String, Object>> records;

    public RecordReplaceTypeNameRequest() {
        this.xShopperId = null;
        this.domain = null;
        this.type = null;
        this.name = null;
        this.records = null;
    }

    public RecordReplaceTypeNameRequest(String xShopperId, String domain, String type, String name, List<Map<String, Object>> records) {
        this.xShopperId = xShopperId;
        this.domain = domain;
        this.type = type;
        this.name = name;
        this.records = records;
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
        return records;
    }
}
