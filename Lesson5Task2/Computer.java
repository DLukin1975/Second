package Lesson5Task2;

public class Computer {
    private CharactiristicCreate[] specification;
    private int i;
    public Charactiristic[] charactiristic;

    public void createComputer(CharactiristicCreate[] specification) {
        int i;
        charactiristic = new Charactiristic[specification.length];
        System.out.println(specification.length);
        for (i = 0; i < charactiristic.length; i++) {
   //         System.out.print(i);
   //         System.out.println(specification[i].createCharacteristic());
            charactiristic[i] = specification[i].createCharacteristic();
        }
    }
}
