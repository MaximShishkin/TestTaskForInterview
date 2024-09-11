package ru.shishkin.maxim.testTasks.string;

public class StringTest {
    public StringTest() {
        go();
    }

    private void go() {
        String s = new String("1qaz2wsx3edc");

        System.out.println("s.length() = " + s.length());

        String s1 = "123456789";

        System.out.println("s + s1 = " + s + " " + s1);

        System.out.println("s.charAt(0) = " + s.charAt(0));

        char buf[] = new char[4];
        s.getChars(4, 8, buf, 0);

        System.out.println("s.getChars(4, 8, buf, 0) s = ");
        System.out.println(buf);

        System.out.println("s.equals(s1) =" + s.equals(s1));

        System.out.println(" s.compareTo(s1) " + s.compareTo(s1));

        System.out.println("s.substring(4, 8) = " + s.substring(4, 8));

        String s2 = s.replace("a", "1");
        System.out.println("s.replace = " + s2);

        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("s.toUpperCase() = " + upper);
        System.out.println("s.toLowerCase() = " + lower);

        System.out.println("lower.isEmpty() = " + lower.isEmpty());

        String mas[] = s.trim().split("", -1);

        System.out.println(mas);
    }
}