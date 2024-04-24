package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.AkshayStudent;
import com.example.bidirection.model.AkshayStudentInfo;
import com.example.bidirection.service.StudentService;
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
    @PostMapping("/api/poststudent")
    public AkshayStudent postMethodName(@RequestBody AkshayStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AkshayStudentInfo postMethodName(@RequestBody AkshayStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<AkshayStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}