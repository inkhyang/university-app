package com.inkhyang.pet.application;

import com.inkhyang.pet.domain.Group;

import java.util.List;
import java.util.Optional;

public interface GroupService {
    Optional<Group> getById(Group.GroupId id);
    List<Group> getAll();
    Group create(Group group);
    void remove(Group.GroupId id);
}
