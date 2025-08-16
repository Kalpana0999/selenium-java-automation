package com.delta.kalpana.corejavaconcepts.methods;

public class TestStaticMethod {
    public static void getName() {
        System.out.println("My Name is Kalpana");
    }

    public static void getDetails(int age, String str) {
        System.out.println("My Age is : " + age);
        System.out.println("My Name is : " + str);
    }

    public static String getDesignation(String str) {
        return str;
    }

    public static void main(String[] args) {
        TestStaticMethod.getName();
        TestStaticMethod.getDetails(30, "VARADA");
        //String str = TestStaticMethod.getDesignation("QA TESTER");
        System.out.println("My Designation is : " + TestStaticMethod.getDesignation("QA TESTER"));
    }
}
