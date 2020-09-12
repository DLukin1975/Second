import java.util.Scanner;

public class Lesson2task5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int maxi = 3;
        int i;
        int mini;
        int[] number = new int[maxi];

        for (i=0;i<maxi;i++) {
            System.out.println ("Введите целое число номер " + i);
            number[i] = in.nextInt();
        }
        mini = number[0];
        for (i=0;i<maxi;i++) {
            if (number[i] < mini) {
                mini = number[i];
            }
        }
        System.out.println("Минимальное из введенных значений - " + mini);
    }
}