package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AkshayPerson;
import java.util.List;


@Repository
public interface AkshayPersonRepo extends JpaRepository<AkshayPerson,Integer>{

    List<AkshayPerson> findByNameStartingWith(String name);
    List<AkshayPerson> findByNameEndingWith(String name);
    
}
