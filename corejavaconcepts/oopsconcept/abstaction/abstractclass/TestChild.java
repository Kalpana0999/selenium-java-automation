package com.delta.kalpana.corejavaconcepts.oopsconcept.abstaction.abstractclass;

public class TestChild extends TestAbstactClass {

    @Override
    public void m1() {
        super.m1();
        System.out.println("Child Class m1()");
    }

    @Override
    public void m2(int a) {
        System.out.println("Child Class m2()");
    }

    @Override
    public void m3() {
        System.out.println("Child Class m3()");
    }

    @Override
    public void m4() {
        System.out.println("Child Class m4()");
    }

    public static void main(String[] args) {
        TestAbstactClass obj = new TestChild();
        obj.m1();
        obj.m2(100);
        obj.m3();
        obj.m4();
    }
}
