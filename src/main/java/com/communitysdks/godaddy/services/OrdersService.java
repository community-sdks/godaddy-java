package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class OrdersService extends AbstractService {
    public OrdersService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result list(Object xAppKey, Object periodStart, Object periodEnd, Object domain, Object productGroupId, Object paymentProfileId, Object parentOrderId, Object offset, Object limit, Object sort, Object xShopperId) {
        return call(
            "GET",
            "/v1/orders",
            List.of(),
            List.of(new Param("periodStart", periodStart), new Param("periodEnd", periodEnd), new Param("domain", domain), new Param("productGroupId", productGroupId), new Param("paymentProfileId", paymentProfileId), new Param("parentOrderId", parentOrderId), new Param("offset", offset), new Param("limit", limit), new Param("sort", sort)),
            List.of(new Param("X-Shopper-Id", xShopperId), new Param("X-App-Key", xAppKey)),
            null
        );
    }

    public Result get(Object orderId, Object xAppKey, Object xShopperId, Object xMarketId) {
        return call(
            "GET",
            "/v1/orders/{orderId}",
            List.of(new Param("orderId", orderId)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId), new Param("X-Market-Id", xMarketId), new Param("X-App-Key", xAppKey)),
            null
        );
    }
}
