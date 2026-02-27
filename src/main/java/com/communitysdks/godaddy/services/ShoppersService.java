package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class ShoppersService extends AbstractService {
    public ShoppersService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result createSubaccount(Object subaccount) {
        return call(
            "POST",
            "/v1/shoppers/subaccount",
            List.of(),
            List.of(),
            List.of(),
            subaccount
        );
    }

    public Result get(Object shopperId, Object includes) {
        return call(
            "GET",
            "/v1/shoppers/{shopperId}",
            List.of(new Param("shopperId", shopperId)),
            List.of(new Param("includes", includes)),
            List.of(),
            null
        );
    }

    public Result update(Object shopperId, Object shopper) {
        return call(
            "POST",
            "/v1/shoppers/{shopperId}",
            List.of(new Param("shopperId", shopperId)),
            List.of(),
            List.of(),
            shopper
        );
    }

    public Result delete(Object shopperId, Object auditClientIp) {
        return call(
            "DELETE",
            "/v1/shoppers/{shopperId}",
            List.of(new Param("shopperId", shopperId)),
            List.of(new Param("auditClientIp", auditClientIp)),
            List.of(),
            null
        );
    }

    public Result getStatus(Object shopperId, Object auditClientIp) {
        return call(
            "GET",
            "/v1/shoppers/{shopperId}/status",
            List.of(new Param("shopperId", shopperId)),
            List.of(new Param("auditClientIp", auditClientIp)),
            List.of(),
            null
        );
    }

    public Result changePassword(Object shopperId, Object secret) {
        return call(
            "PUT",
            "/v1/shoppers/{shopperId}/factors/password",
            List.of(new Param("shopperId", shopperId)),
            List.of(),
            List.of(),
            secret
        );
    }
}
