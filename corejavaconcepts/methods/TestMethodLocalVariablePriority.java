package com.delta.kalpana.corejavaconcepts.methods;

import java.security.spec.RSAOtherPrimeInfo;

public class TestMethodLocalVariablePriority {
    //Instsance Varialbe
    int age = 35;

    //Here in Following Method age is local variable
    public void getAge(int age) {
        System.out.println("Age : " + age);
    }

    {
        System.out.println("Instance Block Age : " + age);
    }

    public void getAge1(int a) {
        a = a + 50;
        System.out.println("Age :" + age); //Referred Instance Variable
        System.out.println("Age1 : " + a);
    }

    public void getAge2(int age) {
        System.out.println("Age : " + age);
        System.out.println("Age : " + this.age); // it will take instance veriable
    }

    public void m1() {
        System.out.println("I am in Method 1");
    }

    public void m2() {
        this.m1();
    }

    public static void main(String[] args) {
        TestMethodLocalVariablePriority obj1 = new TestMethodLocalVariablePriority();
        obj1.getAge(40);
        obj1.getAge1(20);
        obj1.getAge2(25);
        obj1.m2();
    }
}
