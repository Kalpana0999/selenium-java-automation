package com.delta.kalpana.corejavaconcepts.collectionconcept.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "User1");
        map.put(2, "User2");
        map.put(3, "User3");
        map.put(4, "User4");
        map.put(5, "User5");

        System.out.println(map);
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        // Using While Printing Seperate Key and Value
        while (itr.hasNext()) {
            Map.Entry<Integer, String> m = itr.next();
            int k = m.getKey();
            String v = m.getValue();
            System.out.print("Key : " + k);
            System.out.print("  Value : " + v);
            System.out.println();
        }
        System.out.println();

        // Using For Each Printing Seperate Key and Value

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            //System.out.print(" " +m);       //Displaying Whole entry set
            //System.out.println();
            int k = m.getKey();             // Separating key from Entry
            String v = m.getValue();        // Seperation value from Entry
            System.out.print("Key : " + k);
            System.out.print("  Value : " + v);
            System.out.println();
        }
    }
}
