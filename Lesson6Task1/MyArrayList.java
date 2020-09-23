package Lesson6Task1;

import java.util.ArrayList;

public class MyArrayList<E>  extends ArrayList<E> {
private int size = 0;


    public int size() {
        return size;
    }

    @Override
    public boolean add(E item) {
        size = size+1;
        return false;
    }
}
