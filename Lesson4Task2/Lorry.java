package Lesson4Task2;

public class Lorry extends Car {
    final Integer carring;

    public Lorry(String markAuto, String classAuto, Engine engine, Integer carring) {
        super(markAuto, classAuto, engine);
        this.carring = carring;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printinfo() {
        String markAuto = this.markAuto;
        String classAuto = this.classAuto;
        Engine engine = this.engine;
        System.out.println("Марка " + markAuto);
        System.out.println("Класс " + classAuto);
        System.out.println("Производитель двигателя" + engine.produser);
        System.out.println("Мощность двигателя" + engine.power);
        System.out.println("Грузоподъемность" + carring);
    }
}
