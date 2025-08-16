package com.delta.kalpana.corejavaconcepts.methods;

public class TestMethodsChaining {
    public void m1() {
        System.out.println("I am in m1");
        m2();
    }

    public void m2() {
        System.out.println("I am in m2");
        m3();
    }

    public void m3() {
        System.out.println("I am in m3");
        m4();
    }

    public void m4() {
        //m1(); goes in recurssion..
        System.out.println("I am in m4");
    }

    public static void main(String[] args) {
        TestMethodsChaining obj1 = new TestMethodsChaining();
        obj1.m1();
    }
}
