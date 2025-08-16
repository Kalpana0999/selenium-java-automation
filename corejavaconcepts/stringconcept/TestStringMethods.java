package com.delta.kalpana.corejavaconcepts.stringconcept;

public class TestStringMethods {

    public static void main(String[] args) {
        String name = "Kalpana123";
        String name1 = "";
        String name2 = "kalpana";
        String name3 = "Kalpana";
        String name4 = "        Kalpana";
        String name5 = "Kalpana     ";
        String name6 = "        Kalpana  Dhulam          ";
        String name7 = "Kalpana Dhulam Aadki";

        /*
                 1) length() - Returns Integer
                               Displays no. of chars in String
         */

        //K=0 a=1 l=2 p=3 a=4 n=5 a=6 1=7 2=8 3=9

        System.out.println("String Length of " + name + " : " + name.length()); //10

        /*
                 2) charAt(index) - Returns Integer and Character
                                    if you specify index i.e no. integer it will return stored string character
                                    if you specify character it will return ascii value of that char
         */

        System.out.println("At 5th Position Character " + name.charAt(5) + " is present");

        // Display Ascii value of Kalpana123 using charAt function;

        for (int i = 0; i <= name.length() - 1; i++) {
            char ch = name.charAt(i);
            System.out.println("ASCII value of " + ch + " is - " + (int) ch);
        }

        /*
                3) isEmpty() -  Returns Boolean
                                If String is is null it will return True..
                                If String is not null it will return False..
         */
        System.out.println("isEmpty() : " + name1.isEmpty());

        /*
                4) toUpperCase() - returns String - Display whole string in Upper Case..
                5) toLowerCase() - returns String - Display whole string in Lower Case..
         */

        System.out.println("toUpperCase() :" + name.toUpperCase());
        System.out.println("toLowerCase() :" + name.toLowerCase());

        /*
                6) str1.equals(str2) - Returns Boolean - Containt comparision -
                                       Returns true if both strings are same - It is case-sensitive
                7) str1.equalsIgnoreCase(str2) - Returns Boolean - Containt Comparision ignoring their case
         */

        System.out.println("equals() : " + name2.equals(name3));
        System.out.println("equalsIgnorecase() : " + name2.equalsIgnoreCase(name3));

        /*
                8) trim() - Returns String - Merge all white spaces before and after string
                9) concat() - Returns String - Concatenates two strings
         */

        System.out.println("trim() with space at starting :" + name4.trim());
        System.out.println("trim() with space at ending :" + name5.trim());
        System.out.println("trim() with space at befor and after string :" + name6.trim());
        System.out.println("concat() : " + name5.concat(name6));

        /*
               10) contains(substring) - Returns Boolean
                                      Returns true if substring is contained in main string, otherwise it returns false
               11) startsWith(Char/ String) - Returns Boolean
               12) endsWith(Char/ String ) - Returns Boolean - As it method name implies.. Have to specify char or string in ""only
               All these above 3 methods are case-sensitive..
         */

        System.out.println("contains() : " + name.contains("s"));
        System.out.println("startsWith() : " + name.startsWith("K"));
        System.out.println("endsWith() : " + name.endsWith("3"));

        /*
                13) indexOf(char) - Returns Integer
                14) lastIndexOf() - Returns Integer - Last Occurence of char index
                15) indexOf(char,starts_with) - Returns Integer - to return middle term of string index
         */

        //name2 = kalpana

        System.out.println("indexOf(char) : " + name2.indexOf('k'));   //0
        System.out.println("indexOf(string) : " + name2.indexOf("al")); //12 it returns first char index only
        System.out.println("indexOf(char) : " + name2.indexOf('a')); //1
        System.out.println("lastIndexOf(char) : " + name2.lastIndexOf('a')); //6
        System.out.println("indexOf(ch,starts_with) : " + name2.indexOf('a', 2)); //4 middle 'a'

        /*
                16) replace(old char, new char) - returns String - As it name implies
                    replace(old string, new string) - returns String - As it name implies
         */

        System.out.println("replace(old char, new char) : " + name2.replace('a', 'A'));  //kAlpAnA
        System.out.println("replace(old string, new string) : " + name2.replace("kal", "KAL"));

        /*
                17) s1.compareTo(s2) - Returns Integer - Difference between 1st char ascii values
         */

        String s1 = "abC"; //a=97, b=98, c=99
        String s2 = "abc"; //A=65, B=66, C=67

        System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2)); //67-99=-32

        /*
                18) toCharArray() - Returns char Array
         */

        //name7 = Kalpana Aadki
        //{'K', 'a', 'l', .................'i'}

        char[] chArr = name7.toCharArray();
        System.out.println(chArr.length);   //13

        //Print array list using for each where index not matter more then you may use for each to display array list

        System.out.println("--------Using For each loop-----------");
        for (char ch : chArr) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("------------ Using For Loop ---------------");
        for (int i = 0; i <= chArr.length - 1; i++) {
            System.out.print(chArr[i]);
        }
        System.out.println();

        /*
                19) split () - Returns String Array - Split string into no. of strings..
         */
        // length is property of Array
        // lenght() is method of String

        String[] strArr = name7.split(" ");
        System.out.println("String Array Length : " + strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        for (String str : strArr) {
            System.out.println(str);
        }
        for (int i = 0; i <= strArr.length - 1; i++) {
            System.out.println(strArr[i]);
        }

        /*
                20) substring - Returns String - displays substring from main String
                                substring always does endIndex-1
         */

        //name2 = kalpana
        //0-k 1-a 2-l 3-p 4-a 5-n 6-a
        System.out.println("Substring : " + name2.substring(0)); //kalpana
        System.out.println("Substring : " + name2.substring(0, 4)); //kalp
        System.out.println("Substring : " + name2.substring(4)); //ana
        System.out.println("Substring : " + name2.substring(1, 4)); //alp
    }
}
