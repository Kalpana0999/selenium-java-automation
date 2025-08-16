package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

import java.util.LinkedList;

/*
-------------- Characteristics of LinkedList ----------------------
1) Since java 1.2
2) Homogeneous Hetrogeneous objects are allowed
3) Duplicate values are allowed
4) Multiple Null values are allowed
5) Insertion Order is Preserved
6) Cursor Support - ListeIterator & Iterator
7) Data Structure - Doubly Linked List

------------------ Application of Using LinkedList --------------------
- If there is frequent operation of adding and removing elements in middle then you may use LinkedList collection
- Otherwise ArrayList is most feasible one
- New methods in LinkedList which are not available in ArrayList
  1) addFirst() 2) removeFirst() 3) addLast()   4) removeLast()
- We can also use Generics in LinkedList as ArrayList

-------------- Drawbacks of ArrayList -------------------
- Lot of shifting need to be do in ArrayList, if you are adding element in middle
- If you are removing certain element then also we need lot of shifting.
  To overcome this LinkedList is used
 */
public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Shiv");
        list.add("Kalpana");
        list.add(25);
        list.add('V');
        list.add(true);
        list.add(null);
        list.add(null);
        list.addFirst(1);
        list.addLast("Last Element");
        list.add(1, "Varada");
        list.add(2, "Bhakti");
        System.out.println(list);

        System.out.println("------ After Removing First and Last Element");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        LinkedList<String> list1 = new LinkedList<>(); // Used Generics in LinkedList
        list1.add("Kalpana");
        list1.add("Kalpana");
        System.out.println(list1);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Aadki");
        System.out.println(list2);
    }
}
