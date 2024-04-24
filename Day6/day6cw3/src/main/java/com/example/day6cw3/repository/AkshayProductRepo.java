package com.example.day6cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.model.AkshayProduct;

@Repository
public interface AkshayProductRepo extends JpaRepository<AkshayProduct,Integer>{
    
}
