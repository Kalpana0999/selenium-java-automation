package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverriding;

// void m1() scope changed from default to protected
// Parent to Child access specifier scope cant be reduced i.e protected to default not allowed..

public class ClassB extends ClassA {

    protected void m1() {
        System.out.println("Child m1()");
    }

    public static void main(String[] args) {
        ClassA obj = new ClassB();
        obj.m1();
    }
}
