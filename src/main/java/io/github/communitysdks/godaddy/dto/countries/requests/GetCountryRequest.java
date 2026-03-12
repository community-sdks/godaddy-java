package io.github.communitysdks.godaddy.dto.countries.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetCountryRequest {
    public final String countryKey;
    public final String marketId;

    public GetCountryRequest() {
        this.countryKey = null;
        this.marketId = null;
    }

    public GetCountryRequest(String countryKey, String marketId) {
        this.countryKey = countryKey;
        this.marketId = marketId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("countryKey", countryKey));
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
