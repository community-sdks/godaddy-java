package io.github.communitysdks.godaddy.dto.countries.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetCountriesRequest {
    public final String marketId;

    public GetCountriesRequest() {
        this.marketId = null;
    }

    public GetCountriesRequest(String marketId) {
        this.marketId = marketId;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("marketId", marketId));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
