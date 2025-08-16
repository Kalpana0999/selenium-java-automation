package com.delta.kalpana.corejavaconcepts.variables;

/**
 * This Program is to access instance variables and static variables from other class i.e TestVariables1 Class
 */
public class TestVariables2 {
    String company = "Microsoft";

    public static void main(String[] args) {
        TestVariables1 obj1 = new TestVariables1();
        System.out.println("Name :" + obj1.name);
        System.out.println("Age :" + obj1.age);
        System.out.println("Static Variable str : " + TestVariables1.str);

        TestVariables2 obj2 = new TestVariables2();
        System.out.println("Company :" + obj2.company);
    }
}
