package com.delta.kalpana.corejavaconcepts.oopsconcept.inheritance.single;

public class TestParent {

    public TestParent() {
        System.out.println("I am in Parent No-Args Constructor");
    }

    public TestParent(String name) {
        System.out.println("I am in Parent String Argument constructor");
        System.out.println("Name : " + name);
    }

    public void m1() {
        System.out.println("I am in Parent m1()");
    }

    public void m2() {
        System.out.println("I am in Parent m2()");
    }

    public void m3() {
        System.out.println("I am in Parent m3()");
    }
}
