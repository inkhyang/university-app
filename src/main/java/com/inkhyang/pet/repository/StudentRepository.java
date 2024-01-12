package com.inkhyang.pet.repository;

import com.inkhyang.pet.domain.classroom.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class StudentRepository {
    private final Map<UUID, Student> students = new HashMap<>();

    private Student findByID(UUID id) {
        return students.get(id);
    }

    private Student save(Student student) {
        return students.put(student.getId(), student);
    }

    private void remove(Student student) {
        students.remove(student.getId());
    }
}
