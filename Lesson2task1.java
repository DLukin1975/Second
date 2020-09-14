import java.util.*;

public class Lesson2task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = in.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Число не является трехзначным");

        } else {
            int i = number % 10;
            System.out.print("Последняя цифра числа - ");
            System.out.println(i);
        }
    }
}