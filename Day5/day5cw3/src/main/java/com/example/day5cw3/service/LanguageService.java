package com.example.day5cw3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.model.Akshay;
import com.example.day5cw3.repository.AkshayLanguageRepo;

@Service
public class LanguageService {
    private AkshayLanguageRepo languageRepo;
    public LanguageService(AkshayLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(Akshay language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Akshay> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,Akshay language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public Akshay getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
