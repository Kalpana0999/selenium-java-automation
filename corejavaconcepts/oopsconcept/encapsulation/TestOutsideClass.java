package com.delta.kalpana.corejavaconcepts.oopsconcept.encapsulation;

public class TestOutsideClass {

    public static void main(String[] args) {
        TestBank obj = new TestBank();
        obj.setAccountNumber("526874463366");
        obj.setBalance(30000);
        obj.setSalary(50000);
        System.out.println("Account No. is : " + obj.getAccountNumber());
        System.out.println("Balance is : " + obj.getBalance());
        System.out.println("Salary is : " + obj.getSalary());
    }
}
