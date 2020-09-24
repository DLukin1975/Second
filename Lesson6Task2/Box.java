package Lesson6Task2;

import java.util.List;

public class Box {
    public List<Fruit> content;
    private double weight =0;

    public Box(List<Fruit> content) {
        this.content = content;
    }
    public Box() {
    }

    public void addFruit (Fruit fruit) {
        content.add(fruit);
    }

    public double getWeight() {
        for (Fruit fruit : content) {
            weight = weight + fruit.getWeightFruit();
        }
        return weight;
    }

}
