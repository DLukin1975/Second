package Lesson5Task2;

public class Computer {
    private CharactiristicCreate[] specification;
    private int i;
    public Charactiristic[] charactiristic;

    public void createComputer(CharactiristicCreate[] specification) {
        //   Charactiristic[] charactiristic {};
        charactiristic = new Charactiristic[specification.length];
        for (i = 0; i < specification.length - 1; i++) {
            System.out.print(i);
            System.out.println(specification[i].createCharacteristic());
            charactiristic[i] = specification[i].createCharacteristic();
        }
    }
}
