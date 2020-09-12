import java.util.Scanner;

public class Lesson2task7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите код города");
        int cityCode = in.nextInt();

        switch (cityCode) {
            case 905 -> System.out.println("Москва. Стоимость разговора " + 4.15 * 10);
            case 194 -> System.out.println("Ростов. Стоимость разговора " + 1.98 * 10);
            case 491 -> System.out.println("Краснодар. Стоимость разговора " + 2.69 * 10);
            case 800 -> System.out.println("Киров. Стоимость разговора " + 5 * 10d);
            default -> System.out.println("Код города нераспознан");
        }
    }

}