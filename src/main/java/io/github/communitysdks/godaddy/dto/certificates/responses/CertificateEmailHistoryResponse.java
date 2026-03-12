package io.github.communitysdks.godaddy.dto.certificates.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class CertificateEmailHistoryResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public Long id;
    public Long accountId;
    public String templateType;
    public String fromType;
    public String recipients;
    public String body;
    public String dateEntered;
    public String subject;

    public static CertificateEmailHistoryResponse fromMixed(Object data) {
        CertificateEmailHistoryResponse response = new CertificateEmailHistoryResponse();
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
            response.id = ((map.get("id") instanceof Number) ? ((Number) map.get("id")).longValue() : null);
            response.accountId = ((map.get("accountId") instanceof Number) ? ((Number) map.get("accountId")).longValue() : null);
            response.templateType = ((map.get("templateType") instanceof String) ? (String) map.get("templateType") : null);
            response.fromType = ((map.get("fromType") instanceof String) ? (String) map.get("fromType") : null);
            response.recipients = ((map.get("recipients") instanceof String) ? (String) map.get("recipients") : null);
            response.body = ((map.get("body") instanceof String) ? (String) map.get("body") : null);
            response.dateEntered = ((map.get("dateEntered") instanceof String) ? (String) map.get("dateEntered") : null);
            response.subject = ((map.get("subject") instanceof String) ? (String) map.get("subject") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
