package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class ValidateRequest {
    public final Map<String, Object> body;

    public ValidateRequest() {
        this.body = null;
    }

    public ValidateRequest(Map<String, Object> body) {
        this.body = body;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return body;
    }
}
