package com.delta.kalpana.corejavaconcepts.blocks;

public class TestInstanceBlocks {
    int age;

    {
        //common logic which is used for all objects, this logic would be kept in instance block
        //because instance block is executed before constructor
        //means at the time of loading
        //eg. 1) Database Connection
        // 2) Files which needs to be loaded before program is being executed etc..

        System.out.println("I am in Instance Block-1");
    }

    {
        System.out.println("I am in Instance Block-2");
    }

    public TestInstanceBlocks() {
        System.out.println("I am in 0-args constructor");
        //Logic will be specific to this constructor only..
    }

    public TestInstanceBlocks(String str) {
        System.out.println("I am in String Param Constructor : " + str);
        age = 100;
        System.out.println(age);
    }
    //Each and Every Time Instance Block called first before object called..

    public static void main(String[] args) {
        TestInstanceBlocks obj1 = new TestInstanceBlocks();
        TestInstanceBlocks obj2 = new TestInstanceBlocks("KALPANA");
    }
}
