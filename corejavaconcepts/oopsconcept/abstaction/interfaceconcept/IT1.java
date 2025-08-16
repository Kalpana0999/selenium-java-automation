package com.delta.kalpana.corejavaconcepts.oopsconcept.abstaction.interfaceconcept;

public interface IT1 {

    public String name = "Kalpana";

    void m1();

    void deposit();

    void withdraw();

    void m5();

    void m5(String str);

    //From java1.8 onwards this default method feature is added in interface concept

    default void m6() {
        System.out.println("This is default m6() in interface");
    }

}

interface IT2 {
    void m2();
}
