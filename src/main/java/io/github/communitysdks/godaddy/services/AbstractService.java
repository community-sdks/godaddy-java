package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public abstract class AbstractService {
    protected final ApiClient client;
    protected final String serviceName;

    protected AbstractService(ApiClient client, String serviceName) {
        this.client = client;
        this.serviceName = serviceName;
    }

    protected Object execute(String method, String path, List<Param> pathParams, List<Param> queryParams, List<Param> headers, Object body) {
        try {
            return client.request(method, serviceName, path, pathParams, queryParams, headers, body);
        } catch (ApiException exception) {
            throw mapException(exception);
        }
    }

    protected ApiException mapException(ApiException exception) {
        return exception;
    }
}
