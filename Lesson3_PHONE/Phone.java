package Lesson3_PHONE;

public class Phone {

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weght) {
        this(number,model);
        this.weght = weght;
    }

    public Phone() {
    }

    String number;
    String model;
    int weght;

    public void receiveCall (String name) {
        System.out.println("Звонит " + name);
   }

    public void getNumber () {
       System.out.println("Черти что");
    }
}
