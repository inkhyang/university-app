package com.inkhyang.pet.application;

import com.inkhyang.pet.domain.student.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Optional<Student> getById(Student.StudentId id);
    List<Student> getAll();
    Student create(Student student);
    void remove(Student.StudentId id);
    void update(Student.StudentId id, String discipline, Integer score);
    double averageMarkById(Student.StudentId id);
}
