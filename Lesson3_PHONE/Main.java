package Lesson3_PHONE;

import java.util.Date;

public class Main {
    public void main(String[] args) {
        Phone phone1 = new Phone("N234","Nokia A310",200);
        Phone phone2 = new Phone("N345","Ericson XXL",550);
        Phone phone3 = new Phone("N678","Gnusmas 10A",150);
        System.out.println(phone1.model + " " +phone1.number + " " + phone1.weght);
        System.out.println(phone2.model + " " +phone2.number + " " + phone2.weght);
        System.out.println(phone3.model + " " +phone3.number + " " + phone3.weght);

        phone1.getNumber();
    }
}