package Lesson6Task1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;

public class MyArrayList<E> implements MyList<E> {

    int size = 0;
    Object[] list = new Object[0];

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {
        Object[] pocket = new Object[size + 1];
     //   if (size >= 0) System.arraycopy(list, 0, pocket, 0, size);
        IntStream.range(1, size).forEach(i -> pocket[i] = list[i]);
        pocket[size + 1] = item;
        list = new Object[size + 1];
        size = size+1;
        IntStream.range(1, size).forEach(i -> list[i] = pocket[i]);

    }

    @Override
    public void remove(int index) {

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
