package Lesson3_Animal;

public class Horse extends Animal {
    String horseType;

    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    public void makeNoise() {
        System.out.println("конь " + name + " шумит в location " + location);
    }

    public void eat() {
        System.out.println("конь " + name + " ест еду - " + food);
    }
}

