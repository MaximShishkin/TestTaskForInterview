package ru.shishkin.maxim.testTasks.fibonacciSequence;

public class Thread2 implements Runnable {
    public Thread2(String name) {
        Thread t = new Thread(this, name);
        t.start();
    }

    public void run() {
        FibonacciSequence.sto();
    }
}
