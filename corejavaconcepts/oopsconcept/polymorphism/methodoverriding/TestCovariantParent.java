package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverriding;

public class TestCovariantParent {

    public static void m1() {
        System.out.println("Parent m1()");
    }

    public void m2() {
        System.out.println("Parent m2()");
    }

    public Object m3() {
        System.out.println("Parent m3()");
        return "Kalpana";
    }

    public Employee m4() {
        System.out.println("Parent m4()");
        Employee emp = new Employee();
        return emp;
    }

}
