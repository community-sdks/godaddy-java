package io.github.communitysdks.godaddy.dto.domains.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class PurchaseResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String currency;
    public Long itemCount;
    public Long orderId;
    public Long total;

    public static PurchaseResponse fromMixed(Object data) {
        PurchaseResponse response = new PurchaseResponse();
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
            response.currency = ((map.get("currency") instanceof String) ? (String) map.get("currency") : null);
            response.itemCount = ((map.get("itemCount") instanceof Number) ? ((Number) map.get("itemCount")).longValue() : null);
            response.orderId = ((map.get("orderId") instanceof Number) ? ((Number) map.get("orderId")).longValue() : null);
            response.total = ((map.get("total") instanceof Number) ? ((Number) map.get("total")).longValue() : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
