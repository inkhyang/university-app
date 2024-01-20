package com.inkhyang.pet.service;


import com.inkhyang.pet.domain.student.Student;
import com.inkhyang.pet.repository.StudentRepository;

import java.util.List;
import java.util.UUID;

public class StudentService {
    private final StudentRepository studentRepository = new StudentRepository();


    public Student getById(UUID id){
        return studentRepository.findById(id);
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Student add(Student student){
        return studentRepository.save(student);
    }
    public void remove(Student student){
        studentRepository.remove(student);
    }

}
