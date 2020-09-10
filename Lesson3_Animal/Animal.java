package Lesson3_Animal;

public class Animal {
    public Animal(String Name) {
        this.name = Name;
    }
    String name ;
    String food;
    String location;
    int Age;

    public void makeNoise(){
        System.out.println("Шумит в location " + location);
    }

    public void eat(){
        System.out.println("Ест еду - " + food);
    }

    public void sleep(){
        System.out.println(name + " спит");
    }
}
