package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class RecordAddRequest {
    public final String xShopperId;
    public final String domain;
    public final List<Map<String, Object>> records;

    public RecordAddRequest() {
        this.xShopperId = null;
        this.domain = null;
        this.records = null;
    }

    public RecordAddRequest(String xShopperId, String domain, List<Map<String, Object>> records) {
        this.xShopperId = xShopperId;
        this.domain = domain;
        this.records = records;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("domain", domain));
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
