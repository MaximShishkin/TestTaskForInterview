package ru.shishkin.testTasks.testTaskFibonacciSequence;

public class Thread2 implements Runnable {
    public Thread2(String name) {
        Thread t = new Thread(this, name);
        t.start();
    }

    public void run() {
        Application.sto();
    }
}
