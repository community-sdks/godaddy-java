package io.github.communitysdks.godaddy.dto.ans.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class ResolveAnsnameRequest {
    public final Map<String, Object> body;

    public ResolveAnsnameRequest() {
        this.body = null;
    }

    public ResolveAnsnameRequest(Map<String, Object> body) {
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
