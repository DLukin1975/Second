package Lesson4Task2;

public abstract class Car {
    protected String markAuto;
    protected String classAuto;
    protected Engine engine;

    public Car(String markAuto, String classAuto, Engine engine) {
        this.markAuto = markAuto;
        this.classAuto = classAuto;
        this.engine = engine;
    }

    protected abstract void start();

    protected abstract void stop();

    protected abstract void printinfo();

    void turnleft() {
        System.out.println("Поворот налево");
    }

    void turnright() {
        System.out.println("Поворот направо");
    }
}
