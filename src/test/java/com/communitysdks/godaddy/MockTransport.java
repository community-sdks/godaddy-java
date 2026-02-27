package com.communitysdks.godaddy;

import com.communitysdks.godaddy.runtime.Request;
import com.communitysdks.godaddy.runtime.Response;
import com.communitysdks.godaddy.runtime.Transport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class MockTransport implements Transport {
    final List<Request> requests = new ArrayList<>();
    final List<Response> responses = new ArrayList<>();

    void push(Response response) { responses.add(response); }

    @Override
    public Response send(Request request) {
        requests.add(request);
        if (responses.isEmpty()) return new Response(200, Map.of("content-type", "application/json"), "{}");
        return responses.removeFirst();
    }
}
