package com.delta.kalpana.corejavaconcepts.collectionconcept.set;

import java.util.Iterator;
import java.util.TreeSet;

/*
------------ Characteristics of TreeSet----------
1) Version java 1.2
2) TreeSet implements SortedSet
3) Insertion order is not maintained, but sorting order is maintained, by default Ascending Order.
4) null value is allowed to add, but does not compare Object with null value, so it give NullPointerException
 */
public class TestTreeSet {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("user5");
        tree.add("user3");
        tree.add("user0");
        tree.add("2");
        tree.add("3");
        tree.add("E");
        tree.add("B");
        tree.add("A");
        // tree.add(null);
        // null value is allowed to add, but comparison is not possible with null, so it will give NullPointerException

        System.out.println(tree); // Bydefault Ascending Order

        Iterator<String> itr = tree.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
    }
}
