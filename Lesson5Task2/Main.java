package Lesson5Task2;

public class Main {
    public static void main(String[] args) {
        int i;

        CharactiristicCreate[] specification;
        SpecificationGenerator specificationGenerator = new SpecificationGenerator();
        specificationGenerator.setStrategyCreateSpecification(new TwoMonitorStrategy());
        specification = specificationGenerator.getSpecification();

        Computer computer = new Computer();
        computer.createComputer(specification);
        System.out.println("Мы создали компьютер со следующими характеристиками:");
        for (i = 0; i < specification.length; i++) {
            System.out.println(computer.charactiristic[i].toString());
        }
    }
}