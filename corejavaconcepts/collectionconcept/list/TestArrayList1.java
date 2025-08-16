package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

import java.util.ArrayList;

public class TestArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1); //Passing list1 in param constructor of ArrayList
        // This stmt converting list,set,queue(i.e collection) to ArrayList
        list2.add(600);
        list2.add(700);
        System.out.println(list2);

    }
}
