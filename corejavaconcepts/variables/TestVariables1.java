package com.delta.kalpana.corejavaconcepts.variables;

/**
 * This Program is to test accessing non-static members in static area
 */
public class TestVariables1 {
    //Instance Variable
    String name = "KALPANA";
    int age = 32;
    static String str = "DHULAM";

    //Instance Method OR Non-Static Method
    public void m1() {
        System.out.println("Name: " + name); //Directly Accessing Instance Variable in Instance Method
    }

    //Static Method
    public static void main(String[] args) {
        //Static Method Area
        //System.out.println("Name: "+name);//Instance variables cant access directly in static method or static area
        //"name" is non-static variable

        System.out.println(str); //Directly Accessing Static Variable in Static Method
        TestVariables1 obj = new TestVariables1();  //Object Creation

        //By using class object can access non-static members..

        System.out.println("Name: " + obj.name); //non-static variable
        System.out.println("Age: " + obj.age); //non-static variable
        obj.m1(); //non-static method
    }

}
