package com.inkhyang.pet.repository;

import com.inkhyang.pet.domain.student.Student;

import java.util.*;

public class StudentRepository {
    private final Map<UUID, Student> students = new HashMap<>();

    private Student findById(UUID id) {
        return students.get(id);
    }

    private List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    private Student save(Student student) {
        return students.put(student.getId(), student);
    }

    private void remove(Student student) {
        students.remove(student.getId());
    }
}
