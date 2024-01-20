package com.inkhyang.pet.repository;

import com.inkhyang.pet.domain.classroom.Group;

import java.util.*;

public class GroupRepository {
    private final Map<UUID, Group> groups = new HashMap<>();

    public Group findById(UUID id) {
        return groups.get(id);
    }

    public List<Group> findAll(){
        return new ArrayList<>(groups.values());
    }

    public Group save(Group group) {
        return groups.put(group.getId(), group);
    }

    public void remove(Group group) {
        groups.remove(group.getId());
    }
}
