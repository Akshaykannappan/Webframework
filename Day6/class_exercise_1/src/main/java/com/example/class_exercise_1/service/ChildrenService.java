package com.example.class_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.AkshayChildren;
import com.example.class_exercise_1.repository.AkshayChildrenRepo;

@Service
public class ChildrenService {

     @Autowired
     public AkshayChildrenRepo childrenRepo;

     public List<AkshayChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public AkshayChildren save(AkshayChildren children) {
          return childrenRepo.save(children);

     }

     public List<AkshayChildren> sortedPage(int offset, int pagesize, String field) {
          Page<AkshayChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<AkshayChildren> pagination(int offset, int pagesize) {
          Page<AkshayChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
