package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.AkshayAddress;
import com.example.ce1.repository.AkshayAddressRepo;
import com.example.ce1.repository.AkshayEmployeeRepo;

@Service
public class AkshayAddressService {
    @Autowired
    AkshayAddressRepo addressRepo;
    @Autowired
    AkshayEmployeeRepo employeeRepo;
    public AkshayAddress setAddressById(int id,AkshayAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
