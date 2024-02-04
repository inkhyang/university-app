package com.inkhyang.pet.infrastructure.persistance;

import com.inkhyang.pet.infrastructure.persistance.classroom.entity.FacultEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FacultEntityRepository extends JpaRepository<FacultEntity, UUID> {
    Optional<FacultEntity> findByName(String name);
}
