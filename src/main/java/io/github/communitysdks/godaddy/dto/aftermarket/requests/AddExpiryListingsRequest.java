package io.github.communitysdks.godaddy.dto.aftermarket.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class AddExpiryListingsRequest {
    public final List<Map<String, Object>> expiryListings;

    public AddExpiryListingsRequest() {
        this.expiryListings = null;
    }

    public AddExpiryListingsRequest(List<Map<String, Object>> expiryListings) {
        this.expiryListings = expiryListings;
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
        return expiryListings;
    }
}
