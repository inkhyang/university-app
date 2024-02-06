package com.inkhyang.pet.application;

import com.inkhyang.pet.domain.classroom.Group;

import java.util.List;
import java.util.Optional;

public interface GroupService {
    Optional<Group> getByName(String name);
    List<Group> getAll();
    Group create(Group group);
    void remove(Group.GroupId id);
}
