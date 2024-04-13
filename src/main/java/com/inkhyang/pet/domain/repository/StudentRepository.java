package com.inkhyang.pet.domain.repository;

import com.inkhyang.pet.domain.Discipline;
import com.inkhyang.pet.domain.Score;
import com.inkhyang.pet.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    Optional<Student> findById(Student.StudentId id);
    List<Student> findAll();
    Student save(Student student);
    void delete(Student.StudentId id);
    void update(Student.StudentId id, Discipline discipline, Score score);
}
