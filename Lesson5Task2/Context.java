package Lesson5Task2;

public class Context {
    private StrategyCreateSpecification strategyCreateSpecification;

    public Context() {
    }

    public void setStrategyCreateSpecification(StrategyCreateSpecification strategyCreateSpecification) {
        this.strategyCreateSpecification = strategyCreateSpecification;
    }

    public void getSpecification(StrategyCreateSpecification[] array) {
        strategyCreateSpecification.createSpecification((CharactiristicCreate[]) array);
    }
}
