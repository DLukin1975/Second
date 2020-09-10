package Lesson3_Animal;

public class Main {
    public void main(String[] args) {
        Animal animal = new Animal("Bear","Малина","Сибирь");
        Animal animal2 = new Animal("Egle","кролик","степь");
        System.out.println(animal.name);
        System.out.println(animal2.name);
        animal.sleep();
        animal.eat();
        animal.makeNoise();
        Animal[] animalsQueue = {new Animal("Bear","Малина","Сибирь"),new Dog("Шарик", "мясо", "конура")};
     //   animalsQueue[0] = new Animal("Bear","Малина","Сибирь");
     //   animalsQueue[1] = new Dog("Шарик", "мясо", "конура");
      //  animalsQueue[2] = new Cat("Барсик", "рыбка", "диван");
     //   animalsQueue[3] = new Horse("Холстомер","сено", "конюшня");
    }
}