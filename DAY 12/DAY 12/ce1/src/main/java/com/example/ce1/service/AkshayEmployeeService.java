package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.AkshayEmployee;
import com.example.ce1.repository.AkshayEmployeeRepo;

@Service
public class AkshayEmployeeService {
    @Autowired
    AkshayEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public AkshayEmployee setEmployee(AkshayEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AkshayEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<AkshayEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
