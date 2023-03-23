package com.myspace.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDto {
    private final Integer id;
    private final String message;

    @JsonCreator
    public MessageDto(@JsonProperty("id") Integer id,
                         @JsonProperty("message") String message) {
        this.id = id;
        this.message = message;
    }

    public Integer getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "MessageDto{id=" + this.id + ", message='" + this.message + "'}";
    }
}
