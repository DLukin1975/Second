package Lesson3_Student;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dmitriy", "Student", "604", 5d);
        System.out.println(student.getScholarship());
        Student aspirant = new Aspirant("Dmitriy", "Aspirant", "604", 5d);
        System.out.println(aspirant.getScholarship());
        Student[] student1 = {new Student("Dmitriy", "Student", "604", 5d),
                              new Aspirant("Dmitriy", "Aspirant", "604", 5d)};

    }
}