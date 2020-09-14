package Lesson4Task1;

public class Triangle implements Shape {
    private double h;
    private double a;

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double square() {
        return this.a * this.h / 2;
    }
}
