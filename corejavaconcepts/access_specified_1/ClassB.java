package com.delta.kalpana.corejavaconcepts.access_specified_1;

/*
In this program default and public methods are accessed without any relationship between ClassA and ClassB
public members scope - Throughout project anywhere can be accessed
defeault members scope - Within Same Package Only accessed
Class may be declared as either default or public only
 */
public class ClassB {

    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        obj1.m1();
        obj1.m2();

        //obj1.m3()  if classB extends ClassA then protected method m3() will be accessible
        //Here ClassB is independent class there is no relationship between ClassA and CLassB thats why
        //protected method m3() is not accessible
    }
}
