package Lesson5Task2;

public class VideocardCreate  extends CharactiristicCreate {
    @Override
    public Charactiristic createCharacteristic() {
        return new Videocard();
    }
}