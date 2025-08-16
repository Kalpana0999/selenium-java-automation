package com.delta.kalpana.corejavaconcepts.collectionconcept.map;

import java.util.*;

public class TestHashMapMedicine1 {

    public static void main(String[] args) {
        //Map<Character, String> map = new HashMap<>();
        //map.put('A', Arrays.asList("ab","aabb","aabbc"));
        //map.put('B', Arrays.asList("baa","bbbaaa","bbaa"));

        List<String> listA = new ArrayList<>();
        listA.add("Aabbb");
        listA.add("Aabbb");

        List<String> listB = new ArrayList<>();
        listB.add("Bbaa");
        listB.add("Bbccccdd");
        listB.add("Bba");
        listB.add("Bbccd");

        HashMap<Character, List<String>> map = new HashMap<>();
        map.put('A', listA);
        map.put('B', listB);

        //System.out.println("All Medicines : " +map);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Alphabet of Medicine : ");
        char ch = sc.next().charAt(0);

        for (Map.Entry<Character, List<String>> m : map.entrySet()) {
            Character k = m.getKey();
            //System.out.println(k);
            if (ch == k) {
                List<String> v = m.getValue();
                System.out.println(v);
            } else {
                // System.out.println("Medicine Not Found");
            }
            // System.out.println("Medicine Not Found");
        }
    }

}
