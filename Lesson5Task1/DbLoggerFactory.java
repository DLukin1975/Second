package Lesson5Task1;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLog() {
        return new DbLogger();
    }
}
