package Lesson5Task2;

public class Computer {
    private CharactiristicCreate[] specification;
    private int i;
    public Charactiristic[] charactiristic;
    public void createComputer(CharactiristicCreate[] specification) {
        for (i=0; i<specification.length;i++) {
            specification[i].createCharacteristic();
        }
    }
}
