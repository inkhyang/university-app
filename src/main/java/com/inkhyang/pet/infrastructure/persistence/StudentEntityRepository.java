package com.inkhyang.pet.infrastructure.persistence;

import com.inkhyang.pet.infrastructure.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface StudentEntityRepository extends JpaRepository<StudentEntity, UUID> {
    Optional<StudentEntity> findByEmail(String email);
}