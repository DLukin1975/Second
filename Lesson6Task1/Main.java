package Lesson6Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyList<String> listt = new MyArrayList<>();
        listt.add("Птичка");
        listt.add("Воробушек");
        listt.add("Ворона");
        listt.add("Крокодил");
        listt.add("Крокодил");
        System.out.println(listt.size());
        listt.remove(1);
        listt.remove("Крокодил");
        System.out.println(listt.size());
        for (int i = 0; i < listt.size(); i++) {
            System.out.println(listt.get(i));
        }
    }
}
