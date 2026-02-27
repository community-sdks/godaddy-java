package com.communitysdks.godaddy.runtime;

import java.util.Map;

public record Response(int statusCode, Map<String, String> headers, String body) {}
