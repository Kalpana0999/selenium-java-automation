package com.delta.kalpana.corejavaconcepts.constuctors;

public class TestConstructorChaining {
    public TestConstructorChaining() {
        this("KALPANA");
        System.out.println("I am in 0-args Constructor");
    }

    public TestConstructorChaining(String str) {
        this("KALPANA", "QA TESTER");
        System.out.println(str);
        System.out.println("I am in 1-args param Constructor");
    }

    public TestConstructorChaining(String name, String dept) {
        System.out.println("Name : " + name);
        System.out.println("Dept : " + dept);
        System.out.println("I am in 2-args constructor");
    }

    public TestConstructorChaining(int age) {
        System.out.println(age);
    }

    public static void main(String[] args) {
        new TestConstructorChaining();
        new TestConstructorChaining(32);
    }
}
