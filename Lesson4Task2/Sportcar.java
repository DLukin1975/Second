package Lesson4Task2;

public class Sportcar extends  Car  {
    public Sportcar (String markAuto, String classAuto, Engine engine) {
        super(markAuto, classAuto, engine);
        }
@Override
public void start () {
        System.out.println("Спорткар поехал");
        }

@Override
public void stop () {
        System.out.println("Спорткар остановился");
        }
@Override
public void printinfo () {
        String markAuto = super.markAuto;
        String classAuto = super.classAuto;
        Engine engine = super.engine;
        System.out.println("Марка " + markAuto);
        System.out.println("Класс " + classAuto);
        System.out.println ("Производитель двигателя" + engine.produser);
        System.out.println ("Мощность двигателя" + engine.power);
        }
        }