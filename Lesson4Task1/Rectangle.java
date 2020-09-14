package Lesson4Task1;

public class Rectangle implements Shape {
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double square() {
        return this.x * this.y;
    }
}
