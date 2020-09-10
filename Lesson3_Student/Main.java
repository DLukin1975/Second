package Lesson3_Student;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dmitriy", "L", "604", 5d);
        System.out.println(student.getScholarship());
    }
}