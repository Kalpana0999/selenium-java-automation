package com.delta.kalpana.corejavaconcepts.oopsconcept.polymorphism.methodoverloading;

public class ConstructorOverloading {

    public ConstructorOverloading() {
        System.out.println("This is No-Args Constructor");
    }

    public ConstructorOverloading(String name) {
        System.out.println("Name : " + name);
    }

    public ConstructorOverloading(int age) {
        System.out.println("Age : " + age);
    }

    public ConstructorOverloading(int[] intArr) {
        System.out.println("The Integer Array is : " + intArr);
    }

    public ConstructorOverloading(String[] strArr) {
        System.out.println("The String Array is : " + strArr);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading("Varada");
        new ConstructorOverloading(4);

        String[] strArr = {"Kalpana", "Shivprasad", "Aadki", "Varada"};
        //   new ConstructorOverloading(strArr);
        for (String str : strArr) {
            new ConstructorOverloading(str);
        }

        int[] intArr = {1, 2, 3, 4};
        //  new ConstructorOverloading(intArr);
        for (int i : intArr) {
            new ConstructorOverloading(i);
        }

        for (int i = 0; i <= strArr.length - 1; i++) {
            new ConstructorOverloading(strArr[i]);
        }
    }
}
