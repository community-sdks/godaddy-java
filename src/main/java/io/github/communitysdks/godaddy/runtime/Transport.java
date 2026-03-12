package io.github.communitysdks.godaddy.runtime;

public interface Transport {
    Response send(Request request);
}
