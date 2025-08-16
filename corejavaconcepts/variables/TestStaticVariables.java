package com.delta.kalpana.corejavaconcepts.variables;

/**
 * Program to access static variables directly from anywhere in class i.e in static area,instance area
 * and in outside the class also.
 * static variables are bounded with classes not objects. by using class_name.static_member you can access it anywhere
 */
public class TestStaticVariables {
    static String str = "KALPANA";

    //instance area
    public void m1() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        //static area
        System.out.println(str);
        TestStaticVariables obj = new TestStaticVariables();
        obj.m1(); //non-static method
    }
}
