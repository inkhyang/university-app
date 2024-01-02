
import journal.Journal;
import journal.Mark;
import student.Student;

import java.util.Calendar;
import java.util.Date;

public class UniversityApp {
    public static void main(String[] args) {
        Student student = new Student("Arg", 21, 3);
        Student student2 = new Student("Argas", 221, 33);
        Journal journal = new Journal();
        Date date =  new Date(2050, Calendar.NOVEMBER, 1);
        journal.addStudent(student);
        journal.addStudent(student2);
        journal.editMarks(student, date, Mark.A);
        journal.editMarks(student2, date, Mark.F);
        System.out.println(journal.studentList());

    }
}
