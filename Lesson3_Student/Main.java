package Lesson3_Student;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student[] student = {new Student("Dmitriy", "Student", "604", 5d),
                              new Aspirant("Dmitriy", "Aspirant", "604", 5d)};
        int i;
        for (i=0;i< student.length;i++) {
            System.out.println(student[i].getScholarship());
        }

    }
}