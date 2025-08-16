package com.delta.kalpana.corejavaconcepts.arrayconcept;

public class TestArray3 {

    public static void passObjectArray(Object[][] obj) {
        System.out.println("----Values from Method----");
        System.out.println(obj[0][0]);
        System.out.println(obj[0][1]);
    }

    public static Object[][] returnObjectArray() {
        Object[][] objArr = {
                {"Kalpana", 100},
                {"Shiv", 200}
        };
        return objArr;
    }

    public static void main(String[] args) {

        String[][] strArr = {
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"},
                {"user4", "pass4"}
        };
        //First For Loop for Row ---- Here Rows are 4
        //Second For Loop for Column ----- Here Columns are 2

        System.out.println("The Length of 2D Array : " + strArr.length);
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(" " + strArr[i][j]);
            }
            System.out.println();
        }

        System.out.println("------Object 2D Array-----");

        Object[][] objAr;
        objAr = returnObjectArray();
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(" " + objAr[i][j]);
            }
            System.out.println();
        }

        Object[][] objAr1 = {
                {"aaa", 111},
                {"bbb", 222, false}
        };
        passObjectArray(objAr);
        passObjectArray(objAr1);
    }

}
