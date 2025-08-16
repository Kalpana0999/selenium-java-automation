package com.delta.kalpana.corejavaconcepts.variables;

/**
 * This class contains only data members i.e variables.. basically all objects of class share same static member
 * that is only one copy of static members where created.. The members declared as static which are common for all the objects
 * static variables are used for memory management purpost..
 * static variables bounded with classes not objects..
 * for static variables the memory is allocated when the class is loaded..
 */
public class Laptops {
    String lapName;
    int lapPrice;
    static String lapOS = "Windows";
}
