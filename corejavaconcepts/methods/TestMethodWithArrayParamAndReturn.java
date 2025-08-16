package com.delta.kalpana.corejavaconcepts.methods;

public class TestMethodWithArrayParamAndReturn {
    public void getIntArray(int arr[]) {
        System.out.println(arr);                   //it returns starting memory location of stored array
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public void getStringArray(String[] args) {
        for (int i = 0; i <= args.length - 1; i++) {
            System.out.println(args[i]);
        }
    }

    public int[] returnIntArray() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        return a;
    }

    public String[] returnStringArray() {
        String[] str = {"shiv", "kalpana"};
        return str;
    }

    public int[] returnIntParamArray(int aa[]) {
        return aa;
    }

    public String[] returnStringParamArray(String str[]) {
        return str;
    }

    public static void main(String[] args) {
        TestMethodWithArrayParamAndReturn obj1 = new TestMethodWithArrayParamAndReturn();
        int i[] = {10, 20, 30, 40, 50, 60};
        obj1.getIntArray(i);

        String[] strArr = {"KALPANA", "SHIVPRASAD", "VARADA"};
        obj1.getStringArray(strArr);

        int a[] = obj1.returnIntArray();
        for (int j = 0; j <= a.length - 1; j++)
            System.out.println(a[j]);

        String arg[] = obj1.returnStringArray();
        for (int k = 0; k <= arg.length - 1; k++)
            System.out.println(arg[k]);

        int aaa[] = obj1.returnIntParamArray(i);
        for (int m = 0; m <= i.length - 1; m++)
            System.out.println(i[m]);

        String str1[] = obj1.returnStringParamArray(strArr);
        for (int n = 0; n <= strArr.length - 1; n++)
            System.out.println(strArr[n]);
    }
}
