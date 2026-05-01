package com.example.fsdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    // GET
    @GetMapping("/get")
    public String getStudent() {
        return "Student Details";
    }

    // POST
    @PostMapping("/add")
    public String addStudent(@RequestBody String name) {
        return "Student Added: " + name;
    }

    // PUT
    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id) {
        return "Student Updated: " + id;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return "Student Deleted: " + id;
    }

    // PATCH
    @PatchMapping("/patch/{id}")
    public String patchStudent(@PathVariable int id) {
        return "Student Partially Updated: " + id;
    }

    // CALL COURSE SERVICE (Service Discovery)
    @GetMapping("/call-course")
    public String callCourseService() {
        return restTemplate.getForObject(
                "http://COURSE-SERVICE/course/all", String.class);
    }
}