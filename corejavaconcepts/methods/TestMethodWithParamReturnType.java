package com.delta.kalpana.corejavaconcepts.methods;

public class TestMethodWithParamReturnType {

    public String getName(String str) {
        return str;
    }

    public int getAge(int age) {
        return age;
    }

    public int addition(int num1, int num2) {
        int add = num1 + num2;
        return add;
    }

    public int subtraction(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }

    public int multiplication(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    public double division(double num1, double num2) {
        double div = num1 / num2;
        return div;
    }

    public static void main(String[] args) {
        TestMethodWithParamReturnType obj1 = new TestMethodWithParamReturnType();
        System.out.println("The String is : " + obj1.getName("Kalpana"));
        System.out.println("The Age is : " + obj1.getAge(30));
        System.out.println("The Addition is :" + obj1.addition(10, 20));
        System.out.println("The Subtraction is :" + obj1.subtraction(20, 10));
        System.out.println("The Multiplication is :" + obj1.multiplication(20, 10));
        System.out.println("The Division is :" + obj1.division(15, 2));
    }
}
