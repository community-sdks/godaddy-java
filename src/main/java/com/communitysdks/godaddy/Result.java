package com.communitysdks.godaddy;

public final class Result {
    private final String value;

    public Result(String value) {
        this.value = value == null ? "" : value;
    }

    public String asString() {
        return value;
    }
}
