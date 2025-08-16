package com.delta.kalpana.corejavaconcepts.arrayconcept;

public class TestArray1 {

    public static void main(String[] args) {

        // First way of array initialization
        int[] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        // Second way of array initialization
        int[] marks1 = {100, 200, 300, 400};

        // Displaying array contents by using its index values
        System.out.println("----First Array----");
        System.out.print(" " + marks[0]);
        System.out.print(" " + marks[1]);
        System.out.print(" " + marks[2]);
        System.out.print(" " + marks[3]);
        System.out.print(" " + marks[4]);

        System.out.println();
        System.out.println("----Second Array----");
        System.out.print(" " + marks1[0]);
        System.out.print(" " + marks1[1]);
        System.out.print(" " + marks1[2]);
        System.out.print(" " + marks1[3]);

        //Displaying array using iteration
        System.out.println();
        System.out.println("----Using For Each Loop----");
        for (int i : marks) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("----Using For Loop----");
        for (int i = 0; i <= marks.length - 1; i++) {
            System.out.print(" " + marks[i]);
        }
        System.out.println();
        System.out.println("----Using Another For Condition ----");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(" " + marks[i]);
        }

        String[] str = {"Shiv", "Kalpana", "Varada", "Bhakti", "Bansi"};
        System.out.println("The length of str String array : " + str.length);

        System.out.println("----Using For Each Loop----");
        for (String str1 : str) {
            System.out.print(" " + str1);
        }
        System.out.println();
        System.out.println("----Using For Loop----");
        for (int i = 0; i <= str.length - 1; i++) {
            System.out.print(" " + str[i]);
        }
    }
}
