
import service.JournalService;
import journal.Mark;
import student.Student;

import java.util.Calendar;
import java.util.Date;

public class UniversityApp {
    public static void main(String[] args) {
        Student student = new Student("Arg", 21, 3);
        Student student2 = new Student("Argas", 221, 33);
        JournalService journalService = new JournalService();
        Date date =  new Date(2050, Calendar.NOVEMBER, 1);
        journalService.addStudent(student);
        journalService.addStudent(student2);
        journalService.editMarks(student, date, Mark.A);
        journalService.editMarks(student2, date, Mark.F);
        System.out.println(journalService.studentList());
        System.out.println(journalService.getJournalByStudent(student2).get(date));

    }
}
