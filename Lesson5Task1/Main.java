package Lesson5Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как будем логировать (Db/File/Console)?");
        Scanner in = new Scanner(System.in);
        LogType logName = null;

        try {
            logName = LogType.valueOf(in.nextLine());
        } catch (Exception e) {
            System.out.println("Нет такого типа логирования");
            System.exit(0);
        }

        LoggerFactory loggerFactory = null;

        switch (logName) {
            case Db:
                loggerFactory = new DbLoggerFactory();
                break;
            case File:
                loggerFactory = new FileLoggerFactory();
                break;
            case Console:
                loggerFactory = new ConsoleLoggerFactory();
                break;
            default:
        }
        Logger log = loggerFactory.createLog();
        System.out.println("Введите первое значение");
        double x = in.nextInt();
        System.out.println("Введите второе значение");
        double y = in.nextInt();

        Calc calc = new Calc();
        double z = calc.multiplication(x, y, log);
    }
}