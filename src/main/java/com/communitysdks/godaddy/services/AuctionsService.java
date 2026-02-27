package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class AuctionsService extends AbstractService {
    public AuctionsService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result placeBids(Object customerId, Object requestBody) {
        return call(
            "POST",
            "/v1/customers/{customerId}/aftermarket/listings/bids",
            List.of(new Param("customerId", customerId)),
            List.of(),
            List.of(),
            requestBody
        );
    }
}
