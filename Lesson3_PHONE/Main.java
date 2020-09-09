package Lesson3_PHONE;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("N234","Nokia A310",200);
        Phone phone2 = new Phone("N345","Ericson XXL",550);
        Phone phone3 = new Phone("N678","Gnusmas 10A",150);
        System.out.println("Созданные экземпляры");
        System.out.println(phone1.model + " " +phone1.number + " " + phone1.weght);
        System.out.println(phone2.model + " " +phone2.number + " " + phone2.weght);
        System.out.println(phone3.model + " " +phone3.number + " " + phone3.weght);

        System.out.println();
        System.out.println("Вызов метода getNumber");
        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        System.out.println();
        System.out.println("Вызов перегруженного метода receiveCall");
        phone1.receiveCall("Павел","123");
        phone2.receiveCall("Юрий","234");
        phone3.receiveCall("Ангелина","345");


        String[] nums = new String[10];
        nums[0] = "345";
        nums[1] = "567";
        nums[2] = "983";
        nums[3] = "978";
        nums[4] = "372";
        System.out.println();
        System.out.println("Вызов метода sendMessage");
        phone1.sendMessage(nums);
    }
}