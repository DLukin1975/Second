import java.util.Arrays;
import java.util.Scanner;

public class Lesson2task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] code = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] code2 = Arrays.copyOf(code, code.length);
        int i;
        int j = 0;
        for (i = 0; i < code.length; i++) {
            if (code[i] != 0) {
                code2[j] = code[i];
                j++;
            } else {
                code2[(code.length - 1 - i) + j] = 0;
                code2[j] = code[i];
            }
        }
        System.out.println("Исходный массив");
        for (i = 0; i < code.length; i++) {
            System.out.print(code[i] + " ");
        }
        //System.out.println ("");
        System.out.println("Массив со смещенными в конец нулями");
        for (i = 0; i < code2.length; i++) {
            System.out.print(code2[i] + " ");
        }
    }
}