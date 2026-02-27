package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CountriesService extends AbstractService {
    public CountriesService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result getCountries(Object marketId) {
        return call(
            "GET",
            "/v1/countries",
            List.of(),
            List.of(new Param("marketId", marketId)),
            List.of(),
            null
        );
    }

    public Result getCountry(Object countryKey, Object marketId) {
        return call(
            "GET",
            "/v1/countries/{countryKey}",
            List.of(new Param("countryKey", countryKey)),
            List.of(new Param("marketId", marketId)),
            List.of(),
            null
        );
    }
}
