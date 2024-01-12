package com.inkhyang.pet;

import com.inkhyang.pet.domain.classroom.Facult;
import com.inkhyang.pet.domain.classroom.Student;

public class UniversityApp {
    public static void main(String[] args) {
        Facult facult =  new Facult("IT");
        Student group = new Student("it-2");
        com.inkhyang.pet.domain.student.Student student1 = new com.inkhyang.pet.domain.student.Student("Avtobot", "wqe");
        group.addStudent(student1);
        facult.addGroup(group);
    }
}
