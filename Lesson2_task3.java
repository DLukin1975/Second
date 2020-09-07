import java.util.Scanner;

public class Lesson2_task3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите целое число");
        int A = in.nextInt();
        if (A > 0) {
            System.out.println (++A);

        }
        else {
            System.out.print(A);
        }
    }
}