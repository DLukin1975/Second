package Lesson5Task2;

public class OneMonitorStrategy {
    public void oneMonitorStrategy (CharactiristicCreate[] specification) {
        specification[0] = new ProcessorCreate();
        specification[1] = new RamCreate();
        specification[2] = new VideocardCreate();
        specification[3] = new DiscCreate();
        specification[4] = new MonitorCreate();
    }

}
