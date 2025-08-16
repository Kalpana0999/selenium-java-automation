package com.delta.kalpana.corejavaconcepts.constuctors;
/**
 * In this Program Constructor is not Defined manually, but by default java compiler calls default constructor
 * for all java classes And initializes the static and instance members of class..
 * This Program is type of Default Constructor
 */
public class TestConstructor {
    String name;
    int age;

    public void getData() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        TestConstructor obj = new TestConstructor();
        obj.getData();
    }

}
