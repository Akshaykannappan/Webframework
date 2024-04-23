package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.AkshayStudent;
import com.examly.springapp.repository.AkshayStudentRepo;

@Service
public class StudentService {
    @Autowired
    private AkshayStudentRepo studentRepo;

    public boolean post(AkshayStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AkshayStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<AkshayStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
