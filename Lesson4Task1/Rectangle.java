package Lesson4Task1;

public class Rectangle implements  Shape {
    private double x;

//    private int x;

    public Rectangle (double x) {
       this.x = x;
    }
    @Override
    public double square() {
        //int x = this.x;
        return this.x;
    }
}
