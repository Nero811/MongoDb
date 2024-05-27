package com.example.mongo.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mongo.demo.document.StudentsPojo;

@Repository
public interface StudentRepository extends MongoRepository<StudentsPojo, String> {

    @Query("{name: :#{#name}}")
    StudentsPojo findByName(@Param("name") String name);
}
