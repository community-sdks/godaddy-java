package io.github.communitysdks.godaddy.dto.domains.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String id;
    public Map<String, Object> models;
    public Map<String, Object> properties;
    public List<String> required;

    public static GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeResponse fromMixed(Object data) {
        GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeResponse response = new GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeResponse();
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
            response.id = ((map.get("id") instanceof String) ? (String) map.get("id") : null);
            response.models = ((map.get("models") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("models") : null);
            response.properties = ((map.get("properties") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("properties") : null);
            response.required = ((map.get("required") instanceof List<?>) ? (List<String>) map.get("required") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
