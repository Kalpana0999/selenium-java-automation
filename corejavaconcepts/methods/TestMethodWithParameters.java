package com.delta.kalpana.corejavaconcepts.methods;

public class TestMethodWithParameters {

    public void mathOperations(int num1, int num2) {
        int add, sub, mul, div;
        add = num1 + num2;
        System.out.println("Addition is : " + add);
        sub = num1 - num2;
        System.out.println("Subtraction is : " + sub);
        mul = num1 * num2;
        System.out.println("Multiplication is :" + mul);
        div = num1 / num2;
        System.out.println("Division is : " + div);
    }

    public void addition(int a, int b, int c) {
        int add = a + b + c;
        System.out.println("Addition of 3 Numbers is :" + add);
    }

    public void getString(String str) {
        System.out.println("The String is " + str);
    }

    public static void main(String[] args) {
        TestMethodWithParameters obj1 = new TestMethodWithParameters();
        obj1.mathOperations(20, 5);
        obj1.addition(10, 20, 25);
        obj1.getString("Kalpana");


    }

}
