package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class AgreementsService extends AbstractService {
    public AgreementsService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result get(Object keys, Object xPrivateLabelId, Object xMarketId) {
        return call(
            "GET",
            "/v1/agreements",
            List.of(),
            List.of(new Param("keys", keys)),
            List.of(new Param("X-Private-Label-Id", xPrivateLabelId), new Param("X-Market-Id", xMarketId)),
            null
        );
    }
}
