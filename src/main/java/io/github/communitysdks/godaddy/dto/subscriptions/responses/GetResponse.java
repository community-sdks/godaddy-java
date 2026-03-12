package io.github.communitysdks.godaddy.dto.subscriptions.responses;

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
    public List<Map<String, Object>> addons;
    public Map<String, Object> billing;
    public Boolean cancelable;
    public String createdAt;
    public String expiresAt;
    public String label;
    public String launchUrl;
    public Long paymentProfileId;
    public Boolean priceLocked;
    public Map<String, Object> product;
    public Map<String, Object> relations;
    public Boolean renewAuto;
    public Boolean renewable;
    public String status;
    public String subscriptionId;
    public Boolean upgradeable;

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
            response.addons = ((map.get("addons") instanceof List<?>) ? (List<Map<String, Object>>) map.get("addons") : null);
            response.billing = ((map.get("billing") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("billing") : null);
            response.cancelable = ((map.get("cancelable") instanceof Boolean) ? (Boolean) map.get("cancelable") : null);
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.expiresAt = ((map.get("expiresAt") instanceof String) ? (String) map.get("expiresAt") : null);
            response.label = ((map.get("label") instanceof String) ? (String) map.get("label") : null);
            response.launchUrl = ((map.get("launchUrl") instanceof String) ? (String) map.get("launchUrl") : null);
            response.paymentProfileId = ((map.get("paymentProfileId") instanceof Number) ? ((Number) map.get("paymentProfileId")).longValue() : null);
            response.priceLocked = ((map.get("priceLocked") instanceof Boolean) ? (Boolean) map.get("priceLocked") : null);
            response.product = ((map.get("product") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("product") : null);
            response.relations = ((map.get("relations") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("relations") : null);
            response.renewAuto = ((map.get("renewAuto") instanceof Boolean) ? (Boolean) map.get("renewAuto") : null);
            response.renewable = ((map.get("renewable") instanceof Boolean) ? (Boolean) map.get("renewable") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.subscriptionId = ((map.get("subscriptionId") instanceof String) ? (String) map.get("subscriptionId") : null);
            response.upgradeable = ((map.get("upgradeable") instanceof Boolean) ? (Boolean) map.get("upgradeable") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
