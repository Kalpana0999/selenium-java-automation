package com.delta.kalpana.corejavaconcepts.oopsconcept.inheritance.multilevel;

public class TestChild extends TestParent {

    public TestChild() {
        System.out.println("I am in Child No-Args constructor");
    }

    public void m3() {
        System.out.println("I am in child m3()");
    }

    public static void main(String[] args) {
        TestChild obj1 = new TestChild();
        //Using only this stmt Grand Parent, Parent and Child No-Args Constructors will be executed

        obj1.m1();
        obj1.m2();
        obj1.m3();
    }
}
