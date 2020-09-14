package Lesson4Task2;

public abstract class Car {
    public String markAuto;
    public String classAuto;
    public Engine engine;
    public Car (String markAuto, String classAuto, Engine engine) {
        this.markAuto = markAuto;
        this.classAuto = classAuto;
        this.engine = engine;
    }
    abstract void start();
    abstract void stop();
    abstract void printinfo();
    void turnleft () {
        System.out.println("Поворот налево");
    }
    void turnright () {
        System.out.println("Поворот направо");
    }
}
