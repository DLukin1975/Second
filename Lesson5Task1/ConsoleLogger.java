package Lesson5Task1;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String logMessage) {
        System.out.println("Пишем в консоль сообщение: " + logMessage);
    }
}
