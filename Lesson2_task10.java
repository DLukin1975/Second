import java.util.Scanner;

public class Lesson2_task10 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int Code[] = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int Code2[] = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int i = 0;
        int j = 0;
        for (i=0;i<Code.length;i++) {
            if (Code[i] != 0) {
                //j=j+1;
                Code2[j] = Code[i];
                //j=j+1;
                System.out.print(Code[i] + " ");
                System.out.println(j);
                j=j+1;
            }
            else {
                Code2[Code.length-1-i+j] = 0;
                Code2[j] = Code[i];
            };
        };
        System.out.println ("Исходный массив");
        for (i=0;i<Code.length;i++) {
            System.out.print(Code[i] + " ");
        };
        System.out.println ("");
        System.out.println ("Массив со смещенными в конец нулями");
        for (i=0;i<Code2.length;i++) {
            System.out.print(Code2[i] + " ");
        };

    }
}