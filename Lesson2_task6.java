import java.util.Scanner;

public class Lesson2_task6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите целое число");
        int A = in.nextInt();
        String Even = "";
        String Positiv = "";
        if (A > 0) {
            Positiv = "положительное";
        }
        else if (A<0) {
            Positiv = "отрицательное";
        };
        switch (A%2) {
            case 0 : Even = "четное";
                break;
            case 1 : Even = "нечетное";
                break;
            case -1 : Even = "нечетное";
                break;
        };
        if (A == 0) {
            System.out.print("нулевое число");
        }
        else {
            System.out.print(Positiv + ' ' + Even + " число");
        };
    }
}