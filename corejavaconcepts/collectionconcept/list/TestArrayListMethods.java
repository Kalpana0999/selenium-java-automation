package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

import java.util.ArrayList;

public class TestArrayListMethods {

    public static void main(String[] args) {
        // Defining ArrayList with Hetrogeneous Elements

        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(true);
        list1.add("Kalpana");
        list1.add("Shiv");
        list1.add(25.5);

        // Defining ArrayList with Homogeneous Elements

        ArrayList list2 = new ArrayList();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        System.out.println(list1);   //[10, 20, 30, true, Kalpana, Shiv, 25.5]
        System.out.println(list2);   //[100, 200, 300, 400]

        // ArrayList Methods
        /*
                1) add(Object o) - Returns ArrayList - Element will be added in ArrayList
                2) add(int index, Object o) - Returns ArrayList - Element will be added at the ith index position.
         */
        list1.add(0, "Varada");
        list2.add(500);
        System.out.println("-----add(Object o) -------- add(int index, Object o)-----");
        System.out.println(list1); // [Varada, 10, 20, 30, true, Kalpana, Shiv, 25.5]
        System.out.println(list2); // [100, 200, 300, 400, 500]

        /*
                3) get(int index) - Returns Object - Displays provided index element
        */

        System.out.println("----get(int index)-----");
        System.out.println(list1.get(5));   // Kalpana - ArrayList indexing starts from 0 Position

        /*
                4) size() - Returns integer - Displays size of ArrayList
         */
        System.out.println("-----size()-----");
        System.out.println(list1.size());  // 8 - counting starts from 1..

        /*
                5) isEmpty() - Returns Boolean - Displays Whether ArrayList is empty or not, if empty it returns true
                                                 otherwise it returns false
         */
        System.out.println("-----isEmpty()-----");
        System.out.println(list1.isEmpty());    //false

        /*
                6) remove(int index) - Returns Object - removes ith index element. - Displaying the element which will be removed
                7) remove(Object o) - Returns Object  - removes specified ArrayList element. - Displaying the element which will be removed
         */

        System.out.println("----- remove(int index) ------ remove(Object o)-----");
        System.out.println(list1.remove(1));   // 10
        System.out.println(list1);                  // [Varada, 20, 30, true, Kalpana, Shiv, 25.5]
        System.out.println(list1.remove(true));  // true
        System.out.println(list1);                  // [Varada, 20, 30, Kalpana, Shiv, 25.5]

        /*
                8) contains(Object o) - Returns Boolean - Returns true if specified element is present in ArrayList
                                                          if element is not available in ArrayList it will return false
         */

        System.out.println("-----contains(Object o)------");
        System.out.println(list1.contains("Varada"));  // true

        /*
                9) equals(Object o) - Returns Boolean - Returns true if both lists contents are same otherwise it returns false
         */
        System.out.println("-----equals(Object o)-----");
        System.out.println(list1.equals(list2));    //false

        /*
                10) toArray() - Returns Object [] - ArrayList will be converted into Array
        */
        System.out.println("-----toArray()-----");
        System.out.println(list1.toArray()); // [Ljava.lang.Object;@6e8dacdf - By default as usual memory location of first array element will be displayed
        System.out.println(list1);           // [Varada, 20, 30, Kalpana, Shiv, 25.5]
        Object[] objArr = list1.toArray();
        System.out.println(objArr[2]);       //30

        /*
                11) set(int index, Object o) - Returns Arraylist - Replaces the element at ith position in ArrayList
         */

        System.out.println("-----set(int index, Object o)-----");
        System.out.println(list1.set(0, "Varada"));             // Varada
        System.out.println(list1);                             // [Varada, 20, 30, Kalpana, Shiv, 25.5]

        /*
            12) addAll(Collection c) - Returns ArrayList - First List1 will be displayed then list2 elements will be displayed
                                       Because ArrayList preserves Insertion Order
         */
        System.out.println("Before List1 : " + list1);  // [Varada, 20, 30, Kalpana, Shiv, 25.5]
        System.out.println("Before List2 : " + list2);  // [100, 200, 300, 400, 500]
        System.out.println("-----addAll(Collection c)-----");
        list1.addAll(list2);
        System.out.println(list1);             // [Varada, 20, 30, Kalpana, Shiv, 25.5, 100, 200, 300, 400, 500]

        /*
            13) removeAll(Collection c) - Returns ArrayList - Second list removed from first list
         */
        System.out.println("-----removeAll(Collection c)-----");
        list1.removeAll(list2);
        System.out.println(list1);             // [Varada, 20, 30, Kalpana, Shiv, 25.5]
    }
}
