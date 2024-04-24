package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.AkshayStudentInfo;

@Repository
public interface AkshayStudentInfoRepository extends JpaRepository<AkshayStudentInfo,Integer>{
    
}