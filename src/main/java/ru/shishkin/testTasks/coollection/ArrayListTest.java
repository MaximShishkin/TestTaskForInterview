package ru.shishkin.testTasks.coollection;

import java.util.ArrayList;

public class ArrayListTest {
    public ArrayListTest() {
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("al.size(): " + al.size());

        al.add("A");
        al.add("B");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("al.size(): " + al.size());

        System.out.println(" al: " + al);

        al.remove("F");
        al.remove(2);

        System.out.println(al.size());
        System.out.println(al);

        String ia[] = new String[al.size()];
        ia = al.toArray(ia);

        System.out.println(ia[0]);
    }
}
