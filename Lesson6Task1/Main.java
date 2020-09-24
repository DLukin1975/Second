package Lesson6Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyList<String> listMyArrayList = new MyArrayList<>();
        listMyArrayList.add("Птичка");
        listMyArrayList.add("Воробушек");
        listMyArrayList.add("Ворона");
        listMyArrayList.add("Крокодил");
        listMyArrayList.add("Крокодил");

        System.out.println(listMyArrayList.size());
        listMyArrayList.remove(1);
        listMyArrayList.remove("Крокодил");
        System.out.println(listMyArrayList.size());
        for (int i = 0; i < listMyArrayList.size(); i++) {
            System.out.println(listMyArrayList.get(i));
        }
            System.out.println("Работа со списком на основе связанного списка");
            MyList<String> listMyLinkedList = new MyLinkedList<>();
            listMyLinkedList.add("Птичка");
            listMyLinkedList.add("Воробушек");
            listMyLinkedList.add("Ворона");
            listMyLinkedList.add("Крокодил");
            listMyLinkedList.add("Крокодил");
            System.out.println(listMyLinkedList.size());

    }
}
