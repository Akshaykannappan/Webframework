package com.example.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q1.model.AkshayBook;
@Repository
public interface AkshayBookRepository extends JpaRepository<AkshayBook, Long> {
}
