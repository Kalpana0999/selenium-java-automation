package com.delta.kalpana.corejavaconcepts.stringconcept;

public class TestStringImmutable {

    public static void main(String[] args) {

        //String Literal Way

        String str1 = "Kalpana";
        str1 = str1.concat(" Dhulam");
        String str2 = str1.concat(" Aadki");
        System.out.println("str1 : " + str1);    //Kalpana
        System.out.println("str2 : " + str2);

        //Kalpana Dhulam Here New String is created as Kalpana Dhulam rather than concatinating same string str1

        //StringBuilder class is mutable (we can change the value)
        StringBuilder str3 = new StringBuilder("Kalpana");
        str3.append(" Aadki");

        //Here in same string changed may be updated new string not created..
        System.out.println("str3 : " + str3);
    }
}
