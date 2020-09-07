import java.util.Scanner;

public class Lesson2_task9 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int Code[] = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int CodeDesc[] = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int i = 0;

        for (i=0;i<Code.length;i++) {
            CodeDesc[Code.length-1-i] = Code[i];
        };
        System.out.println ("Массив в прямом порядке");
        for (i=0;i<Code.length;i++) {
            System.out.print(Code[i] + " ");
        };
        System.out.println ("");
        System.out.println ("Массив в обратном порядке");
        for (i=0;i<CodeDesc.length;i++) {
            System.out.print(CodeDesc[i] + " ");
        };

    }
}