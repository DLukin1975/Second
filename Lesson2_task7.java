import java.util.Scanner;

public class Lesson2_task7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String Town[] = {"Москва","Ростов","Краснодар","Киров"};
        int Code[] = {905,194,491,800};
        int Tax[] = {415,198,269,500};
        float Payment = 0f;
        int i = 0;
        System.out.println ("Введите код города");
        int A = in.nextInt();
        for (i=0;i<4;i++) {
            if (Code[i] == A) {
                Payment = (float) Tax[i]*10/100;
                System.out.println (Town[i] + ". Стоимость разговора " +Payment);
            }
        };
        if (Payment == 0) {
            System.out.println ("Код города нераспознан");
        };
    }
}