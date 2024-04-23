package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.AkshayStudent;
import java.util.List;

@Repository
public interface AkshayStudentRepo extends JpaRepository<AkshayStudent, Long> {

    List<AkshayStudent> findByMarksGreaterThan(int mark);

    List<AkshayStudent> findByMarksLessThan(int mark);

}
