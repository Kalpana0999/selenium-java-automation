package com.delta.kalpana.corejavaconcepts.collectionconcept.set;
/*
------------ Charactristics of HashSet -----------------
1) Since java 1.2
2) Homogeneous and Heterogeneous objects are allowed.
3) Insertion order is not preserved.
4) It does not allow duplicate values - It allows does not give compile time error, but it just ignores duplicate values
5) It allows only one null value - Multiple null values are ignored by HashSet
6) Data Structure - HashTable
7) Cursor - Iterator Only
 */

import java.util.HashSet;

public class TestHashSet {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(300);
        set.add(400);
        set.add(null);
        set.add(null);

        System.out.println(set);  // [400, null, 100, 200, 300]

        // Wrapper Classes
        // int      -> Integer
        // float    -> Float
        // double   -> Double
        // byte     -> Byte
        // short    -> Short
        // long     -> Long
        // char     -> Character
        // boolean  -> Boolean

        HashSet<Float> set1 = new HashSet<>();
        set1.add(10.1f);
        set1.add(20.2f);
        set1.add(null);
        set1.add(null);       //Ignored

        System.out.println(set1);     //  [null, 10.1, 20.2]

        HashSet<Integer> set2 = new HashSet<>();
        // Auto Boxing - Converting Primitive Data Type to Wrapper Class Object
        int a = 10;
        Integer i = a;

        set2.add(i);       // Means In Collection By Default Auto Boxing is done
        set2.add(20);      // Auto Boxing int -> Integer
        set2.add(30);
        System.out.println(set2);  // [20, 10, 30]

        // Auto UnBoxing - Converting Wrapper Class Object to Primitive Data Type
        Integer j = 100;
        int k = j;        // Auto - Unboxing

        String str1 = "10";
        String str2 = "20";
        System.out.println(str1 + str2);   // 1020

        Integer p = Integer.valueOf(str1);
        Integer q = Integer.valueOf(str2);
        System.out.println(p + q);  // 30

        int pq = Integer.parseInt(str1);
        System.out.println(pq);  //10
    }
}
