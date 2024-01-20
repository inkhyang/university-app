package com.inkhyang.pet.repository;

import com.inkhyang.pet.domain.student.Student;

import java.util.*;

public class StudentRepository {
    private final Map<UUID, Student> students = new HashMap<>();

    public Student findById(UUID id) {
        return students.get(id);
    }

    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        return students.put(student.getId(), student);
    }

    public void remove(Student student) {
        students.remove(student.getId());
    }
}
