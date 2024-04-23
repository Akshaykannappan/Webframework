package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.AkshayDoor;
import com.examly.springapp.repository.AkshayDoorRepo;

@Service
public class DoorService {
    @Autowired
    private AkshayDoorRepo doorRepo;

    public AkshayDoor postData(AkshayDoor door) {
        return doorRepo.save(door);
    }

    public List<AkshayDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public AkshayDoor updateDetail(int doorid, AkshayDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<AkshayDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<AkshayDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public AkshayDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}