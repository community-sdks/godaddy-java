package io.github.communitysdks.godaddy.dto.ans.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class RegisterAgentResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String ansName;
    public List<Map<String, Object>> challenges;
    public List<Map<String, Object>> dnsRecords;
    public String expiresAt;
    public List<Map<String, Object>> links;
    public List<Map<String, Object>> nextSteps;
    public String status;

    public static RegisterAgentResponse fromMixed(Object data) {
        RegisterAgentResponse response = new RegisterAgentResponse();
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
            response.ansName = ((map.get("ansName") instanceof String) ? (String) map.get("ansName") : null);
            response.challenges = ((map.get("challenges") instanceof List<?>) ? (List<Map<String, Object>>) map.get("challenges") : null);
            response.dnsRecords = ((map.get("dnsRecords") instanceof List<?>) ? (List<Map<String, Object>>) map.get("dnsRecords") : null);
            response.expiresAt = ((map.get("expiresAt") instanceof String) ? (String) map.get("expiresAt") : null);
            response.links = ((map.get("links") instanceof List<?>) ? (List<Map<String, Object>>) map.get("links") : null);
            response.nextSteps = ((map.get("nextSteps") instanceof List<?>) ? (List<Map<String, Object>>) map.get("nextSteps") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
