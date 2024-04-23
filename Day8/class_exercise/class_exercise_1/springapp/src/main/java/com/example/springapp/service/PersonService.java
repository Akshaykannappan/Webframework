package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AkshayPerson;
import com.example.springapp.repository.AkshayPersonRepo;

@Service
public class PersonService {
    @Autowired
    private AkshayPersonRepo rep;

    public boolean post(AkshayPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AkshayPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<AkshayPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
