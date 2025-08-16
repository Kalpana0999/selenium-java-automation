package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

import java.util.ArrayList;

/*
   In this Without Generics - If you want to perform operation on single ArrayList element you have to every time
   perform type checking and type casting.. This is not proper approach.. Thats why Generics Concept is used..
 */

public class TestWithoutGeneric {

    public static void main(String[] args) {

        //Without Generic
        ArrayList list1 = new ArrayList();
        list1.add("Shiv");
        list1.add("Kalpana");
        list1.add("Varada");
        list1.add("Bhakti");
        list1.add(true);
        list1.add(100);


        for (Object obj : list1) {
            //Type Checking
            if (obj instanceof String) {
                String str = (String) obj;       //Type Casting
                System.out.println("String : " + str + "  ----------  " + "Length : " + str.length());
            }

            //Type Casting
            if (obj instanceof Integer) {
                Integer i = (Integer) obj;
                System.out.println("The Integer Value in ArrayList is : " + i);
            }

            //Type Casting
            if (obj instanceof Boolean) {
                Boolean b = (Boolean) obj;
                System.out.println("The Boolean Value in ArrayList is : " + b);
            }
        }
    }
}
