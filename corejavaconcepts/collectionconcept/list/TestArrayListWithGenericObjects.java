package com.delta.kalpana.corejavaconcepts.collectionconcept.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListWithGenericObjects {

    public static void displayEmployeeUsingFor(ArrayList<Employee> emp) {
        for (int i = 0; i <= emp.size() - 1; i++) {
            Employee e = emp.get(i);
            System.out.println(" " + e.empId + " " + e.empName + " " + e.company);
        }
    }

    public static void displayEmployeeUsingForEach(ArrayList<Employee> emp) {
        for (Employee e : emp) {
            System.out.println(" " + e.empId + " " + e.empName + " " + e.company);
        }
    }

    public static void displayStudentUsingFor(ArrayList<Student> stud) {
        for (int i = 0; i <= stud.size() - 1; i++) {
            Student st = stud.get(i);
            System.out.println(" " + st.studRoll + " " + st.studName);
        }
    }

    public static void displayStudentUsingForEach(ArrayList<Student> stud) {
        for (Student st : stud) {
            System.out.println(" " + st.studRoll + " " + st.studName);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(001, "Kalpana", "Google");
        Employee emp2 = new Employee(002, "Shiv", "Microsoft");
        Employee emp3 = new Employee(003, "Varada", "HP");
        Employee emp4 = new Employee(004, "Bhakti", "Infosys");

        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.add(emp4);

        System.out.println("----- Employee Class Using For Loop -----");
        displayEmployeeUsingFor(list1);
        System.out.println("----- Employee Class Using For Each ------");
        displayEmployeeUsingForEach(list1);

        Student st1 = new Student(11, "abc");
        Student st2 = new Student(22, "pqr");

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(st1);
        list2.add(st2);

        System.out.println("----- Student Class Using For Loop -----");
        displayStudentUsingFor(list2);
        System.out.println("----- Student Class Using For Each -----");
        displayStudentUsingForEach(list2);
    }
}
