package com.delta.kalpana.corejavaconcepts.collectionconcept.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet2 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);
        System.out.println("Set : " + set);

        ArrayList<Integer> list = new ArrayList<>(set); //Passing Collection as param in ArrayList Constructor
        // To convert set to ArrayList
        // Because get() is not available in Set & HashSet
        // Insertion order is not preserved in Set and HashSet thats why set displays the any values in any order,
        // but if they allow get(), we would have got a different element every time
        // To get elements from HashSet or Set have to convert it into ArrayList Using ArrayList constructor

        System.out.println("List : " + list);
        System.out.println(list.get(1));
    }
}
