package com.examly.class_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.AkshayPerson;

/**
 * PersonRepo
 */
@Repository
public interface AkshayPersonRepo extends JpaRepository<AkshayPerson, Integer> {

     List<AkshayPerson> findByAge(int byAge);
}