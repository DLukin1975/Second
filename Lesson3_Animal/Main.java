package Lesson3_Animal;

public class Main {

    public static void main(String[] args) {

        DrDullitle drDullitle = new DrDullitle();
        Animal[] animalsQueue = {new Animal("Bear", "Малина", "Сибирь")
                , new Dog("Шарик", "мясо", "конура")
                , new Cat("Барсик", "рыбка", "квартира")
                , new Horse("Холстомер", "сено", "конюшня")
        };
        for (Animal animal : animalsQueue) {
            drDullitle.treatAnimal(animal);
        }
    }
}