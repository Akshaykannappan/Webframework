package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.AkshayPerson;
import com.example.springapp.repository.AkshayPersonRepo;

@Service
public class PersonService {
    public AkshayPersonRepo personRepo;

    public PersonService(AkshayPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AkshayPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AkshayPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
