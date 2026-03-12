package io.github.communitysdks.godaddy.dto.ans.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class VerifyDnsRecordsResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public List<String> completedSteps;
    public String createdAt;
    public String expiresAt;
    public List<String> pendingSteps;
    public String phase;
    public String status;
    public String updatedAt;

    public static VerifyDnsRecordsResponse fromMixed(Object data) {
        VerifyDnsRecordsResponse response = new VerifyDnsRecordsResponse();
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
            response.completedSteps = ((map.get("completedSteps") instanceof List<?>) ? (List<String>) map.get("completedSteps") : null);
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.expiresAt = ((map.get("expiresAt") instanceof String) ? (String) map.get("expiresAt") : null);
            response.pendingSteps = ((map.get("pendingSteps") instanceof List<?>) ? (List<String>) map.get("pendingSteps") : null);
            response.phase = ((map.get("phase") instanceof String) ? (String) map.get("phase") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.updatedAt = ((map.get("updatedAt") instanceof String) ? (String) map.get("updatedAt") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
