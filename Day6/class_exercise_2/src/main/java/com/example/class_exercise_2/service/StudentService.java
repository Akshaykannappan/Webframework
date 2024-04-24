package com.example.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.AkshayStudent;
import com.example.class_exercise_2.repository.AkshayStudentRepo;

@Service
public class StudentService {

     @Autowired
     public AkshayStudentRepo studentRepo;

     public List<AkshayStudent> getAll() {
          return studentRepo.findAll();
     }

     public AkshayStudent post(AkshayStudent student) {
          return studentRepo.save(student);
     }

     public List<AkshayStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
