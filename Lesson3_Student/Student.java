package Lesson3_Student;

public class Student {
    public double averageMark;
    public String firstName;
    public String lastName;
    public String group;
    private double shcolarship;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
  //      double shcolarship;
        if (averageMark == 5d) {
            shcolarship = 100d;
        } else {
            shcolarship = 80d;
        }
        return shcolarship;
    }
}
