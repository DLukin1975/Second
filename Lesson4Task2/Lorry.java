package Lesson4Task2;

public class Lorry  extends Car {
    public Lorry (String markAuto, String classAuto, Engine engine) {
        super(markAuto, classAuto, engine);
        }
        @Override
        public void start () {
        System.out.println("Грузовик поехал");
        }

        @Override
             public void stop () {
            System.out.println("Грузовик остановился");
        }
        @Override
            public void printinfo () {
            String markAuto = super.markAuto;
            System.out.println("Марка " + markAuto);
    }
}
