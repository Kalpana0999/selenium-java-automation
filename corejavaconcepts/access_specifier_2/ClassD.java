package com.delta.kalpana.corejavaconcepts.access_specifier_2;

public class ClassD extends ClassC {

    public ClassD() {
        System.out.println("ClassD Child Class Constructor");
    }

    public static void main(String[] args) {
        ClassD obj1 = new ClassD();
        obj1.m1();   //public method
        obj1.m3();   //protected method
        obj1.m4();   //defalult method
    }
}
