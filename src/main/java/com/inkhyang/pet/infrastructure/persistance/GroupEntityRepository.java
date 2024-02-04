package com.inkhyang.pet.infrastructure.persistance;

import com.inkhyang.pet.infrastructure.persistance.classroom.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface GroupEntityRepository extends JpaRepository<GroupEntity, UUID> {
    Optional<GroupEntity> findByName(String name);
}
