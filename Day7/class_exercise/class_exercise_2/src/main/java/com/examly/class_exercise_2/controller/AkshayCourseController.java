package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.AkshayCourse;
import com.examly.class_exercise_2.service.CourseService;

@RestController
public class AkshayCourseController {

     @Autowired
     public CourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<AkshayCourse> postMethodName(@RequestBody AkshayCourse entity) {

          AkshayCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<AkshayCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<AkshayCourse>> getMethodName() {

          List<AkshayCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AkshayCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AkshayCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<AkshayCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}