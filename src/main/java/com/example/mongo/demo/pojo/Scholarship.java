package com.example.mongo.demo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Scholarship {

    @JsonProperty("merit")
    private Integer merit;

    @JsonProperty("other")
    private Integer other;
}
