package Lesson5Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CharactiristicCreate[] specification = new CharactiristicCreate[10];
        TwoMonitorStrategy strategy = new TwoMonitorStrategy();
        strategy.createSpecification(specification);

        Context strategy2 = new Context();
        strategy2.setStrategyCreateSpecification(new TwoMonitorStrategy());
        strategy2.getSpecification(specification);
        System.out.println("Результат: " + specification[0]);
        System.out.println("Результат: " + specification[1]);
    }
}