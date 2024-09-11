package ru.shishkin.maxim.testTasks.coollection;

import java.util.TreeSet;

public class TreeSetTest {
    public TreeSetTest() {
        TreeSet<String> al = new TreeSet<String>();

        System.out.println(al.size());

        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.println(al.size());

        System.out.println(al);

        al.remove("F");

        System.out.println(al.size());
        System.out.println(al);

        String ia[] = new String[al.size()];
        ia = al.toArray(ia);

        System.out.println(ia[0]);

        System.out.println(al);
    }
}
