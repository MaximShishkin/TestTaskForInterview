package ru.shishkin.testTasks.coollection;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    public ArrayDequeTest() {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");
    }
}
