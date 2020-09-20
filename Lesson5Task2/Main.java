package Lesson5Task2;

public class Main {
    public static void main(String[] args) {
        CharactiristicCreate[] specification = new CharactiristicCreate[2];
        SpecificationGenerator specificationGenerator = new SpecificationGenerator();
        specificationGenerator.setStrategyCreateSpecification(new TwoMonitorStrategy());
        specificationGenerator.getSpecification(specification);
        System.out.println("Результат: " + specification[0]);
        System.out.println("Результат: " + specification[1]);

        Computer computer = new Computer();
        computer.createComputer(specification);
//        System.out.println("Результат: " + computer.charactiristic[0]);
    }
}