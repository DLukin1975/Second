package Lesson6Task1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;

public class MyArrayList<E> implements MyList<E> {

    int size = 0;
    Object[] list = new Object[0];
    Object[] pocket;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {
        pocket = new Object[size + 1];
        if (size == 0) {
            size = 1;
            list = new Object[1];
            list[0] = item;
        } else {
            IntStream.range(0, size).forEach(i -> pocket[i] = list[i]);
            //     System.out.println("текущее " + pocket.length);
            pocket[pocket.length - 1] = item;
            size = size + 1;
            list = new Object[size];
            //System.out.println("текущее " + list.length);
            IntStream.range(0, size).forEach(i -> list[i] = pocket[i]);
        }
    }

    @Override
    public void remove(int index) {
        if (index < size & index >= 0) {
            pocket = new Object[size - 1];
            for (int i = 0; i < size - 1; i++) {
                if (i < index) {
                    pocket[i] = list[i];
                } else {
                    pocket[i] = list[i + 1];
                }
            }
            size = size - 1;
            list = new Object[size];
            IntStream.range(0, size).forEach(i -> list[i] = pocket[i]);
        }
    }

    @Override
    public void remove(E item) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }
}
