package com.example.mongo.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.demo.document.StudentsPojo;
import com.example.mongo.demo.repository.StudentRepository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MogoDbController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/getAll")
    public ResponseEntity<List<StudentsPojo>> getAll() {

        List<StudentsPojo> students = studentRepository.findAll();

        return ResponseEntity.ok().body(students);
    }

    @PostMapping("/getStudent")
    public ResponseEntity<StudentsPojo> getStudent(@RequestBody String name) {

        StudentsPojo student = studentRepository.findByName(name);

        return ResponseEntity.ok().body(student);
    }

    @PostMapping("/createStudent")
    public ResponseEntity<String> getStudent(@RequestBody StudentsPojo student) {

        student.setLastModified(new Date());
  
        studentRepository.save(student);

        return ResponseEntity.ok().body("Update success !");
    }

    @PostMapping("/updateStudent")
    public ResponseEntity<String> updateStudent(@RequestBody StudentsPojo student) {

        studentRepository.save(student);

        return ResponseEntity.ok().body("Update success !");
    }

    @DeleteMapping("/deleteStudent")
    public ResponseEntity<String> deleteStudent(@RequestBody StudentsPojo student) {

        studentRepository.delete(student.getName());

        return ResponseEntity.ok().body("Delete success !");
    }
}
