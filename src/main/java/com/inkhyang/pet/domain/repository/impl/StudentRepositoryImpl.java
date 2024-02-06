package com.inkhyang.pet.domain.repository.impl;

import com.inkhyang.pet.domain.repository.StudentRepository;
import com.inkhyang.pet.domain.student.Discipline;
import com.inkhyang.pet.domain.student.Mark;
import com.inkhyang.pet.domain.student.Score;
import com.inkhyang.pet.domain.student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository {
    private final Map<Student.StudentId, Student> students = new HashMap<>();

    public Student findById(Student.StudentId id){
        return students.get(id);
    }
    public List<Student> findAll(){
        return new ArrayList<>(students.values());
    }
    public Student save(Student student){
        return students.put(student.getId(), student);
    }
    public void delete(Student.StudentId id){
        students.remove(id);
    }

    public void update(Student.StudentId id, Discipline discipline, Score score){
        students.get(id).getMarks().add(new Mark(discipline, score));
    }
}
