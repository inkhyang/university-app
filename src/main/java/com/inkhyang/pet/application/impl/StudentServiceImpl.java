package com.inkhyang.pet.application.impl;


import com.inkhyang.pet.application.StudentService;
import com.inkhyang.pet.domain.repository.impl.StudentRepositoryImpl;
import com.inkhyang.pet.domain.Discipline;
import com.inkhyang.pet.domain.Score;
import com.inkhyang.pet.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepositoryImpl studentRepository;

    public StudentServiceImpl(StudentRepositoryImpl studentRepository) {
        this.studentRepository = studentRepository;
    }


    public Optional<Student> getById(Student.StudentId id) {
        return studentRepository.findById(id);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public void remove(Student.StudentId id) {
        studentRepository.delete(id);
    }

    public void update(Student.StudentId id, String discipline, Integer score) {
        studentRepository.update(id, Discipline.valueOf(discipline), Score.valueOf(score));
    }

    public double averageMarkById(Student.StudentId id) {
        return studentRepository.findById(id).stream()
                .flatMap(s -> s.getMarks().stream())
                .map(mark -> mark.getScore().getValue())
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}
