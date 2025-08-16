package com.delta.kalpana.corejavaconcepts.oopsconcept.abstaction.interfaceconcept;

public class A extends B implements IT1, IT2 {
    @Override   //IT1
    public void deposit() {

    }

    @Override   //IT1
    public void withdraw() {

    }

    @Override   //IT1
    public void m5() {

    }

    @Override   //IT1
    public void m5(String str) {

    }

    @Override  //IT1 default method
    public void m6() {
        IT1.super.m6();
    }

    @Override   //IT2
    public void m2() {

    }

    public static void main(String[] args) {
        IT2 it2 = new A();
        IT1 it1 = new A();
        System.out.println(IT1.name);
        it1.m6();
        //IT1.name = "Shiv";
        //System.out.println(IT1.name); //cannot assign a value to final variable name compile time error
    }
}
