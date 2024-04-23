package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.AkshayPerson;
import com.examly.class_exercise_1.repository.AkshayPersonRepo;

@Service
public class PersonService {

     @Autowired
     public AkshayPersonRepo personRepo;

     public AkshayPerson SaveEntity(AkshayPerson entity) {
          return personRepo.save(entity);

     }

     public List<AkshayPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<AkshayPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
