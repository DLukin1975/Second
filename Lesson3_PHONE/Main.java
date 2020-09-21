package Lesson3_PHONE;

import java.util.Date;

public class Main {
    private static Phone[] phone = new Phone[3];
    public static void main(String[] args) {
        phone[0] = new Phone("N234", "Nokia A310", 200);
        phone[1] = new Phone("N345", "Ericson XXL", 550);
        phone[2] = new Phone("N678", "Gnusmas 10A", 150);

        System.out.println("Созданные экземпляры");
        for (Phone value : phone) {
            System.out.println(value.model + " " + value.number + " " + value.weght);
        }
 //       System.out.println(phone[0].model + " " + phone[0].number + " " + phone[0].weght);
 //       System.out.println(phone[1].model + " " + phone[1].number + " " + phone[1].weght);
  //      System.out.println(phone[2].model + " " + phone[2].number + " " + phone[2].weght);

        System.out.println();
        System.out.println("Вызов метода getNumber");
        for (Phone value : phone) {
            value.getNumber();
        }
      //  phone[0].getNumber();
     //   phone[1].getNumber();
      //  phone[2].getNumber();

        System.out.println();
        System.out.println("Вызов перегруженного метода receiveCall");
        phone[0].receiveCall("Павел", "123");
        phone[1].receiveCall("Юрий", "234");
        phone[2].receiveCall("Ангелина", "345");


        String[] nums = new String[5];
        nums[0] = "345";
        nums[1] = "567";
        nums[2] = "983";
        nums[3] = "978";
        nums[4] = "372";
        System.out.println();
        System.out.println("Вызов метода sendMessage");
        phone[2].sendMessage(nums);
    }
}