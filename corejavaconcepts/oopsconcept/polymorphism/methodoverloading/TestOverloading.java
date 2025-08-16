package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverloading;

public class TestOverloading {

    public void addition() {
        System.out.println("This Program is Overloading addition()");
    }

    public void addition(int a, int b) {
        System.out.println("The addition of two nos : " + (a + b));
    }

    public void addition(int a, int b, int c) {
        System.out.println("The addition of three nos : " + (a + b + c));
    }

    public void addition(int a, int b, int c, int d) {
        System.out.println("The addition of four nos : " + (a + b + c + d));
    }

    public void addition(double a, double b) {
        System.out.println("The addition of 2 fractional nos : " + (a + b));
    }

    public static void main(String[] args) {
        TestOverloading obj1 = new TestOverloading();
        obj1.addition();
        obj1.addition(20, 30);
        obj1.addition(1, 2, 3);
        obj1.addition(10, 20, 40, 50);
        obj1.addition(2.5, 6.7);
    }
}
