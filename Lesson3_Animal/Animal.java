package Lesson3_Animal;

public class Animal {

    public String name;
    public String food;
    public String location;
    private int Age;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println(name + " шумит в location " + location);
    }

    public void eat() {
        System.out.println(name + " ест еду - " + food);
    }

    public void sleep() {
        System.out.println(name + " спит");
    }
}


