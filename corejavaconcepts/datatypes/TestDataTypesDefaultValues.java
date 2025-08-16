package com.delta.kalpana.corejavaconcepts.datatypes;

/**
 * Important Note : - Default value assigned by JVM for Instance Variables only..
 * for Local Variables you must have to initialize..
 */
public class TestDataTypesDefaultValues {
    //Primitive Data Types (8)
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bb;
    static char c;
    // Non-Primitive Data Type
    static String str;

    public static void main(String[] args) {
        System.out.println("Byte \t\t:" + b);
        System.out.println("Short \t\t:" + s);
        System.out.println("Integer \t:" + i);
        System.out.println("Long \t\t:" + l);
        System.out.println("Float \t\t:" + f);
        System.out.println("Double \t\t:" + d);
        System.out.println("Boolean \t:" + bb);
        System.out.println("Character \t:" + c);
    }
}
