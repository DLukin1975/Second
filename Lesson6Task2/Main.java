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
        System.out.println("Вес первой коробки - " + box1.getWeight());
        System.out.println("Вес второй коробки - " + box2.getWeight());
        System.out.println("Вес коробок равен? " + box1.Compare(box2));
        System.out.println("Пересыпаем первую коробку во вторую");
        box2.reload(box1);
        System.out.println("Вес второй коробки - " + box2.getWeight());
    }
}
