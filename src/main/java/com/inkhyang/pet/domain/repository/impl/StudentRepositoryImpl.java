package com.inkhyang.pet.domain.repository.impl;

import com.inkhyang.pet.domain.repository.StudentRepository;
import com.inkhyang.pet.domain.student.Discipline;
import com.inkhyang.pet.domain.student.Mark;
import com.inkhyang.pet.domain.student.Score;
import com.inkhyang.pet.domain.student.Student;
import com.inkhyang.pet.infrastructure.persistence.StudentEntityRepository;
import com.inkhyang.pet.infrastructure.persistence.student.entity.StudentEntity;
import com.inkhyang.pet.infrastructure.persistence.student.mapper.MarkEntityMapper;
import com.inkhyang.pet.infrastructure.persistence.student.mapper.StudentEntityMapper;

import java.util.*;

public class StudentRepositoryImpl implements StudentRepository {
    private final StudentEntityRepository studentEntityRepository;
    private final StudentEntityMapper studentMapper;
    private final MarkEntityMapper markMapper;

    public StudentRepositoryImpl(StudentEntityRepository studentEntityRepository, StudentEntityMapper studentMapper, MarkEntityMapper markMapper) {
        this.studentEntityRepository = studentEntityRepository;
        this.studentMapper = studentMapper;
        this.markMapper = markMapper;
    }

    public Optional<Student> findById(Student.StudentId id){
        return studentEntityRepository.findByEmail(id.email())
                .map(studentMapper::toDomain);
    }
    public List<Student> findAll(){
        return studentEntityRepository.findAll()
                .stream().map(studentMapper::toDomain)
                .toList();
    }
    public Student save(Student student){
        StudentEntity studentEntity = studentEntityRepository.save(studentMapper.toEntity(student));
        return studentMapper.toDomain(studentEntity);
    }
    public void delete(Student.StudentId id){
        studentEntityRepository.findByEmail(id.email())
                .ifPresent(studentEntityRepository::delete);
    }

    public void update(Student.StudentId id, Discipline discipline, Score score){
        studentEntityRepository.findByEmail(id.email())
                .ifPresent(studentEntity -> {
                    var markEntity = markMapper.toEntity(
                            new Mark(discipline, score)
                    );
                    markEntity.setStudent(studentEntity);
                    studentEntity.getMarks().add(markEntity);
                    studentEntityRepository.save(studentEntity);
                });
    }
}
