package Lesson3_Animal;

public class Dog extends Animal {
    String dogType;

    public Dog(String name, String food, String location) {
        super(name, food, location);
    }

    public void makeNoise() {
        System.out.println("пёс " + name + " шумит в location " + location);
    }

    public void eat() {
        System.out.println("пёс " + name + " ест еду - " + food);
    }
}

