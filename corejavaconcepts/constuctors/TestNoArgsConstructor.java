package com.delta.kalpana.corejavaconcepts.constuctors;

/**
 * This program is type of no-args OR 0 parameter constructor
 * There is Difference Between Default and 0 Parameter constructor
 * Default Constructor                                  No-args Constructor
 * By Default Called by Java Compiler                   Programmers manually have to define and initialize members of class
 * For All Java Classses
 * by default, default values assigned to vars          user specified values assigned to vars
 * IN TARGET .class FILE WILL BE AS                     IN TARGET .class FILE WILL BE AS
 * public Constructor() {                               public Constructor() {
 * name=null;                                       this.name=name;
 * age=0;                                           this.age=age;
 * }                                                    }
 */

public class TestNoArgsConstructor {
    String name;
    int age;

    public TestNoArgsConstructor() {
        name = "KALPANA";
        age = 32;
    }

    public void getData() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        TestNoArgsConstructor obj1 = new TestNoArgsConstructor();
        obj1.getData();
        TestNoArgsConstructor obj2 = new TestNoArgsConstructor();
        obj2.getData();
    }

}
