package ru.dudeandrey.jsonworker2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "slug",
        "name",
        "category"
})
@Generated("jsonschema2pojo")
public class Tag {

    @JsonProperty("slug")
    public String slug;
    @JsonProperty("name")
    public String name;
    @JsonProperty("category")
    public String category;

}
