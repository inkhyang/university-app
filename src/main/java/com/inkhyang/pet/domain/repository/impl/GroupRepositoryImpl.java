package com.inkhyang.pet.domain.repository.impl;

import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.domain.repository.GroupRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupRepositoryImpl implements GroupRepository {
    private final Map<Group.GroupId, Group> groups = new HashMap<>();

    public Group findById(Group.GroupId id) {
        return groups.get(id);
    }

    public List<Group> findAll() {
        return new ArrayList<>(groups.values());
    }

    public Group save(Group group) {
        return groups.put(group.getId(), group);
    }

    public void remove(Group.GroupId id) {
        groups.remove(id);
    }
}
