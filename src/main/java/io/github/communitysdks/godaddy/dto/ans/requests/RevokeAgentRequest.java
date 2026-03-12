package io.github.communitysdks.godaddy.dto.ans.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class RevokeAgentRequest {
    public final String agentId;
    public final Map<String, Object> body;

    public RevokeAgentRequest() {
        this.agentId = null;
        this.body = null;
    }

    public RevokeAgentRequest(String agentId, Map<String, Object> body) {
        this.agentId = agentId;
        this.body = body;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("agentId", agentId));
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
