package com.inkhyang.pet.domain.repository;

import com.inkhyang.pet.domain.classroom.Group;

import java.util.List;

public interface GroupRepository {
    Group findById(Group.GroupId id);
    List<Group> findAll();
    Group save(Group group);
    void remove(Group.GroupId id);
}
