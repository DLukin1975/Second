import java.util.Scanner;
//import java.util.Math;
public class Lesson2task2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int digit  = 4;
        System.out.println ("Введите " + digit + " значное число");
        int number = in.nextInt();
        if ((number < Math.pow(10,digit-1))||(number > (Math.pow(10,digit)-1))) {
            System.out.println ("Число не является " + digit +" значным");
        }
        else {
            int i;
            int result = 0;
            int pocket = number;
            for (i=0;digit>i;i++) {
                result = result + pocket%10;
                pocket = (pocket - pocket%10)/10;
            }
            System.out.print("Сумма цифр - ");
            System.out.println(result);
  //          System.out.println(Math.pow(2,3));
        }
    }
}