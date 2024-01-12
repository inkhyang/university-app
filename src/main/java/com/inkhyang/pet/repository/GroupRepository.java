package com.inkhyang.pet.repository;

import com.inkhyang.pet.domain.classroom.Group;

import java.util.*;

public class GroupRepository {
    private final Map<UUID, Group> groups = new HashMap<>();

    private Group findById(UUID id) {
        return groups.get(id);
    }

    private List<Group> findAll(){
        return new ArrayList<>(groups.values());
    }

    private Group save(Group group) {
        return groups.put(group.getId(), group);
    }

    private void remove(Group group) {
        groups.remove(group.getId());
    }
}
