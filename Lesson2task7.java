import java.util.Scanner;

public class Lesson2task7 {
    public static void main(String[] args) {
        int callDuration = 10;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите код города");
        int cityCode = in.nextInt();

        switch (cityCode) {
            case 905 -> System.out.println("Москва. Стоимость разговора " + 4.15 * callDuration);
            case 194 -> System.out.println("Ростов. Стоимость разговора " + 1.98 * callDuration);
            case 491 -> System.out.println("Краснодар. Стоимость разговора " + 2.69 * callDuration);
            case 800 -> System.out.println("Киров. Стоимость разговора " + 5d * callDuration);
            default -> System.out.println("Код города нераспознан");
        }
    }

}