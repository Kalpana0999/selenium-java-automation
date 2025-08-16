package com.delta.kalpana.corejavaconcepts.arrayconcept;

class Student {
    int studRoll;
    String studName;

    public Student(int studRoll, String studName) {
        this.studRoll = studRoll;
        this.studName = studName;
    }
}

public class TestArray2 {

    public static void main(String[] args) {

        // Initializing Student Array Values by calling its constructor
        Student s1 = new Student(1, "Kalpana");
        Student s2 = new Student(2, "Varada");
        Student s3 = new Student(3, "Bhakti");
        Student s4 = new Student(4, "Shiv");

        // First way of creating Student Array
        Student[] studArray = new Student[4];
        studArray[0] = s1;
        studArray[1] = s2;
        studArray[2] = s3;
        studArray[3] = s4;

        // Another way of initializing Array
        Student[] studArray1 = {s1, s2, s3, s4};

        System.out.println("----Using For Each Loop StudArray----");
        for (Student s : studArray) {
            System.out.println(s.studRoll + "------" + s.studName);
        }
        System.out.println("-----Using For Loop StudArray----");
        for (int i = 0; i <= studArray.length - 1; i++) {
            System.out.println(studArray[i].studRoll + "-----------------------" + studArray[i].studName);
        }
        System.out.println("----Using For Each Loop StudArray1----");
        for (Student s : studArray1) {
            System.out.println(s.studRoll + "............" + s.studName);
        }
        System.out.println("----Using For Loop StudArray1----");
        for (int i = 0; i <= studArray1.length - 1; i++) {
            System.out.println(studArray1[i].studRoll + "....................." + studArray1[i].studName);
        }
    }
}
