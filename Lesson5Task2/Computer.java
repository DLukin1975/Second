package Lesson5Task2;

public class Computer {
    private CharactiristicCreate[] specification;
    private int i;
    public Charactiristic[] charactiristic = new Charactiristic[]{};
    public void createComputer(CharactiristicCreate[] specification) {
     //   Charactiristic[] charactiristic {};
        for (i=0; i<1;i++) {

            System.out.println(specification[i].createCharacteristic());
            charactiristic[i] = specification[i].createCharacteristic();
        }
    }
}
