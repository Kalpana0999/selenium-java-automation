package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverriding;

public class TestCovariantChild extends TestCovariantParent {

    public static void m1() {
        System.out.println("Child m1()");
    }

    public void m2() {
        System.out.println("Child m2()");
    }

    public String m3() {
        System.out.println("Child m3()");
        return "Varada";
    }

    public Student m4() {
        System.out.println("Child m4()");
        Student st = new Student();
        return st;
    }

    // String extends Object
    // In Parent - Return type will be Parent Class
    // In Child - Return type will be Child Class

    // String extends Object
    // Object - Parent Class
    // String - Child Class
    // Parent Class - public Object m3() - return type will be Parent Class
    // Child Class - public String m3() - return type will be Child Class

    public static void main(String[] args) {
        TestCovariantParent obj1 = new TestCovariantChild();
        obj1.m1();
        TestCovariantChild.m1();

        // Here m1() is static method is overrided in Parent and Child
        // Static methods are bounded with Classes
        //So Here Parent m1() will be executed
        //And in this case Child m1() will be hidden in static method overriding this concept is called as Method Hiding
        //To execute m1() of child you have to call with child class

        obj1.m3();
        obj1.m4();
    }
}
