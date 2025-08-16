package com.delta.kalpana.corejavaconcepts.variables;

/**
 * This Program is to test Local and Instance Variables Scope
 */
public class TestVariables {
    //Instance Variables/Class Level Variables
    String company = "Google";
    String str;

    public void m1() {
        //Local Variables
        String str = "Automation";
        str = "Automation Testing";
        System.out.println("The Local Variable reassigned String is : " + str); //Automation Testing
    }

    public void m2() {
        System.out.println(str); //This str is Instance Variable and JVM assigns by default null if variable not initialized..
        str = "SHIV";
        System.out.println("Assigned Instance variable : " + str); //SHIV
        System.out.println("Assigned Instance variable : " + company); //Google
        company = "Microsoft";
        System.out.println("Reassigned Instance variable : " + company); //Microsoft
    }

    public static void main(String[] args) {
        //Local Variables
        String name = "KALPANA";
        int age = 32;
        System.out.println("Name: " + name); //KALPANA
        System.out.println("Age :" + age); //32
        TestVariables obj = new TestVariables();
        obj.m1();
        obj.m2();

    }
}
