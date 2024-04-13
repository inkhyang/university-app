package com.inkhyang.pet.domain;

import java.util.List;

public class Student {
    private StudentId id;
    private String email;
    private String firstName;

    private String lastName;

    private List<Mark> marks;

    public record StudentId(String email) {

    }

    public Student(String email, String firstName, String lastName, List<Mark> marks) {
        this.id = new StudentId(email);
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public StudentId getId() {
        return id;
    }

    public void setId(StudentId id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void addMark(Mark mark) {
        marks.add(mark);
    }
}
