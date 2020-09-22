package Lesson6Task1;

import java.lang.reflect.Array;
import java.util.*;

public class MyTableList<String> extends ArrayList<String> {

    private int size;
    transient String[] elementData;

    private ArrayList<String> myData = new ArrayList<>();

    @Override
    public int size() {
        return super.size();
    }




}