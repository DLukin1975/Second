package Lesson3_Student;

public class Aspirant extends Student {
    protected String aspirantWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String aspirantWork) {
        super(firstName, lastName, group, averageMark);
        this.aspirantWork = aspirantWork;
    }

    public double getScholarship() {
        if (averageMark == 5d) {
            shcolarship = 200d;
        } else {
            shcolarship = 180d;
        }
        return shcolarship;
    }
}
