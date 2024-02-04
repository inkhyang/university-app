package com.inkhyang.pet.infrastructure.persistance;

import com.inkhyang.pet.infrastructure.persistance.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface StudentEntityRepository extends JpaRepository<StudentEntity, UUID> {
    Optional<StudentEntity> findByEmail(String email);
}
