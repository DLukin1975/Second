package Lesson6Task1;

import java.util.List;

public class MyLinkedList<E> implements MyList<E> {

    int size = 0;
    List<Pair<E>> listPair;
    Pair<E> firstPair;
    Pair<E> pocketPair;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {

        if (firstPair.value == null) {
            firstPair.value = item;
            pocketPair.value = item;
            listPair.add(pocketPair);
        } else {
            pocketPair.value = item;
        }
      size = size+1;
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

class Pair<E> {
    E value;
    E nextvalue;
    //  public Pair getPair
}
