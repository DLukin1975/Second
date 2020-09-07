import java.util.*;

public class Lesson2_task1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите трехзначное число");
        int A = in.nextInt();
        if (A < 100||A > 999) {
            System.out.println ("Число не является трехзначным");

        }
        else {
            int i = A%10;
            System.out.print("Последняя цифра числа - ");
            System.out.println(i);
        }
    }
}