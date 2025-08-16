package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverriding;

public class TestChild extends TestParent {

    //Here m3() m4() methods are own methods of TestChild Class
    //Here m5() m5() m7() m8() are overrided methods of TestParent Class

    public void m3() {
        System.out.println("Child m3()");
    }

    public void m4() {
        System.out.println("Child m4()");
    }

    public void m5() {
        System.out.println("Love Marriage");
    }

    public void m6(int a) {
        System.out.println("Child Integer Param Method");
    }

    public void m7(boolean b) {
        System.out.println("Child Boolean Param Method");
    }

    public void m8(String str, int a) {
        System.out.println("Child String Int Param Method");
    }

    public static void main(String[] args) {
        //Objcet - TestParent
        //Reference - TestParent
        TestParent p = new TestParent();
//        p.m1();
//        p.m2();
//        p.m5();

        //Object - TestChild
        //Reference - TestChild
        TestChild c = new TestChild();
//        c.m1();
//        c.m2();
//        c.m3();
//        c.m4();
//        c.m5();
//        c.m6(100);
//        c.m7(true);
//        c.m8("Kalpana",7);

        //Object - TestChild
        //Reference - TestParent

        TestParent p1 = new TestChild();
        p1.m5();                                 //Love Marriage
//      p1.m3();                //Even m3() present in Child class though compilation error occur...
        //because at compile time m3() is not present in TestParent you have given reference of TestParent

        //Here m5() is overrided
        // Compiler will check if m5() is present in TestParent class or not
        // If it is not present = it will give the compilation error
        // If it is present = at Runtime, JVM will call the method whoever object is created
        //In this way run time polymorphism performed..

        p1.m6(100);
        p1.m7(true);
        p1.m8("Kalpana", 32);
    }
}
