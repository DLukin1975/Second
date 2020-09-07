import java.util.Scanner;

public class Lesson2_task4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите целое число");
        int A = in.nextInt();
        if (A > 0) {
            A=++A;
        }
        else if (A<0) {
            A=A-2;
        }
        else A=10;
        System.out.print(A);
    }
}