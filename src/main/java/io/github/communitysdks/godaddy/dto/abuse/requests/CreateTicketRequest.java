package io.github.communitysdks.godaddy.dto.abuse.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class CreateTicketRequest {
    public final Map<String, Object> body;

    public CreateTicketRequest() {
        this.body = null;
    }

    public CreateTicketRequest(Map<String, Object> body) {
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
