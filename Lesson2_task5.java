import java.util.Scanner;

public class Lesson2_task5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int Maxi = 3;
        int i;
        int Minimum;
        int A[] = new int[Maxi];

        for (i=0;i<Maxi;i++) {
            System.out.println ("Введите целое число номер " + i);
            A[i] = in.nextInt();
        };
        Minimum = A[0];
        for (i=0;i<Maxi;i++) {
            if (A[i] < Minimum) {
                Minimum = A[i];
            };
        };
        System.out.println("Минимальное из введенных значений - " + Minimum);
    }
}