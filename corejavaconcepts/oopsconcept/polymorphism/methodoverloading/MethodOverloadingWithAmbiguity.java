package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverloading;

public class MethodOverloadingWithAmbiguity {

    public void m1(int a, int b) {
        System.out.println(a+b);
    }

    public void m1(long a, long b) {
        System.out.println(a+b);
    }

    public void m2(int a) {
        System.out.println(a);
    }

    public void m2(char ch) {
        System.out.println(ch);
    }

//    public int m3() {
//        return 100;
//    }

    public String m3() {
        return "Kalpana";
    }

    public void m4(String name, int age) {
        System.out.println(name + age);
    }

    public void m4(int age, String name) {
        System.out.println(age + name);
    }

    public static void main(String[] args) {

        MethodOverloadingWithAmbiguity obj1 = new MethodOverloadingWithAmbiguity();
        obj1.m1(20,30);
        obj1.m2('a'); //it will return ascii of 'a' if I put only defination of m2(char ch) method in comment
        obj1.m2(30); //compoile time error if I put only defination of m2(int a) method in comment
        String str=obj1.m3();
        System.out.println(str); //if I comment out the method public int m3() it will be executed if both methods are
        //there i.e public int m3() and public string m3() it will return compile time error of method ambiguity..
        obj1.m4(32,"Kalpana");
        obj1.m4("Varada", 4);
    }
}
