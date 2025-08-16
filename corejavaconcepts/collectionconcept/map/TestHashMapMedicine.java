package com.delta.kalpana.corejavaconcepts.collectionconcept.map;

import java.util.*;

public class TestHashMapMedicine {
    public void getMedicine() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Aciclovir");
        map.put(2, "Allopurinol");
        map.put(3, "Baclofen");
        map.put(4, "Bacillus Calmette");
        map.put(5, "Cabunuva");
        map.put(6, "Calcitriol");
        map.put(7, "Cephalexin");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Alphabet of Medicine : ");
        char ch = sc.next().charAt(0);

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> m = itr.next();
            String s = m.getValue();
            String s1 = String.valueOf(ch);
            s1 = s1.toUpperCase();
            if (s.startsWith(s1)) {
                System.out.println(" " + m.getKey() + " " + m.getValue());
            } else {
            }
        }
        System.out.println("Medicine Not Found");
    }

    public static void main(String[] args) {
        TestHashMapMedicine t = new TestHashMapMedicine();
        t.getMedicine();
    }
}
