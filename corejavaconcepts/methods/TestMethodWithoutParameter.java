package com.delta.kalpana.corejavaconcepts.methods;

/**
 * Program to Perform Basic Mathematical Operations using Methods, without passing parameters..
 */
public class TestMethodWithoutParameter {
    int num1 = 10, num2 = 5, add, sub, mul, div;

    public void addition() {
        add = num1 + num2;
        System.out.println("The Addition is : " + add);
    }

    public void subtraction() {
        sub = num1 - num2;
        System.out.println("The Subtraction is : " + sub);
    }

    public void multiplication() {
        mul = num1 * num2;
        System.out.println("The Multiplication is : " + mul);
    }

    public void division() {
        div = num1 / num2;
        System.out.println("The Division is : " + div);
    }

    public static void main(String[] args) {
        TestMethodWithoutParameter obj1 = new TestMethodWithoutParameter();
        obj1.addition();
        obj1.subtraction();
        obj1.multiplication();
        obj1.division();
    }
}
