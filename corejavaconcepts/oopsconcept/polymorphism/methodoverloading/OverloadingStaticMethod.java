package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverloading;

/*
Overloading static method and interchanging parameter data types in method overloading
 */
public class OverloadingStaticMethod {

    public void m1(int age, String name) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public void m1(String name, int age) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void m2(boolean b) {
        System.out.println("Boolean Value : " + b);
    }

    public static void m2(float f) {
        System.out.println("Float Value : " + f);
    }

    public static void main(String[] args) {
        OverloadingStaticMethod obj1 = new OverloadingStaticMethod();
        obj1.m1("Kalpana", 32);
        obj1.m1(4, "Varada");
        m2(true);
        m2(2.5f);

        //Another way of Calling
        new OverloadingStaticMethod().m1("Shivprasad", 38);
        new OverloadingStaticMethod().m1(10, "Bhakti");
    }
}
