package io.github.communitysdks.godaddy.dto.shoppers.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class UpdateRequest {
    public final String shopperId;
    public final Map<String, Object> shopper;

    public UpdateRequest() {
        this.shopperId = null;
        this.shopper = null;
    }

    public UpdateRequest(String shopperId, Map<String, Object> shopper) {
        this.shopperId = shopperId;
        this.shopper = shopper;
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
        return shopper;
    }
}
