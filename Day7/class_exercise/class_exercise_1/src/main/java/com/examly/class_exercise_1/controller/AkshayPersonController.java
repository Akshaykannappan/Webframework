package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.AkshayPerson;
import com.examly.class_exercise_1.service.PersonService;

@RestController
public class AkshayPersonController {

     @Autowired
     public PersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<AkshayPerson> postMethodName(@RequestBody AkshayPerson entity) {

          AkshayPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<AkshayPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<AkshayPerson>> getMethodName() {

          List<AkshayPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AkshayPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AkshayPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<AkshayPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}