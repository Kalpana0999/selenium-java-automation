package com.delta.kalpana.corejavaconcepts.oopsconcept.encapsulation;

// POJO Class : Plain Old Java Object, The Class where all getter and setter methods of all private variables are exist..

public class TestBank {

    private String accountNumber;
    private double balance;
    private double salary;

    //Getter Method

    public String getAccountNumber() {
        return accountNumber;                 //Write logic to get value
    }

    //Setter Method

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;          // Write logic to set value
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
