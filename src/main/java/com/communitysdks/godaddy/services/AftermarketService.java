package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class AftermarketService extends AbstractService {
    public AftermarketService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result getListings(Object customerId, Object domains, Object listingStatus, Object transferBefore, Object transferAfter, Object limit, Object offset) {
        return call(
            "GET",
            "/v1/customers/{customerId}/auctions/listings",
            List.of(new Param("customerId", customerId)),
            List.of(new Param("domains", domains), new Param("listingStatus", listingStatus), new Param("transferBefore", transferBefore), new Param("transferAfter", transferAfter), new Param("limit", limit), new Param("offset", offset)),
            List.of(),
            null
        );
    }

    public Result deleteListings(Object domains) {
        return call(
            "DELETE",
            "/v1/aftermarket/listings",
            List.of(),
            List.of(new Param("domains", domains)),
            List.of(),
            null
        );
    }

    public Result addExpiryListings(Object expiryListings) {
        return call(
            "POST",
            "/v1/aftermarket/listings/expiry",
            List.of(),
            List.of(),
            List.of(),
            expiryListings
        );
    }
}
