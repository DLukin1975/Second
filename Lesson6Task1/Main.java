package Lesson6Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyList<String> listMyArrayList = new MyArrayList<>();
        MyList<String> listMyLinkedList = new MyLinkedList<>();

        System.out.println("Работа со списком на основе массива");
        System.out.println("Добавляем значения:");
        listMyArrayList.add("Птичка");
        listMyArrayList.add("Воробушек");
        listMyArrayList.add("Ворона");
        listMyArrayList.add("Крокодил");
        listMyArrayList.add("Крокодил");
        for (int i = 0; i < listMyArrayList.size(); i++) {
            System.out.print(listMyArrayList.get(i) + " ");
        }
        System.out.println(" ");

        System.out.println("Всего добавили " + listMyArrayList.size() + " значений");
        System.out.println(" ");
        System.out.println("Удаляем второе значение и Крокодила");
        listMyArrayList.remove(1);
        listMyArrayList.remove("Крокодил");
        System.out.println("Итоговый список из " + listMyArrayList.size() + " значений:");
        for (int i = 0; i < listMyArrayList.size(); i++) {
            System.out.print(listMyArrayList.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Работа со списком на основе связанного списка");
        System.out.println("Добавляем значения:");
        listMyLinkedList.add("Птичка");
        listMyLinkedList.add("Воробушек");
        listMyLinkedList.add("Ворона");
        listMyLinkedList.add("Крокодил");
        listMyLinkedList.add("Крокодил");
        System.out.print(listMyLinkedList.get(1));
        System.out.println("Итоговый список из " + listMyLinkedList.size() + " значений:");
        for (int i = 0; i < listMyLinkedList.size(); i++) {
            System.out.print(listMyLinkedList.get(i) + " ");
        }
    }
}
