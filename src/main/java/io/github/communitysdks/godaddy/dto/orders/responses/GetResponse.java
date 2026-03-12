package io.github.communitysdks.godaddy.dto.orders.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public Map<String, Object> billTo;
    public String createdAt;
    public String currency;
    public List<Map<String, Object>> itemsField;
    public String orderId;
    public String parentOrderId;
    public List<Map<String, Object>> payments;
    public Map<String, Object> pricing;

    public static GetResponse fromMixed(Object data) {
        GetResponse response = new GetResponse();
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
            response.billTo = ((map.get("billTo") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("billTo") : null);
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.currency = ((map.get("currency") instanceof String) ? (String) map.get("currency") : null);
            response.itemsField = ((map.get("items") instanceof List<?>) ? (List<Map<String, Object>>) map.get("items") : null);
            response.orderId = ((map.get("orderId") instanceof String) ? (String) map.get("orderId") : null);
            response.parentOrderId = ((map.get("parentOrderId") instanceof String) ? (String) map.get("parentOrderId") : null);
            response.payments = ((map.get("payments") instanceof List<?>) ? (List<Map<String, Object>>) map.get("payments") : null);
            response.pricing = ((map.get("pricing") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("pricing") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
