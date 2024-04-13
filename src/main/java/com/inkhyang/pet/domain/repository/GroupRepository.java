package com.inkhyang.pet.domain.repository;

import com.inkhyang.pet.domain.Group;

import java.util.List;
import java.util.Optional;

public interface GroupRepository {
    Optional<Group> findById(Group.GroupId id);
    List<Group> findAll();
    Group save(Group group);
    void remove(Group.GroupId id);
}
