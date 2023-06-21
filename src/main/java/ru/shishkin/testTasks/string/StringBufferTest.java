package ru.shishkin.testTasks.string;

public class StringBufferTest {
    public StringBufferTest() {
        go();
    }

    private void go() {
        StringBuffer s = new StringBuffer("1234567890");

        System.out.println("s.length() = " + s.length());

        System.out.println("s.capacity() = " + s.capacity());

        StringBuffer s1 = new StringBuffer("abcdifg");

        System.out.println("s + s1 = " + s + " " + s1);

        System.out.println("s.charAt(0) = " + s.charAt(0));

        char buf[] = new char[4];
        s.getChars(4, 8, buf, 0);

        System.out.println("s.getChars = ");
        System.out.println(buf);

        System.out.println("s.equals(s1) = " + s.equals(s1));

        StringBuffer sb = new StringBuffer("I Java!");
        sb.insert(2, "like ");
        System.out.println(sb);

        sb.delete(4, 7);
        System.out.println("delete = " + sb);
        sb.deleteCharAt(0);
        System.out.println("deleteCharAt = " + sb);

        System.out.println("s.substring(4, 8) = " + s.substring(4, 8));

        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
