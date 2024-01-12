package com.inkhyang.pet.domain.student;

import com.inkhyang.pet.domain.journal.Mark;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {
    private String firstName;
    private String lastName;
    private List<Mark> marks;

    private UUID id;

    public Student(String firstName, String lastName, List<Mark> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
        this.id = UUID.randomUUID();
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = new ArrayList<>();
        this.id = UUID.randomUUID();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UUID getId() {
        return id;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void addMark(Mark mark){
        marks.add(mark);
    }
}
