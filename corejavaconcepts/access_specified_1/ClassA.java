package com.delta.kalpana.corejavaconcepts.access_specified_1;

/*
In this program public, default and protected methods are defined to test their scope
 */
public class ClassA {

    public void m1() {
        System.out.println("access_specifier_1 Package : Parent 'Public' m1()");
    }

    void m2() {
        System.out.println("access_specified_1 Package : Parent 'Default' m2()");
    }

    protected void m3() {
        System.out.println("access_specified_1 Package : Parent 'Protected' m3()");
    }
}
