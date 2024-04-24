package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.AkshayStudent;
import com.example.relation.repository.AkshayStudentRepository;

@Service
public class StudentService {
    public AkshayStudentRepository studentRepository;
    public StudentService(AkshayStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public AkshayStudent saveStudent(AkshayStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AkshayStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
