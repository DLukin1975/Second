package Lesson5Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как будем логировать (Db/File/Console)");
        Scanner in = new Scanner(System.in);
        LogType logName;
        logName = LogType.valueOf(in.nextLine());

        try { logName = LogType.valueOf(in.nextLine());
        } catch (Exception e) {
            System.out.println("Нет такого типа логирования");
            System.exit(0);
        }
        //System.out.println(char(logName));
        Logger log = null;
        switch (logName) {
            case Db: log = new DbLogger();
            break;
            case File: log = new FileLogger();
            break;
            case Console: log = new ConsoleLogger();
            break;
            default:
        }
        double x = 40d;
        double y = 5;
        //Logger log = new DbLogger();
        Calc calc = new Calc();
        double z = calc.addition(x, y, log);
    }
}