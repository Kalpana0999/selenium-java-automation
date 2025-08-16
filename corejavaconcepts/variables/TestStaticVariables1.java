package com.delta.kalpana.corejavaconcepts.variables;

public class TestStaticVariables1 {
    static String company;

    public static void main(String[] args) {
        Laptops l1 = new Laptops();
        l1.lapName = "HP";
        l1.lapPrice = 38000;
        System.out.println("Laptop Name : " + l1.lapName);
        System.out.println("Laptop Price : " + l1.lapPrice);
        System.out.println("Laptop OS : " + Laptops.lapOS);

        Laptops l2 = new Laptops();
        l2.lapName = "Lenovo";
        l2.lapPrice = 40000;
        System.out.println("Laptop Name : " + l2.lapName);
        System.out.println("Laptop Price : " + l2.lapPrice);
        System.out.println("Laptop OS : " + Laptops.lapOS);

        System.out.println(TestStaticVariables1.company);
    }
}
