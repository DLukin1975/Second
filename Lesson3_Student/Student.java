package Lesson3_Student;

public class Student {
    protected double averageMark;
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double shcolarship;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {

        if (averageMark == 5d) {
            shcolarship = 100d;
        } else {
            shcolarship = 80d;
        }
        return shcolarship;
    }
}
