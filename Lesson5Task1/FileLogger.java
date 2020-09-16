package Lesson5Task1;

public class FileLogger implements Logger {
    @Override
    public void log(String logMessage) {
        System.out.println("Пишем в файл сообщение: " + logMessage);
    }
}