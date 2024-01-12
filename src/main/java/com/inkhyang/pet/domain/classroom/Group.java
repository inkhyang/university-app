package com.inkhyang.pet.domain.classroom;

import com.inkhyang.pet.domain.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {
    private String name;
    private List<Student> students;

    private UUID id;

    public Group(String name, List<com.inkhyang.pet.domain.student.Student> students) {
        this.name = name;
        this.students = students;
        this.id = UUID.randomUUID();
    }

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public List<com.inkhyang.pet.domain.student.Student> getStudents() {
        return students;
    }

    public UUID getId() {
        return id;
    }

    public void addStudent(com.inkhyang.pet.domain.student.Student student){
        students.add(student);
    }
     public void removeStudent(com.inkhyang.pet.domain.student.Student student){
        students.remove(student);
     }
}
