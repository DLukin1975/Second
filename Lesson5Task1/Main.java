package Lesson5Task1;

import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        System.out.println("Как будем логировать (Db/File/Console)?");
        Scanner in = new Scanner(System.in);
        LogType logName = null;

        try {
            logName = LogType.valueOf(in.nextLine());
        } catch (Exception e) {
            System.out.println("Нет такого типа логирования");
            System.exit(0);
        }

        Logger log = null;

        switch (logName) {
            case Db:
                log = new DbLogger();
                break;
            case File:
                log = new FileLogger();
                break;
            case Console:
                log = new ConsoleLogger();
                break;
            default:
        }

        System.out.println("Введите первое значение");
        double x = in.nextInt();
        System.out.println("Введите второе значение");
        double y = in.nextInt();

        Calc calc = new Calc();
        double z = calc.multiplication(x, y, log);
    }
}