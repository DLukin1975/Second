package Lesson6Task2;

import java.util.List;

public class Box {
    public List<Fruit> content;

    public Box(List<Fruit> content) {
        this.content = content;
    }
    public Box() {
    }
    public void addFruit (Fruit fruit) {
        content.add(fruit);
    }

}
