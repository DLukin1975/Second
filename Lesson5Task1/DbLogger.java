package Lesson5Task1;

public class DbLogger implements Logger {
    @Override
    public void log(String logMessage) {
        System.out.println("Пишем в базу данных сообщение: " + logMessage);
    }
}
