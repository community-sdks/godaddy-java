package io.github.communitysdks.godaddy.dto.auctions.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class PlaceBidsRequest {
    public final String customerId;
    public final List<Map<String, Object>> requestBody;

    public PlaceBidsRequest() {
        this.customerId = null;
        this.requestBody = null;
    }

    public PlaceBidsRequest(String customerId, List<Map<String, Object>> requestBody) {
        this.customerId = customerId;
        this.requestBody = requestBody;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return requestBody;
    }
}
