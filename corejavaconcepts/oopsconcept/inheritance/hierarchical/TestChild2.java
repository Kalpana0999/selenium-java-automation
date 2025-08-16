package com.delta.kalpana.corejavaconcepts.oopsconcept.inheritance.hierarchical;

public class TestChild2 extends TestParent {

    public TestChild2() {
        System.out.println("I am in Child2 No-Args Constructor");
    }

    public void m3() {
        System.out.println("I am in Child2 m3()");
    }

    public static void main(String[] args) {
        TestChild2 obj1 = new TestChild2();
        obj1.m1();
        obj1.m3();

        TestChild1 obj2 = new TestChild1("Varada");
        obj2.m1();
        obj2.m2();

    }
}
