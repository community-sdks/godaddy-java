package io.github.communitysdks.godaddy.dto.domains.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetV2CustomersCustomerIdDomainsNotificationsResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String notificationId;
    public String type;
    public String resource;
    public String resourceType;
    public String status;
    public String addedAt;
    public String requestId;
    public Map<String, Object> metadata;

    public static GetV2CustomersCustomerIdDomainsNotificationsResponse fromMixed(Object data) {
        GetV2CustomersCustomerIdDomainsNotificationsResponse response = new GetV2CustomersCustomerIdDomainsNotificationsResponse();
        response.raw = data;

        Object value = data;
        if (value instanceof String str) value = JsonCodec.parse(str);

        if (value instanceof Map<?, ?> mapAny) {
            Map<String, Object> map = (Map<String, Object>) mapAny;
            response.object = map;
            Object itemsValue = map.get("items");
            if (itemsValue instanceof List<?> list) response.items = (List<Object>) list;
            Object codeValue = map.get("code");
            if (codeValue instanceof String s) response.code = s;
            Object messageValue = map.get("message");
            if (messageValue instanceof String s) response.message = s;
            response.notificationId = ((map.get("notificationId") instanceof String) ? (String) map.get("notificationId") : null);
            response.type = ((map.get("type") instanceof String) ? (String) map.get("type") : null);
            response.resource = ((map.get("resource") instanceof String) ? (String) map.get("resource") : null);
            response.resourceType = ((map.get("resourceType") instanceof String) ? (String) map.get("resourceType") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.addedAt = ((map.get("addedAt") instanceof String) ? (String) map.get("addedAt") : null);
            response.requestId = ((map.get("requestId") instanceof String) ? (String) map.get("requestId") : null);
            response.metadata = ((map.get("metadata") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("metadata") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
