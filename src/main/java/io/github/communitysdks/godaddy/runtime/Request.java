package io.github.communitysdks.godaddy.runtime;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public final class Request {
    public final String method;
    public final String url;
    public final Map<String, String> headers;
    public final List<QueryPair> query;
    public final Object body;

    public Request(String method, String url, Map<String, String> headers, List<QueryPair> query, Object body) {
        this.method = method;
        this.url = url;
        this.headers = headers;
        this.query = query;
        this.body = body;
    }

    public String fullUrl() {
        if (query.isEmpty()) return url;
        StringJoiner joiner = new StringJoiner("&", url + "?", "");
        for (QueryPair pair : query) joiner.add(pair.key() + "=" + pair.value());
        return joiner.toString();
    }
}
