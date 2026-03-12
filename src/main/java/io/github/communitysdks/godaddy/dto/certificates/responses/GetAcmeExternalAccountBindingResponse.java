package io.github.communitysdks.godaddy.dto.certificates.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetAcmeExternalAccountBindingResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String directoryUrl;
    public String keyId;
    public String hmacKey;

    public static GetAcmeExternalAccountBindingResponse fromMixed(Object data) {
        GetAcmeExternalAccountBindingResponse response = new GetAcmeExternalAccountBindingResponse();
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
            response.directoryUrl = ((map.get("directoryUrl") instanceof String) ? (String) map.get("directoryUrl") : null);
            response.keyId = ((map.get("keyId") instanceof String) ? (String) map.get("keyId") : null);
            response.hmacKey = ((map.get("hmacKey") instanceof String) ? (String) map.get("hmacKey") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
