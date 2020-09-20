package Lesson5Task2;

public class OneMonitorStrategy implements  StrategyCreateSpecification{
    public void createSpecification(CharactiristicCreate[] specification) {
        specification[0] = new ProcessorCreate();
        specification[1] = new RamCreate();
        specification[2] = new VideocardCreate();
        specification[3] = new DiscCreate();
        specification[4] = new MonitorCreate();
    }
}
