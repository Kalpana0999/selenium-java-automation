package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

import java.util.*;

public class TestCursors {
    public static void main(String[] args) {
        /*  1) ListIterator :  1) It can be used only on List Interface and its Classes i.e ArrayList, LinkedList, Vector & Stack.
                               2) We can move bi-directional using ListIterator (Forward & Backward Direction)
                               3) It has methods like hasNext(), next(), hasPrevious(), previous(), remove(), set(), add() while iterating.
            2) Iterator     :  1) It can be used on all the Interface & All its Classes in collection.
                               2) We can move only in one direction i.e forward direction only.
                               3) hasNext(), next(), remove() are available in Iterator.
            3) Enumeration  :  1) Not mostly used - Used or applicable on Legacy Classes only- Legacy Classes is nothing but old classes.
                               2) It works only on Vector and Stack only.
                               3) It does not works on ArrayList and LinkedList.
        */
        // 1) ListIterator

        List<String> list1 = new ArrayList<>();
        list1.add("ABC");
        list1.add("PQR");
        list1.add("XYZ");

        System.out.println("------Using ListIterator------");
        ListIterator<String> itr = list1.listIterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
        System.out.println();

        //itr.next();
        itr.previous();
        itr.previous();
        // itr.next();
        // itr.next();

        while (itr.hasPrevious()) {
            System.out.print(" " + itr.previous());
        }
        System.out.println();

        // 2) Iterator
        List<Float> list2 = new ArrayList<>();
        list2.add(25.4f);
        list2.add(62.5f);
        list2.add(85.5f);
        list2.add(98.2f);

        System.out.println("------Using Iterator------");
        Iterator<Float> itr1 = list2.iterator();
        while (itr1.hasNext()) {
            System.out.print(" " + itr1.next());
        }
        System.out.println();

        // Enumeration
        System.out.println("------Using Enumeration------");
        Vector<String> list3 = new Vector<>();
        list3.add("user1");
        list3.add("user2");
        list3.add("user3");

        Enumeration<String> itr2 = list3.elements();   // elements() = iterator() & listIterator()
        while (itr2.hasMoreElements()) {                // hasMoreElements() = hasNext()
            System.out.print(" " + itr2.nextElement()); // nextElement() = next()
        }
    }
}

