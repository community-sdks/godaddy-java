package io.github.communitysdks.godaddy.dto.ans.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetAgentCsrStatusByAgentIdResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String csrId;
    public String failureReason;
    public String status;
    public String submittedAt;
    public String type;
    public String updatedAt;

    public static GetAgentCsrStatusByAgentIdResponse fromMixed(Object data) {
        GetAgentCsrStatusByAgentIdResponse response = new GetAgentCsrStatusByAgentIdResponse();
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
            response.csrId = ((map.get("csrId") instanceof String) ? (String) map.get("csrId") : null);
            response.failureReason = ((map.get("failureReason") instanceof String) ? (String) map.get("failureReason") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.submittedAt = ((map.get("submittedAt") instanceof String) ? (String) map.get("submittedAt") : null);
            response.type = ((map.get("type") instanceof String) ? (String) map.get("type") : null);
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
