package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class SubscriptionsService extends AbstractService {
    public SubscriptionsService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result list(Object xAppKey, Object xShopperId, Object xMarketId, Object productGroupKeys, Object includes, Object offset, Object limit, Object sort) {
        return call(
            "GET",
            "/v1/subscriptions",
            List.of(),
            List.of(new Param("productGroupKeys", productGroupKeys), new Param("includes", includes), new Param("offset", offset), new Param("limit", limit), new Param("sort", sort)),
            List.of(new Param("X-App-Key", xAppKey), new Param("X-Shopper-Id", xShopperId), new Param("X-Market-Id", xMarketId)),
            null
        );
    }

    public Result productGroups(Object xAppKey, Object xShopperId) {
        return call(
            "GET",
            "/v1/subscriptions/productGroups",
            List.of(),
            List.of(),
            List.of(new Param("X-App-Key", xAppKey), new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result cancel(Object subscriptionId, Object xAppKey, Object xShopperId) {
        return call(
            "DELETE",
            "/v1/subscriptions/{subscriptionId}",
            List.of(new Param("subscriptionId", subscriptionId)),
            List.of(),
            List.of(new Param("X-App-Key", xAppKey), new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result get(Object subscriptionId, Object xAppKey, Object xShopperId) {
        return call(
            "GET",
            "/v1/subscriptions/{subscriptionId}",
            List.of(new Param("subscriptionId", subscriptionId)),
            List.of(),
            List.of(new Param("X-App-Key", xAppKey), new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result update(Object subscriptionId, Object xAppKey, Object subscription, Object xShopperId) {
        return call(
            "PATCH",
            "/v1/subscriptions/{subscriptionId}",
            List.of(new Param("subscriptionId", subscriptionId)),
            List.of(),
            List.of(new Param("X-App-Key", xAppKey), new Param("X-Shopper-Id", xShopperId)),
            subscription
        );
    }
}
