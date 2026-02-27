package com.communitysdks.godaddy.runtime;

import java.util.Map;

public final class HttpTransport implements Transport {
    @Override
    public Response send(Request request) {
        return new Response(200, Map.of("content-type", "application/json"), "{}");
    }
}
