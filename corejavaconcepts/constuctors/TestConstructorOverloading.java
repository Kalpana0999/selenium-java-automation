package com.delta.kalpana.corejavaconcepts.constuctors;

public class TestConstructorOverloading {
    public TestConstructorOverloading() {
        System.out.println("This is 0-args Constructor");
    }

    public void TestConstructorOverloading() {
        System.out.println("This is normal method"); //Due to void return type this will be treated as normal method
    }

    public TestConstructorOverloading(String str) {
        System.out.println("This is 1-Param String Constructor");
    }

    public TestConstructorOverloading(int i) {
        System.out.println("This is 1-param Integer Constructor");
    }

    public static void main(String[] args) {
        TestConstructorOverloading obj1 = new TestConstructorOverloading();
        TestConstructorOverloading obj2 = new TestConstructorOverloading("KALPANA");
        TestConstructorOverloading obj3 = new TestConstructorOverloading(100);
        obj1.TestConstructorOverloading();
    }
}
