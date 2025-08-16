package com.delta.kalpana.corejavaconcepts.oopsconcept.abstaction.interfaceconcept;

// Have to implement all abstract methods in TestInterface1 and TestInterface2
// because TestInterface3 implements TestInterface1, TestInterface2

public class TestClass1 implements TestInterface3 {
    @Override
    public void m1() {
        System.out.println("m1()");
    }

    @Override
    public void m4() {
        System.out.println("m4()");
    }

    @Override
    public void m2() {
        System.out.println("m2()");
    }

    @Override
    public void m3() {
        System.out.println("m3()");
    }

    public static void main(String[] args) {
        TestInterface3 it3 = new TestClass1();
        it3.m1();
        it3.m2();
        it3.m3();
        it3.m4();
    }
}
