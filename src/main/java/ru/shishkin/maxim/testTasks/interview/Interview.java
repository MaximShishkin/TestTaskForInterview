package ru.shishkin.maxim.testTasks.interview;

public class Interview {
    private int x;
    private int b = 10;
    private int a = 14;
    private String s0;
    private String s1 = "string";

    public Interview() {
        int a[] = new int[]{2, 1, 4, 2, 3};
        new Test(a);
    }

    void t() {
        try {
            Interview out = new Interview();

            System.out.println(out.x + out.b);
            System.out.println(out.s0 + out.x);
            System.out.println(out.s1 + out.x);
            System.out.println(out.a++ + ++out.b);
            System.out.println(out.b / out.x);
            System.out.println(--out.a - --out.b);
        } catch (ArithmeticException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
	
