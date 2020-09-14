import java.util.Scanner;

public class Lesson2task6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите целое число");
        int number = in.nextInt();
        String even;
        String positiv = "";
        if (number > 0) {
            positiv = "положительное";
        }
        else if (number<0) {
            positiv = "отрицательное";
        }

 //       switch (number % 2) {
 //          case 0 -> even = "четное";
//            case 1 -> even = "нечетное";
//           case -1 -> even = "нечетное";
//        }

        if (number % 2 == 0) {
            even = "четное";
        }
        else {
            even = "нечетное";
        }

        if (number == 0) {
            System.out.print("нулевое число");
        }
        else {
            System.out.print(positiv + ' ' + even + " число");
        }
    }
}