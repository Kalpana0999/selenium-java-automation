package com.delta.kalpana.corejavaconcepts.oopsconcept.inheritance.hierarchical;

public class TestChild1 extends TestParent {

    public TestChild1(String name) {
        System.out.println("My Name is : " + name);
    }

    public void m2() {
        System.out.println("I am in Child1 m2()");
    }

    public static void main(String[] args) {
        //TestChild1 obj2 = new TestChild1(); //Compile time error occure at the time of execution
        //The error is as like reason: actual and formal argument lists differ in length
        TestChild1 obj1 = new TestChild1("Kalpana");
        obj1.m1();
        obj1.m2();
    }
}
