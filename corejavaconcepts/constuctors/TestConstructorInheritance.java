package com.delta.kalpana.corejavaconcepts.constuctors;

public class TestConstructorInheritance extends Student {

    public TestConstructorInheritance() {
        super("Kalpana");
        System.out.println("I am in child constructor");
    }

    public TestConstructorInheritance(String str) {
        super();
        System.out.println("I am in Child Class String Constructor " + str);
    }

    public static void main(String[] args) {
        new TestConstructorInheritance();
        new TestConstructorInheritance("Varada");
    }
}
