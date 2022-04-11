package ru.dudeandrey.jsonworker;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty("status")
    public Status status;
    @JsonProperty("data")
    public Data data;
}
