package com.delta.kalpana.corejavaconcepts.stringconcept;

import java.sql.SQLOutput;

public class TestString {

    public static void main(String[] args) {

        //Object Way
        //In this way variables stored in Heap Memory as well as String Constant Pool (SCP)
        //Two Copies were created

        String str1 = new String("Kalpana");
        String str2 = new String("Shiv");
        String str6 = new String("Varada");

        System.out.println("str1 : " + System.identityHashCode(str1)); //Returns Memory Address of str1
        System.out.println("str2 : " + System.identityHashCode(str2)); //Returns Memory Address of str2
        System.out.println("str6 : " + System.identityHashCode(str6)); //Returns Memory Address of str6

        System.out.println("----------------------------");

        //String Literal Way
        //These String variables are stored in only SCP

        String str3 = "Varadu";
        String str4 = "Shivprasad";
        String str5 = "Varadu";
        String str7 = "Shivprasad";
        String str8 = "varadu";      //String is Case Sensitive so that it will considered as new string and stored at new address

        System.out.println("str3 : " + System.identityHashCode(str3)); //Returns Memory Address of str3
        System.out.println("str4 : " + System.identityHashCode(str4)); //Returns Memory Address of str4
        System.out.println("str5 : " + System.identityHashCode(str5)); //Returns Memory Address of str5
        System.out.println("str7 : " + System.identityHashCode(str7)); //Returns Memory Address of str7
        System.out.println("str8 : " + System.identityHashCode(str8)); //Returns Memory Address of str8
    }
}
