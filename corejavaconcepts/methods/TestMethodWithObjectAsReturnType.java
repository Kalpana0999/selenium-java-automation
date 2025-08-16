package com.delta.kalpana.corejavaconcepts.methods;

public class TestMethodWithObjectAsReturnType {
    //Calling All Details of Employee Class using Object as a Parameter
    public void getEmpDetails(Employee e) {
        System.out.println("The Employee Name is : " + e.name);
        System.out.println("The Employee Age is : " + e.age);
        e.getDetails();
    }

    //Returning String (Name) of Employee class using object as a Parameter
    public String getEmpName(Employee e) {
        return e.name;
    }

    //Returning int (age) of Employee class using object as a Parameter
    public int getEmpAge(Employee e) {
        return e.age;
    }

    //Returning Class as Return type
    public Employee getEmpInfo() {
        Employee emp = new Employee();
        return emp;
    }

    //Returning Class as Return type and Class Object as a Parameter
    public Employee getEmployeeDetails(Employee e) {
        e.getDetails();
        e.name = "VARADA";
        e.age = 5;
        return e;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        TestMethodWithObjectAsReturnType obj1 = new TestMethodWithObjectAsReturnType();
        obj1.getEmpDetails(emp);

        System.out.println("The Name is : " + obj1.getEmpName(emp));
        System.out.println("The Age is : " + obj1.getEmpAge(emp));

        emp = obj1.getEmpInfo();
        //System.out.println("Name is :"+emp1.name);
        //System.out.println("Age is : "+emp1.age);
        emp.getDetails();

        emp = obj1.getEmployeeDetails(emp);
        System.out.println("NAME IS : " + emp.name);
        System.out.println("AGE IS " + emp.age);
        emp.getDetails();
    }

}
