package Lesson5Task1;

public class Main {
    public static void main(String[] args) {
        double x = 40d;
        double y = 5;
        Logger log = new DbLogger();
        Calc calc = new Calc();
        double z = calc.addition(x, y, log);
    }
}