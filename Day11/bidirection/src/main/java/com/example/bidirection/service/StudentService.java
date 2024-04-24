package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.AkshayStudent;
import com.example.bidirection.model.AkshayStudentInfo;
import com.example.bidirection.repository.AkshayStudentInfoRepository;
import com.example.bidirection.repository.AkshayStudentRepository;

@Service
public class StudentService {
    public AkshayStudentRepository studentRepository;
    public AkshayStudentInfoRepository studentInfoRepository;
    public StudentService(AkshayStudentRepository studentRepository,AkshayStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AkshayStudent saveStudent(AkshayStudent student)
    {
        return studentRepository.save(student);
    }
    public AkshayStudentInfo saveStudentInfo(AkshayStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AkshayStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
