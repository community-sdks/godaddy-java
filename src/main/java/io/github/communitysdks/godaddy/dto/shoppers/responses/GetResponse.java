package io.github.communitysdks.godaddy.dto.shoppers.responses;

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
    public String customerId;
    public String email;
    public Long externalId;
    public String marketId;
    public String nameFirst;
    public String nameLast;
    public String shopperId;

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
            response.customerId = ((map.get("customerId") instanceof String) ? (String) map.get("customerId") : null);
            response.email = ((map.get("email") instanceof String) ? (String) map.get("email") : null);
            response.externalId = ((map.get("externalId") instanceof Number) ? ((Number) map.get("externalId")).longValue() : null);
            response.marketId = ((map.get("marketId") instanceof String) ? (String) map.get("marketId") : null);
            response.nameFirst = ((map.get("nameFirst") instanceof String) ? (String) map.get("nameFirst") : null);
            response.nameLast = ((map.get("nameLast") instanceof String) ? (String) map.get("nameLast") : null);
            response.shopperId = ((map.get("shopperId") instanceof String) ? (String) map.get("shopperId") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
