package io.github.communitysdks.godaddy.dto.certificates.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class RetrieveSslByDomainResellerResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public Long currentPage;
    public List<Map<String, Object>> data;
    public Long pageSize;
    public Long total;

    public static RetrieveSslByDomainResellerResponse fromMixed(Object data) {
        RetrieveSslByDomainResellerResponse response = new RetrieveSslByDomainResellerResponse();
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
            response.currentPage = ((map.get("currentPage") instanceof Number) ? ((Number) map.get("currentPage")).longValue() : null);
            response.data = ((map.get("data") instanceof List<?>) ? (List<Map<String, Object>>) map.get("data") : null);
            response.pageSize = ((map.get("pageSize") instanceof Number) ? ((Number) map.get("pageSize")).longValue() : null);
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
