package ru.shishkin.testTaskForInterviewFibonacciSequence;

public class Thread2 implements Runnable {
    public Thread2(String name) {
        Thread t = new Thread(this, name);
        t.start();
    }

    public void run() {
        Application.sto();
    }
}
