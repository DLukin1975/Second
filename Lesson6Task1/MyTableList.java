package Lesson6Task1;

import java.util.*;

public class MyTableList<String> extends ArrayList<String> {

    private int size;
    transient String[] elementData;

    private ArrayList<String> myData = new ArrayList<>();

    @Override
    public int size() {

        return super.size();
    }

    //@Override
    public boolean add(String item) {
        myData.add(item);
        size = size +1;
        return false;
    }


}