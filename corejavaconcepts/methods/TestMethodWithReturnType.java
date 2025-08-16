package com.delta.kalpana.corejavaconcepts.methods;

/**
 * Method with Return type is used when you want to perform operations on value which is returned by method
 */
public class TestMethodWithReturnType {
    int num1 = 10, num2 = 5, add, sub, mul, div;
    String str = "KALPANA " + "DHULAM " + "AADKI";

    public int addition() {
        add = num1 + num2;
        return add;
    }

    public int subtraction() {
        sub = num1 - num2;
        return sub;
    }

    public int multiplication() {
        mul = num1 * num2;
        return mul;
    }

    public int division() {
        div = num1 / num2;
        return div;
    }

    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        TestMethodWithReturnType obj1 = new TestMethodWithReturnType();
        System.out.println("The Addition is : " + obj1.addition());
        System.out.println("The Subtraction is : " + obj1.subtraction());
        System.out.println("The Multiplication is : " + obj1.multiplication());
        System.out.println("The Division is : " + obj1.division());
        System.out.println("The String is : " + obj1.getStr());
    }
}
