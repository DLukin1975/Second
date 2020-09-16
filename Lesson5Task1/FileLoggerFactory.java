package Lesson5Task1;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLog() {
        return new FileLogger();
    }
}
