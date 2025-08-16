package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayListIterator1 {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Kalpana");
        list.add("Shiv");
        list.add(100);
        list.add(200);
        list.add('c');
        list.add("Varada");
        list.add("Bhakti");
        list.add("abc");
        System.out.println(list);

        // Two methods of remove 1) remove(Object o) 2) remove(int Index)

        list.remove("abc"); // It treats object type for String

        // list.remove(100);   Throws ArrayIndexOutOfBounds Exception because it is treated as 100th index rather than value
        list.remove(Integer.valueOf(100));

        System.out.println(list);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }

    }
}
