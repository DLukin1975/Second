package Lesson3_PHONE;

public class Phone {

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, int weght) {
        this.number = number;
        this.model = model;
        this.weght = weght;
    }



    Phone() {
    }

    String number;
    String model;
    int weght;
}
