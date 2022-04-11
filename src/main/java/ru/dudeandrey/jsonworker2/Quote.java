package ru.dudeandrey.jsonworker2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "RUB"
})
@Generated("jsonschema2pojo")
public class Quote {

    @JsonProperty("RUB")
    public Rub rub;

}