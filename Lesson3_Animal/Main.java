package Lesson3_Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Bear","Малина","Сибирь");
        Animal animal2 = new Animal("Egle","кролик","степь");
        System.out.println(animal.name);
        System.out.println(animal2.name);
        animal.sleep();
        animal.eat();
        animal.makeNoise();
    }
}