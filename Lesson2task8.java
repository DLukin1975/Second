import java.util.Scanner;

public class Lesson2task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] code = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int i;
        int max = code[0];
        int sumPositiv = 0;
        int numPositiv = 0;
        int sumEvenNegativ = 0;
        int sumNegativ = 0;
        int numNegativ = 0;
        for (i = 0; i < code.length; i++) {
            if (code[i] > max) {
                max = code[i];
            }
            if (code[i] > 0) {
                sumPositiv = sumPositiv + code[i];
                numPositiv = numPositiv + 1;
            }
            if (code[i] < 0 & code[i] % 2 == 0) {
                sumEvenNegativ = sumEvenNegativ + code[i];
            }
            if (code[i] < 0) {
                sumNegativ = sumNegativ + code[i];
                numNegativ = numNegativ + 1;
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма положительных значений: " + sumPositiv);
        System.out.println("Сумма четных отрицательных значений: " + sumEvenNegativ);
        System.out.println("Количество положительных значений: " + numPositiv);
        System.out.println("Среднее арифметическое отрицательных значений: " + (float) sumNegativ / numNegativ);
    }
}