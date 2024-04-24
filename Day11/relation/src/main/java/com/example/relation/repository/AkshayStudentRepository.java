package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.AkshayStudent;

@Repository
public interface AkshayStudentRepository extends JpaRepository<AkshayStudent,Integer>{
    
}
