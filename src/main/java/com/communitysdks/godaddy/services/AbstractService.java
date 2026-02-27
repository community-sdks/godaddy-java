package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public abstract class AbstractService {
    protected final ApiClient client;
    protected final String baseUrl;

    protected AbstractService(ApiClient client, String baseUrl) {
        this.client = client;
        this.baseUrl = baseUrl;
    }

    protected Result call(String method, String path, List<Param> pathParams, List<Param> queryParams, List<Param> headers, Object body) {
        return client.request(method, baseUrl, path, pathParams, queryParams, headers, body);
    }
}
