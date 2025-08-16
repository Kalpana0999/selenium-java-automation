package com.delta.kalpana.corejavaconcepts.collectionconcept.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
/*
    ------------ Characterstics of LinkedHashSet -------------
    1) Since version 1.4
    2) Duplicate Values does not allowed.
    3) Only one null value is allowed.
    4) Data Structure - HashTable + LinkedList
    5) Cursor - Iterator
    6) Insertion Order is Preserved.
 */

public class TestLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<Integer> lhset = new LinkedHashSet<>();
        lhset.add(10);
        lhset.add(20);
        lhset.add(30);
        lhset.add(40);
        lhset.add(50);
        lhset.add(null);
        lhset.add(null);
        lhset.add(60);
        lhset.add(70);

        System.out.println(lhset);

        Iterator<Integer> itr = lhset.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
    }
}
