package Lesson4Task1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(10, 10);
        shape[1] = new Circle(10);
        shape[2] = new Rectangle(10, 3);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}