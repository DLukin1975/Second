package Lesson6Task1;

public interface MyList <E> {

    int size();

    void add (E item);

    void remove (int index);

    void remove (E item);

    E get (int index);

    void clear();
}
