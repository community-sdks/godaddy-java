package io.github.communitysdks.godaddy.dto.domains.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetV2CustomersCustomerIdDomainsDomainActionsTypeResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String type;
    public String origination;
    public String createdAt;
    public String startedAt;
    public String completedAt;
    public String modifiedAt;
    public String status;
    public Map<String, Object> reason;
    public String requestId;

    public static GetV2CustomersCustomerIdDomainsDomainActionsTypeResponse fromMixed(Object data) {
        GetV2CustomersCustomerIdDomainsDomainActionsTypeResponse response = new GetV2CustomersCustomerIdDomainsDomainActionsTypeResponse();
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
            response.type = ((map.get("type") instanceof String) ? (String) map.get("type") : null);
            response.origination = ((map.get("origination") instanceof String) ? (String) map.get("origination") : null);
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.startedAt = ((map.get("startedAt") instanceof String) ? (String) map.get("startedAt") : null);
            response.completedAt = ((map.get("completedAt") instanceof String) ? (String) map.get("completedAt") : null);
            response.modifiedAt = ((map.get("modifiedAt") instanceof String) ? (String) map.get("modifiedAt") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.reason = ((map.get("reason") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("reason") : null);
            response.requestId = ((map.get("requestId") instanceof String) ? (String) map.get("requestId") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
