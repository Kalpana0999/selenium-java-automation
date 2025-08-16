package com.delta.kalpana.corejavaconcepts.oopsconcept.abstaction.abstractclass;

public class TestChildNew extends TestAbstractClassNew {

    public TestChildNew() {
        System.out.println("Child Class Constructor");
    }

    public static void main(String[] args) {
        TestAbstractClassNew obj = new TestChildNew();
    }
}
