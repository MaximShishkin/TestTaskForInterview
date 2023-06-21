package ru.shishkin.testTasks.coollection;

import java.util.LinkedList;

public class LinkedListTest {
    public LinkedListTest() {
        LinkedList<String> al = new LinkedList<String>();

        System.out.println( al.size());

        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println(al.size());

        System.out.println(al);

        al.remove("F");
        al.remove(2);

        System.out.println(al.size());
        System.out.println(al);

        String ia[] = new String[al.size()];
        ia = al.toArray(ia);

        System.out.println(ia[0]);

        al.removeFirst();
        al.removeLast();

        System.out.println(al);

        String val = al.get(2);
        al.set(2, val);
        System.out.println(11);

        System.out.println(al);
    }
}
