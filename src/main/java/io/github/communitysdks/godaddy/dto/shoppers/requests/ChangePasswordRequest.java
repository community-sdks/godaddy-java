package io.github.communitysdks.godaddy.dto.shoppers.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class ChangePasswordRequest {
    public final String shopperId;
    public final Map<String, Object> secret;

    public ChangePasswordRequest() {
        this.shopperId = null;
        this.secret = null;
    }

    public ChangePasswordRequest(String shopperId, Map<String, Object> secret) {
        this.shopperId = shopperId;
        this.secret = secret;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("shopperId", shopperId));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return secret;
    }
}
