package com.inkhyang.pet;

import com.inkhyang.pet.domain.classroom.Facult;
import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.domain.student.Student;

public class UniversityApp {
    public static void main(String[] args) {
        Facult facult =  new Facult("IT");
        Group group = new Group("it-2");
        Student student1 = new Student("Avtobot", "wqe");
        group.addStudent(student1);
        facult.addGroup(group);
    }
}
