package ru.shishkin.maxim.testTasks.coollection;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public PriorityQueueTest() {
        PriorityQueue<String> adq = new PriorityQueue<String>();

        adq.add("A");
        adq.add("B");
        adq.add("D");
        adq.add("E");
        adq.add("F");
        adq.add("F");

        while (adq.peek() != null) {
            System.out.print(adq.poll() + " ");
        }
    }
}
