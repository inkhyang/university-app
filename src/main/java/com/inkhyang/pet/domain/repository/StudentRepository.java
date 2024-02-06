package com.inkhyang.pet.domain.repository;

import com.inkhyang.pet.domain.student.Discipline;
import com.inkhyang.pet.domain.student.Score;
import com.inkhyang.pet.domain.student.Student;

import java.util.List;

public interface StudentRepository {
    Student findById(Student.StudentId id);
    List<Student> findAll();
    Student save(Student student);
    void delete(Student.StudentId id);
    void update(Student.StudentId id, Discipline discipline, Score score);
}
