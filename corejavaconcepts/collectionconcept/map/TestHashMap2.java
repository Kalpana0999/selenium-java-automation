package com.delta.kalpana.corejavaconcepts.collectionconcept.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(100, "user1");
        map.put(200, "user2");
        map.put(300, "user3");
        map.put(400, "user4");

        System.out.println(map);

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
