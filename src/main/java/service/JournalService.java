package service;


import journal.Mark;
import student.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JournalService {
//list of students,
    private Map<Student, Map<Date, Mark>> journal;

    public JournalService() {
        journal =  new HashMap<>();
    }

    public Map<Student, Map<Date, Mark>> getJournal() {
        return journal;
    }
    public Map<Date, Mark> getJournalByStudent(Student student){
        return journal.get(student);

    }
    public void editMarks(Student student, Date date, Mark mark){
        journal.get(student).put(date, mark);
    }
    public void addStudent(Student student){
        journal.put(student, new HashMap<>());
    }

    public String studentList(){
        StringBuilder str = new StringBuilder("Students: ");
        for(Student student: journal.keySet()){
            str.append("\n" + student.getName());
        }
        return str.toString();
    }
}
