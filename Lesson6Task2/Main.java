package Lesson6Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box();
        Apple apple = new Apple();

        System.out.println(apple.getWeightFruit());
        box1.addFruit(apple);
    //    box1.addFruit(new Apple());
        System.out.println(box1.getWeight());
    }
}
