package Lesson5Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CharactiristicCreate[] specification = new CharactiristicCreate[]{};
        TwoMonitorStrategy strategy = new TwoMonitorStrategy();
        strategy.twoMonitorStrategy(specification);
        System.out.println(Arrays.toString(specification));
    }
}