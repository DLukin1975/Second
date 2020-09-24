package Lesson6Task2;

import java.util.ArrayList;

public class Box {
    public ArrayList<Fruit> content = new ArrayList<>();
    private double weight = 0;

    public boolean addFruit(Fruit fruit) {
        if (content.size() == 0 || fruit.type.equals(content.get(0).type) ) {
            content.add(fruit);
            return true;
        } else {return false;}
    }

    public double getWeight() {
        for (Fruit fruit : content) {
            weight = weight + fruit.getWeightFruit();
        }
        return weight;
    }

}
