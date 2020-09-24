package Lesson6Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box();

        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.Compare(box2));

        box2.reload(box1);
        System.out.println(box2.getWeight());
    }
}
