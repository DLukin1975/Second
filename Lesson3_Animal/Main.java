package Lesson3_Animal;

public class Main {
    public static void main(String[] args) {
        int i;
        DrDullitle drDullitle = new DrDullitle();
        Animal[] animalsQueue = {new Animal("Bear","Малина","Сибирь")
                ,new Dog("Шарик", "мясо", "конура")
                ,new Cat("Барсик", "рыбка", "квартира")
                ,new Horse("Холстомер","сено", "конюшня")
        };
        for (i=0;i<animalsQueue.length;i++) {
            drDullitle.treatAnimal(animalsQueue[i]);
        }
    }
}