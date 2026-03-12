package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetV2DomainsMaintenancesMaintenanceIdRequest {
    public final String xRequestId;
    public final String maintenanceId;

    public GetV2DomainsMaintenancesMaintenanceIdRequest() {
        this.xRequestId = null;
        this.maintenanceId = null;
    }

    public GetV2DomainsMaintenancesMaintenanceIdRequest(String xRequestId, String maintenanceId) {
        this.xRequestId = xRequestId;
        this.maintenanceId = maintenanceId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("maintenanceId", maintenanceId));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
