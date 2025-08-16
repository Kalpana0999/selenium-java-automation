package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverloading;

public class MethodOverloadingWithMatchFound {

    //int -> float/double type promotion is allowed
    //float/double -> int type promotion is not allowed
    //small size data type to large type data type is allowed
    //but large size data type to small type data type not allowed

    double name = 100;

    public void m1(int a, int b) {
        System.out.println(a+b);
    }

    public void m1(long a, long b) {
        System.out.println(a+b);
    }

    public void typePromotion () {
        System.out.println(name);
    }

    public static void main(String[] args) {
        MethodOverloadingWithMatchFound obj1 = new MethodOverloadingWithMatchFound();
        obj1.m1(20,30);
        obj1.typePromotion();
    }
}
