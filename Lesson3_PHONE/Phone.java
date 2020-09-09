package Lesson3_PHONE;

public class Phone {
    public Phone(String number, String model, int weght) {
        this.number = number;
        this.model = model;
        this.weght = weght;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    String number;
    String model;
    int weght;
}
