package Lesson3_Animal;

public class Cat extends Animal {
    String catType;

    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    public void makeNoise() {
        System.out.println("кот " + name + " шумит в location " + location);
    }

    public void eat() {
        System.out.println("кот " + name + " ест еду - " + food);
    }
}
