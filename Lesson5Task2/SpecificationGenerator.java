package Lesson5Task2;

public class SpecificationGenerator {
    private StrategyCreateSpecification strategyCreateSpecification;

    public SpecificationGenerator() {
    }

    public void setStrategyCreateSpecification( StrategyCreateSpecification strategyCreateSpecification) {
        this.strategyCreateSpecification = strategyCreateSpecification;
    }

    public void getSpecification(CharactiristicCreate[] array) {
        strategyCreateSpecification.createSpecification(array);
    }
}
