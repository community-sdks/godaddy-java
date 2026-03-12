package io.github.communitysdks.godaddy.dto.ans.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class SearchAnsnameResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public List<Map<String, Object>> agents;
    public Boolean hasMore;
    public Long limit;
    public Long offset;
    public Long returnedCount;
    public Map<String, Object> searchCriteria;
    public Long totalCount;

    public static SearchAnsnameResponse fromMixed(Object data) {
        SearchAnsnameResponse response = new SearchAnsnameResponse();
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
            response.agents = ((map.get("agents") instanceof List<?>) ? (List<Map<String, Object>>) map.get("agents") : null);
            response.hasMore = ((map.get("hasMore") instanceof Boolean) ? (Boolean) map.get("hasMore") : null);
            response.limit = ((map.get("limit") instanceof Number) ? ((Number) map.get("limit")).longValue() : null);
            response.offset = ((map.get("offset") instanceof Number) ? ((Number) map.get("offset")).longValue() : null);
            response.returnedCount = ((map.get("returnedCount") instanceof Number) ? ((Number) map.get("returnedCount")).longValue() : null);
            response.searchCriteria = ((map.get("searchCriteria") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("searchCriteria") : null);
            response.totalCount = ((map.get("totalCount") instanceof Number) ? ((Number) map.get("totalCount")).longValue() : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
