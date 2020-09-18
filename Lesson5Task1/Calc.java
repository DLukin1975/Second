package Lesson5Task1;

public class Calc {

    public double addition(double x, double y, Logger log) {

        log.log("Результат сложения - " + (x + y));
        return x + y;
    }

    public double substruction(double x, double y, Logger log) {

        log.log("Результат вычитания - " + (x - y));
        return x - y;
    }

    public double multiplication(double x, double y, Logger log) {

        log.log("Результат умножения - " + x * y);
        return x * y;
    }

    public double division(double x, double y, Logger log) {

        log.log("Результат деления - " + x / y);
        return x / y;
    }
}
