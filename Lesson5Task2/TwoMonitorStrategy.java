package Lesson5Task2;

public class TwoMonitorStrategy implements  StrategyCreateSpecification{
    public void createSpecification(CharactiristicCreate[] specification) {
        specification = new CharactiristicCreate[6];
        specification[0] = new ProcessorCreate();
        specification[1] = new RamCreate();
        specification[2] = new VideocardCreate();
        specification[3] = new DiscCreate();
        specification[4] = new MonitorCreate();
        specification[5] = new MonitorCreate();
    }

}
