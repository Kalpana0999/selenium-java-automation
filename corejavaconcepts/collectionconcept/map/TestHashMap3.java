package com.delta.kalpana.corejavaconcepts.collectionconcept.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap3 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "xyz");
        map.put(3, "pqr");

        System.out.println(map);

        // Iterate Map using ForEach
        for (Map.Entry<Integer, String> set : map.entrySet()) {
            System.out.println(set);
        }
        Set<Integer> keys = map.keySet();  //keySet() returns Set because keys are not duplicate
        System.out.println(keys);
        Collection<String> value = map.values(); //values() returns Collection because values are duplicate
        System.out.println(value);
    }
}
