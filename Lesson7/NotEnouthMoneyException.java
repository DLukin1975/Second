package Lesson7;

public class NotEnouthMoneyException extends Exception {
    public NotEnouthMoneyException() {
    }

    public void message() {
        System.out.println("Недостаточно денег на счете");
    }
}
