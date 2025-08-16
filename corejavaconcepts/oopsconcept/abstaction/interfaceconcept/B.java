package com.delta.kalpana.corejavaconcepts.oopsconcept.abstaction.interfaceconcept;

public class B implements IT6 {

    // public to default not allowed - compile time error attempting to assign weaker access priviledge
    // default to public allowed - scope of access specified may be increased not decreased
//    void m1() {
//        System.out.println("IT6 m1() Overriden");
//    }

    @Override
    public void m1() {
        System.out.println("IT6 m1() Overriden");
    }

    public static void main(String[] args) {
        IT6 it = new B();
        it.m1();

        B b = new B();
        b.m1();
    }
}
