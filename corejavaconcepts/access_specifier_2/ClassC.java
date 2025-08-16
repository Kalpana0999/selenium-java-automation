package com.delta.kalpana.corejavaconcepts.access_specifier_2;

import com.delta.kalpana.corejavaconcepts.access_specified_1.ClassA;

public class ClassC extends ClassA {

    private String name;
    protected String str;

    protected ClassC() {
        System.out.println("Protected Child Class Constructor");
    }

    void m4() {
        System.out.println("access_specified_2 Package : Child ClassC m4() Parent is ClassA which is in access_specified_1 Package");
    }

    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        obj1.m1();

        //obj1.m2(); default methods can not be accessed from outside the package
        //obj1.m3(); protected methods can not be accessed outside the package withoud IS-A relationship

        ClassC obj2 = new ClassC();
        obj2.m4();
        obj2.m3(); //We need to create reference of child class in order to access the protected method of parent
    }
}
