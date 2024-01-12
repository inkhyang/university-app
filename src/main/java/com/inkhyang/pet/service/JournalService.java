package com.inkhyang.pet.service;


import com.inkhyang.pet.domain.journal.Marks;
import com.inkhyang.pet.domain.student.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JournalService {
//list of students,
    private Map<Student, Map<Date, Marks>> journalService;

    public JournalService() {
        journalService =  new HashMap<>();
    }

    public Map<Student, Map<Date, Marks>> getJournalService() {
        return journalService;
    }
    public Map<Date, Marks> getJournalByStudent(Student student){
        return journalService.get(student);

    }
    public void editMarks(Student student, Date date, Marks marks){
        journalService.get(student).put(date, marks);
    }
    public void addStudent(Student student){
        journalService.put(student, new HashMap<>());
    }

    public String studentList(){
        StringBuilder str = new StringBuilder("Students: ");
        for(Student student: journalService.keySet()){
            str.append("\n" + student.getFirstName() + " " + student.getLastName());
        }
        return str.toString();
    }
}
