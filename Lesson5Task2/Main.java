package Lesson5Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CharactiristicCreate[] specification = new CharactiristicCreate[10];
        Context strategy = new Context();
        strategy.setStrategyCreateSpecification(new TwoMonitorStrategy());
        strategy.getSpecification(specification);
        System.out.println("Результат: " + specification[0]);
        System.out.println("Результат: " + specification[1]);
    }
}