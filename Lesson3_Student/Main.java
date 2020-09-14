package Lesson3_Student;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student[] student = {new Student("Dmitriy", "Student", "604", 4.8d),
                new Student("Nicolay", "Student", "604", 5d),
                new Aspirant("Dmitriy", "Aspirant", "604", 4.8d),
                new Aspirant("Sasha", "Aspirant", "604", 5d)};
        int i;
        for (i = 0; i < student.length; i++) {
            System.out.println("У " + student[i].firstName + "." + student[i].lastName +
                    " средняя оценка " + student[i].averageMark +
                    " стипендия " + student[i].getScholarship());
        }

    }
}