package com.delta.kalpana.corejavaconcepts.constuctors;

public class Employee {
    int empId;
    String empName;

    public Employee() {
        System.out.println("0-args Constructor");
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void getEmpDetails() {
        System.out.println(empId);
        System.out.println(empName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getEmpDetails();

        Employee e2 = new Employee();
        e2.getEmpDetails();

        Employee e3 = new Employee(1, "Kalapana");
        e3.getEmpDetails();

        Employee e4 = new Employee(2, "Varada");
        e4.getEmpDetails();

        new Employee();          //nameless Object
        new Employee().getEmpDetails();


    }
}
