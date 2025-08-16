package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverloading;

// To Overload String [] or any type of array you must have to define equivalent method for it to display
public class TestArrayOverloading {
    String str;

    public void m1(String[] strArr) {
        System.out.println("String Array");
        System.out.println(strArr);
    }

    public void m2(String str) {
        System.out.println("The String is : " + str);
    }

    public static void main(String[] args) {
        TestArrayOverloading ao = new TestArrayOverloading();
        String[] strArr = {"Kalpana", "Shiv"};
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
