package com.delta.kalpana.corejavaconcepts.oopsconcept.abstaction.interfaceconcept;

public class TestClass implements TestInterface1, TestInterface2 {

    //m1() is present in both interfaces but you have to specify only one method defination of m1
    // You have to implement only once, in this way ambiguity problem solved and multiple inheritance achieved..
    // TestInterface1 - m1(), m2(), m3()
    // TestInterface2 - m1(), m4()

    @Override
    public void m1() {
        System.out.println("m1() implemented");
    }

    @Override
    public void m4() {
        System.out.println("m4() implemented");
    }

    @Override
    public void m2() {
        System.out.println("m2() implemented");
    }

    @Override
    public void m3() {
        System.out.println("m3() implemented");
    }

    public static void main(String[] args) {
        // TestInterface1 it1 = new TestInterface1(); cant create object of interfaces..

        TestInterface1 it1 = new TestClass();
        it1.m1();
        it1.m2();
        it1.m3();

        TestInterface2 it2 = new TestClass();
        it2.m1();
        it2.m4();
    }
}
