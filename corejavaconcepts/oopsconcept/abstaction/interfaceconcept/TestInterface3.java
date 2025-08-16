package com.delta.kalpana.corejavaconcepts.oopsconcept.abstaction.interfaceconcept;

/*
TestInterface1 Public Abstract Methods - m1(), m2(), m3()
TestInterface2 Public Abstract Methods - m1(), m4()
Whoever implements this interface have to implement m1(), m2(), m3(), m4()
m1() will be defined only once even though it is at TestInterface1 and TestInterface2
throughout this ambiguity problem solved and multiple inheritance achieved
 */

public interface TestInterface3 extends TestInterface1, TestInterface2 {
    //m1();
    //m2();
    //m3();
    //m4();
}
