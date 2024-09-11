package ru.shishkin.maxim.testTasks.interview;

public class Test {
    public Test() {
        int x = 10;
        int y = 10;

        System.out.println(new Node(x).equals(y));

        String s = "MAMA";
        String s1 = "" + "MAMA";

        System.out.println(new Node(s).equals(s1));

        Object ob = new Object();
        Object ob1 = ob;

        System.out.println(new Node(ob).equals(ob1));
    }

    public Test(String s) {
        System.out.println(countWords(s));
    }

    public static int countWords(String s) {
        s.replace("  ", " ");
        String mas[] = s.trim().split(" ");
        System.out.println(mas);

        return mas.length;
    }

    public Test(int[] a) {
        int[] b;
        b = removeDuplicates(a);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }

    public static int[] removeDuplicates(int[] a) {
        int[] bint = new int[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    if (a[i] == a[j]) {
                        bint[i] = j;
                        k = k + 1;
                    } else {
                        bint[i] = -1;
                    }
                }
            }
        }

        int[] b = new int[a.length - k];
        k = 0;

        for (int i = 0; i < a.length; i++) {
            if (bint[i] > 0) {
                b[k] = a[i];
                k++;
            }
        }

        return b;
    }
}
