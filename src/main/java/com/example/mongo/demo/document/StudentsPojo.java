package com.example.mongo.demo.document;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.mongo.demo.pojo.Scholarship;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Document("students")
public class StudentsPojo {
    @Id
    @JsonProperty("_id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private Integer age;

    @JsonProperty("major")
    private String major;

    @JsonProperty("scholarship")
    private Scholarship scholarship;

    @JsonProperty("lastModified")
    private Date lastModified;
}
