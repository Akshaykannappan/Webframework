package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.AkshayStudent;
import com.example.relation.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AkshayStudentController {
    public StudentService studentService;
    public AkshayStudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public AkshayStudent postMethodName(@RequestBody AkshayStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AkshayStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
