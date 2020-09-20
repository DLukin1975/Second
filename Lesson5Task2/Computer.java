package Lesson5Task2;

public class Computer {
 //   private CharactiristicCreate[] specification;
 //   private int i;
    public Charactiristic[] charactiristic;

    public void createComputer(CharactiristicCreate[] specification) {
        //   Charactiristic[] charactiristic {};
        //CharactiristicCreate[] specification;
        int i;
        charactiristic = new Charactiristic[specification.length-1];
        for (i = 0; i < charactiristic.length - 1; i++) {
            System.out.print(i);

 //           if (specification[i].createCharacteristic() instanceof Charactiristic) {
                System.out.println(specification[i].createCharacteristic());
                charactiristic[i] = specification[i].createCharacteristic();
  //          }
        }
    }
}
