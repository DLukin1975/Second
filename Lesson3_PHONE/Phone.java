package Lesson3_PHONE;

public class Phone {

    protected String number;
    protected String model;
    protected int weght;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weght) {
        this(number, model);
        this.weght = weght;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNum) {
        System.out.println("Звонит " + name + " Номер " + phoneNum);
    }

    public void getNumber() {
        System.out.println("Вам звонит номер " + number);
    }

    public void sendMessage(String[] nums) {
        for (String num : nums) {
            System.out.println("Сообщение будет отправлено номеру " + num);
        }
    }
}
