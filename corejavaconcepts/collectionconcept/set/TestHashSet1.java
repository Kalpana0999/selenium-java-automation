package com.delta.kalpana.corejavaconcepts.collectionconcept.set;

import java.util.ArrayList;
import java.util.HashSet;

public class TestHashSet1 {

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Shiv");
        set1.add("Kalpana");
        set1.add("Bhakti");
        set1.add("Varada");
        set1.add("Bansi");
        set1.add(null);
        set1.add(null);
        set1.add("Abc");

        System.out.println(set1);

        // set1.clear() - clears whole set
        System.out.println(set1.size());

        set1.remove("123");
        System.out.println(set1);

        Object[] str = set1.toArray();
        System.out.println("--------- How to get a value from Set-----------");
        ArrayList<String> list = new ArrayList<>(set1); // Converting Set into List
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
