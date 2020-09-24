package Lesson6Task2;

import java.util.ArrayList;

public class Box {
    public ArrayList<Fruit> content = new ArrayList<>();
    private double weight = 0;

    public void addFruit(Fruit fruit) {
        content.add(fruit);
    }

    public double getWeight() {
        for (Fruit fruit : content) {
            weight = weight + fruit.getWeightFruit();
        }
        return weight;
    }

}
