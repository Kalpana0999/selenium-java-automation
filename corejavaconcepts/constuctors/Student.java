package com.delta.kalpana.corejavaconcepts.constuctors;

public class Student {

    protected Student() {
        System.out.println("I am in Parent class Protected Constructor");
    }

    public Student(String str) {
        System.out.println("I am in Parent Class String Constructor : " + str);
    }

    public static void main(String[] args) {
        Student st = new Student();
    }
}
