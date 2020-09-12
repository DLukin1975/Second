import java.util.Scanner;

public class Lesson2task3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите целое число");
        int number = in.nextInt();
        if (number > 0) {
            System.out.println (++number);

        }
        else {
            System.out.print(number);
        }
    }
}