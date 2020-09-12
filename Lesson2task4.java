import java.util.Scanner;

public class Lesson2task4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите целое число");
        int number = in.nextInt();
        if (number > 0) {
            number=++number;
        }
        else if (number<0) {
            number=number-2;
        }
        else number=10;
        System.out.print(number);
    }
}