package com.delta.kalpana.corejavaconcepts.datatypes;

/**
 * DataTypes: Data Type determines the type of data to be stored in variables.
 * There are two kind of Data Types :
 * 1) Primitive Data Types
 * 2) Non-Primitive Data Types
 * There are 8 primitive Data Types in Java :
 * Sr.No.   DataType   Size     default value
 * 1       byte       1-byte   0
 * 2       short      2-bytes  0
 * 3       int        4-bytes  0
 * 4       long       8-bytes  0
 * 5       float      4-bytes  0.0
 * 6       double     8-bytes  0.0
 * 7       boolean    1-bit    false
 * 8       char       2-bytes  null space '\u0000'
 */
public class TestDataTypes {
    //shortcut : main -> Press Enter
    public static void main(String[] args) {
        byte b = 7;
        short s = 10;
        int i = 20;
        long l = 30;
        float f = 7.5f;
        double d = 77.55;
        boolean bb = true;
        char c = 'v';
        //shortcut : sout -> Press Enter
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
