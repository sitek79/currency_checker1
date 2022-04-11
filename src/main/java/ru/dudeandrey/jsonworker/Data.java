package ru.dudeandrey.jsonworker;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Data {
    @JsonProperty("ADA")
    public ArrayList<ADA> aDA;
}
