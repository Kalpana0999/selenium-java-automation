package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayListIterations {

    public static void main(String[] args) {

        List list1 = new ArrayList();    // Better Practice of creating ArrayList
        list1.add("user1");
        list1.add("user2");
        list1.add("user3");
        list1.add("user4");

        System.out.println("----- Using For Each Loop ------");
        for (Object o : list1) {
            System.out.print(" " + o);
        }
        System.out.println();

        System.out.println("------ Using For Loop ------");
        for (int i = 0; i <= 3; i++) {
            System.out.print(" " + list1.get(i));
        }
        System.out.println();

        ListIterator itr1 = list1.listIterator();
        // ListIterator - Interface - Works only and only on List Interface classes
        // itr1 - Inerface reference
        // listIterator - method of List class

        System.out.println("------ListIterator using while loop------");
        while (itr1.hasNext()) {
            System.out.print(" " + itr1.next());
        }
        System.out.println();
        /*
                hasNext() - Returns Boolean - Cursor besides value present or not if element present it returns ture
                next() - Prints element
         */

        Iterator itr2 = list1.iterator();
        // Iterator - Interface - Works on all interface classes - You can use on Set / Queue / List / Map
        // itr2 - Interface reference
        // Iterator - method of List class

        System.out.println("-----Iterator using while loop------");
        while (itr2.hasNext()) {
            System.out.print(" " + itr2.next());
        }
    }
}
