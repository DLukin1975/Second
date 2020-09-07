import java.util.Scanner;
public class Lesson2_task2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите трехзначное число");
        int A = in.nextInt();
        if (A < 100||A > 999) {
            System.out.println ("Число не является трехзначным");
        }
        else {
            int i = A%10 + ((A-A%10)%100)/10 + ((A-A%100)%1000)/100;
            System.out.print("Сумма цифр - ");
            System.out.println(i);
        }
    }
}