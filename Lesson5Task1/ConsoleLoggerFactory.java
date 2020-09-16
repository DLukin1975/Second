package Lesson5Task1;

public class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLog() {
        return new ConsoleLogger();
    }

}
