package com.delta.kalpana.corejavaconcepts.oopsconcept.inheritance.multilevel;

public class TestParent extends TestGrandParent {

    public TestParent() {
        System.out.println("I am in Parent No-Args constructor");
    }

    public void m2() {
        System.out.println("I am in Parent m2()");
    }

//    public static void main(String[] args) {
//        TestParent obj1 = new TestParent();
//        obj1.m1();
//        obj1.m2();
//   }
}
