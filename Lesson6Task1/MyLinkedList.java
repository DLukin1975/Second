package Lesson6Task1;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<E> implements MyList<E> {

    int size = 0;
    LinkedList<E> myList = (LinkedList<E>) new LinkedList<Object>();

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {
        myList.add(item);
        size = size++;
    }

    @Override
    public void remove(int index) {
        myList.remove(index);
        size--;
    }

    @Override
    public void remove(E item) {
        myList.remove(item);
        size--;
    }

    @Override
    public E get(int index) {
        return myList.get(index);
    }

    @Override
    public void clear() {
        myList = (LinkedList<E>) new LinkedList<Object>();
        size = 0;
    }
}

