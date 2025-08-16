package com.delta.kalpana.corejavaconcepts.oopsconcept.inheritance.single;

public class TestChild extends TestParent {

    public TestChild() {
        super("Kalpana");
        this.m3();
    }

    public void m3() {
        System.out.println("I am in Child m3()");
        m1();
        m2();
        //this.m3();
        super.m3();
    }

    public static void main(String[] args) {

        TestChild obj1 = new TestChild();   // Parent No-args Constructor executed because TestChild extends TestParent
        //TestChild obj2 = new TestParent("Kalpana");  //Incompatible type compile time error occur
        //to call this you have to use super keyword in child Constructor..

        // obj1.m1();
        // obj1.m2();
        obj1.m3();
    }
}
