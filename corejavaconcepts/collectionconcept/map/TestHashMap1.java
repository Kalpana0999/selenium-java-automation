package com.delta.kalpana.corejavaconcepts.collectionconcept.map;

import java.util.HashMap;
import java.util.Map;
/*
Map extends SortedMap - Both are interfaces.
HashMap, LinkedHashMap, TreeHashMap are classes
Map is not in Collection but used with Collection

------------- Characteristics of Map ---------------
1) Map is used to store key & value pair <K,V>
2) Map contains group of Entries
3) Map does not implementing Collection Interface
4) In Map<key> can not be duplicated but <value> can be duplicated
5) If we provide the duplicate key with different value, then it overrides the old value with the new one.

------------- Characterstics of HashMap ------------
1) Version java 1.2
2) Data Structure - HashTable
3) In HashMap<key> can not be duplicated but <value> can be duplicated
4) Insertion order is not preserved
5) Null value is allowed for <key> only once but multiple null <values> are allowed.
6) <value> can be any type it may also list of Strings also
 */

public class TestHashMap1 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "Kalpana");
        map.put(20, "Shiv");
        map.put(30, "Varada");
        map.put(40, "Bhakti");
        map.put(50, "User1");
        map.put(null, "User2");
        map.put(null, "User3");
        map.put(60, "User1");

        System.out.println(map);   // {null=User3, 50=User1, 20=Shiv, 40=Bhakti, 10=Kalpana, 60=User1, 30=Varada}
    }
}
