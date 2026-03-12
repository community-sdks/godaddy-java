package io.github.communitysdks.godaddy.dto.shoppers.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class CreateSubaccountRequest {
    public final Map<String, Object> subaccount;

    public CreateSubaccountRequest() {
        this.subaccount = null;
    }

    public CreateSubaccountRequest(Map<String, Object> subaccount) {
        this.subaccount = subaccount;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return subaccount;
    }
}
