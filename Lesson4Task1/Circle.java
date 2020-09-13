package Lesson4Task1;

public class Circle implements Shape {
    private  double r;
    public  Circle (double r) {
        this.r = r;
    }
    @Override
    public double square() {
        return this.r*PI/2;
    }
}
