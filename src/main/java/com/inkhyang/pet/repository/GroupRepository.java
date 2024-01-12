package com.inkhyang.pet.repository;

import com.inkhyang.pet.domain.classroom.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GroupRepository {
    private final Map<UUID, Student> groups = new HashMap<>();

    private Student findByID(UUID id) {
        return groups.get(id);
    }

    private Student save(Student group) {
        return groups.put(group.getId(), group);
    }

    private void remove(Student group) {
        groups.remove(group.getId());
    }
}
