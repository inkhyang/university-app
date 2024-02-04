package com.inkhyang.pet.application;


import com.inkhyang.pet.domain.student.Discipline;
import com.inkhyang.pet.domain.student.Mark;
import com.inkhyang.pet.domain.student.Score;
import com.inkhyang.pet.domain.student.Student;
import com.inkhyang.pet.infrastructure.persistance.StudentEntityRepository;
import com.inkhyang.pet.infrastructure.persistance.student.entity.StudentEntity;
import com.inkhyang.pet.infrastructure.persistance.student.mapper.MarkEntityMapper;
import com.inkhyang.pet.infrastructure.persistance.student.mapper.StudentEntityMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentEntityRepository studentEntityRepository;
    private final StudentEntityMapper studentMapper;

    private final MarkEntityMapper markMapper;

    public StudentService(StudentEntityRepository studentEntityRepository, StudentEntityMapper studentMapper, MarkEntityMapper markMapper) {
        this.studentEntityRepository = studentEntityRepository;
        this.studentMapper = studentMapper;
        this.markMapper = markMapper;
    }


    public Optional<Student> getById(Student.StudentId id) {
        return studentEntityRepository.findByEmail(id.email())
                .map(studentMapper::toDomain);
    }

    public List<Student> getAll() {
        return studentEntityRepository.findAll().stream()
                .map(studentMapper::toDomain)
                .toList();
    }

    public Student create(Student student) {
        StudentEntity studentEntity = studentEntityRepository.save(studentMapper.toEntity(student));
        return studentMapper.toDomain(studentEntity);
    }

    public void remove(Student.StudentId id) {
        studentEntityRepository.findByEmail(id.email())
                .ifPresent(studentEntityRepository::delete);
    }

    public void update(Student.StudentId id, String discipline, Integer score) {
        studentEntityRepository.findByEmail(id.email())
                .ifPresent(studentEntity -> {
                    var markEntity = markMapper.toEntity(
                            new Mark(Discipline.valueOf(discipline), Score.valueOf(score))
                    );
                    markEntity.setStudent(studentEntity);
                    studentEntity.getMarks().add(markEntity);
                    studentEntityRepository.save(studentEntity);
                });
    }
}
