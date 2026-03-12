package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest {
    public final String xRequestId;
    public final String customerId;
    public final String notificationId;

    public PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.notificationId = null;
    }

    public PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest(String xRequestId, String customerId, String notificationId) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.notificationId = notificationId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("notificationId", notificationId));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
