package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverloading;

public class OverloadingMainMethod {

    public static void main(String name) {
        System.out.println("Name : " + name);
    }

    public static void main(int age) {
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        System.out.println("Overloading main() with int and String Parameter");
        main("Kalpana");
        main(32);
    }
}
