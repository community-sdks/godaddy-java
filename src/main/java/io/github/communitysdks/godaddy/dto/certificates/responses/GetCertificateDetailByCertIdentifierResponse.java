package io.github.communitysdks.godaddy.dto.certificates.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetCertificateDetailByCertIdentifierResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String certificateId;
    public String commonName;
    public Long period;
    public String type;
    public String status;
    public String createdAt;
    public String completedAt;
    public String validEndAt;
    public String validStartAt;
    public String revokedAt;
    public Boolean renewalAvailable;
    public String serialNumber;
    public String serialNumberHex;
    public String slotSize;
    public List<String> subjectAlternativeNames;
    public Map<String, Object> contact;
    public Map<String, Object> organization;
    public String csr;
    public String rootType;
    public String deniedReason;
    public Long progress;

    public static GetCertificateDetailByCertIdentifierResponse fromMixed(Object data) {
        GetCertificateDetailByCertIdentifierResponse response = new GetCertificateDetailByCertIdentifierResponse();
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
            response.certificateId = ((map.get("certificateId") instanceof String) ? (String) map.get("certificateId") : null);
            response.commonName = ((map.get("commonName") instanceof String) ? (String) map.get("commonName") : null);
            response.period = ((map.get("period") instanceof Number) ? ((Number) map.get("period")).longValue() : null);
            response.type = ((map.get("type") instanceof String) ? (String) map.get("type") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.completedAt = ((map.get("completedAt") instanceof String) ? (String) map.get("completedAt") : null);
            response.validEndAt = ((map.get("validEndAt") instanceof String) ? (String) map.get("validEndAt") : null);
            response.validStartAt = ((map.get("validStartAt") instanceof String) ? (String) map.get("validStartAt") : null);
            response.revokedAt = ((map.get("revokedAt") instanceof String) ? (String) map.get("revokedAt") : null);
            response.renewalAvailable = ((map.get("renewalAvailable") instanceof Boolean) ? (Boolean) map.get("renewalAvailable") : null);
            response.serialNumber = ((map.get("serialNumber") instanceof String) ? (String) map.get("serialNumber") : null);
            response.serialNumberHex = ((map.get("serialNumberHex") instanceof String) ? (String) map.get("serialNumberHex") : null);
            response.slotSize = ((map.get("slotSize") instanceof String) ? (String) map.get("slotSize") : null);
            response.subjectAlternativeNames = ((map.get("subjectAlternativeNames") instanceof List<?>) ? (List<String>) map.get("subjectAlternativeNames") : null);
            response.contact = ((map.get("contact") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("contact") : null);
            response.organization = ((map.get("organization") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("organization") : null);
            response.csr = ((map.get("csr") instanceof String) ? (String) map.get("csr") : null);
            response.rootType = ((map.get("rootType") instanceof String) ? (String) map.get("rootType") : null);
            response.deniedReason = ((map.get("deniedReason") instanceof String) ? (String) map.get("deniedReason") : null);
            response.progress = ((map.get("progress") instanceof Number) ? ((Number) map.get("progress")).longValue() : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
