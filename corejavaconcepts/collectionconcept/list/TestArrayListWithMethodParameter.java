package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListWithMethodParameter {

    public static void getStringData(ArrayList<String> li) {
        System.out.println(li);
    }

    public static void displayStringData(ArrayList<String> li) {
        for (int i = 0; i <= li.size() - 1; i++) {
            System.out.print(" " + li.get(i));
        }
    }

    public static void getIntegerData(ArrayList<Integer> li) {
        System.out.println(li);
    }

    public static void displayIntegerData(ArrayList<Integer> li) {
        for (int i = 0; i <= li.size() - 1; i++) {
            System.out.print(" " + li.get(i));
        }
    }

    public static ArrayList<Integer> getInteger(ArrayList<Integer> li) {
        li.add(50);
        return li;
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("user1");
        list1.add("user2");
        list1.add("user3");
        list1.add("user4");

        getStringData(list1);
        displayStringData(list1);
        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        getIntegerData(list2);
        displayIntegerData(list2);
        System.out.println();

        ArrayList<Integer> li = getInteger(list2);
        System.out.println(li);

        List<String> list3 = new ArrayList<>();

        list3.add("Shri");
        list3.add("Ganesha");

        System.out.println(list3);
    }
}
