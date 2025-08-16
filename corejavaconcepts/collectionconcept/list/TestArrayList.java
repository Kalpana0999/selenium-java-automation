package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

/*
Characterstics of ArrayList
1) java version 1.2
2) Homogeneous & Hetrogeneous Objects are allowed, i.e similar & dissimilar objects are allowed resp.
3) Duplicate Values are allowed    --------------IMP
4) Insersion Order is preserved / maintained -------------- IMP
5) Data Structure : Re-sizable / Growable array
6) Cursor support : ListIterator & Iterator
7) Multiple Null Valus are allowed
 */

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println("-----Homogeneous Elements in ArrayList-----");
        System.out.println(list);

        System.out.println("-------Displaying ArrayList Using For Each------");
        for (Object obj1 : list) {
            System.out.print(" " + obj1);
        }
        System.out.println();

        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(null);
        list1.add("Kalpana");
        list1.add(true);
        list1.add(true);                // Characteristic (3)
        list1.add(25.5);                // Characteristic (2)
        list1.add(null);
        System.out.println("-----Hetrogeneous Elements in ArrayList----------");
        System.out.println(list1);      // Characteristic (4)

        System.out.println("-------Displaying ArrayList Using For Each------");
        for (Object obj1 : list1) {
            System.out.print(" " + obj1);
        }
    }
}
