package student;

public class Student extends Person{

    private int course;

    public Student(String name, int age, int course) {
        super(name, age);
        this.course=course;
    }
}
