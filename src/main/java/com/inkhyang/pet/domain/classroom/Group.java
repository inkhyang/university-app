package com.inkhyang.pet.domain.classroom;

import com.inkhyang.pet.domain.student.Student;

import java.util.List;


public class Group {

    private GroupId id;
    private String name;
    private List<Student> students;

    public record GroupId(String name){

    }
    public Group(String name, List<Student> students) {
        this.id = new GroupId(name);
        this.name = name;
        this.students = students;
    }

    public GroupId getId() {
        return id;
    }

    public void setId(GroupId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}
