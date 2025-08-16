package com.delta.kalpana.corejavaconcepts.collectionconcept.list;
/*
    Advantages using Generics :
    1) Type Safety : We can hold similar type of values in Generics. It will not allow other type of values to be added.
    2) Type Checking : We don't need to check the type of object / value
    3) Type Casting : We don't need to type cast to the particular type.
    4) Compile Time Checking : The type is checked at the compile time so the problem will not occur at the runtime.
 */

import java.util.ArrayList;

public class TestWithGeneric {

    public static void main(String[] args) {
        // String ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Shiv");
        list1.add("Kalpana");
        list1.add("Varada");
        list1.add("Bhakti");
        list1.add("Bansi");
        // list1.add(100);   compile time error

        for (String s : list1) {
            System.out.print(" " + s);
        }
        System.out.println();

        // Integer ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        for (Integer i : list2) {
            System.out.print(" " + i);
        }
    }
}
