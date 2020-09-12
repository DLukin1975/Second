import java.util.Arrays;
import java.util.Scanner;

public class Lesson2task9 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[] code = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int[] codeDesc = Arrays.copyOf(code,code.length);
        int i;

        for (i=0;i<code.length;i++) {
            codeDesc[code.length-1-i] = code[i];
        }
        System.out.println ("Массив в прямом порядке");
        for (i=0;i<code.length;i++) {
            System.out.print(code[i] + " ");
        }

        System.out.println ("Массив в обратном порядке");
        for (i=0;i<codeDesc.length;i++) {
            System.out.print(codeDesc[i] + " ");
        }

    }
}