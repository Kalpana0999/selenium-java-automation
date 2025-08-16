package com.delta.kalpana.corejavaconcepts.blocks;

/**
 * Static Block called only once.. Where as Instance Block called every time before object called.
 */
public class TestStaticBlocks {
    static int age;

    static {
        age = 100;
        System.out.println("I am in Static Block -1");
    }

    static {
        System.out.println("I am in Static Block - 2");
    }

    {
        System.out.println("I am in Instance Block - 1");
    }

    {
        System.out.println("I am in Instance Block - 2");
    }

    public TestStaticBlocks() {
        System.out.println("I am in 0-args Constructor");
    }

    public TestStaticBlocks(String str) {
        System.out.println("I am in Param Constructor " + str);
    }

    public static void main(String[] args) {
        TestStaticBlocks obj1 = new TestStaticBlocks();
        TestStaticBlocks obj2 = new TestStaticBlocks();
        TestStaticBlocks obj3 = new TestStaticBlocks("Kalpana");
    }
}
