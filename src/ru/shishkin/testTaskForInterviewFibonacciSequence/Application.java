package ru.shishkin.testTaskForInterviewFibonacciSequence;

public class Application {

    public static void main(String[] args) {
        chislafibonachi();
    }

    static void sto() {
        Thread t = Thread.currentThread();

        for (int i = 0; i < 100; i++) {
            System.out.println(t + "" + i);
        }
    }

    static void chislafibonachi() {
        long time = System.nanoTime();

        double mas[] = new double[101];
        int k = 0;
        mas[0] = 0;
        mas[1] = 1;

        System.out.println(mas[0] + " " + mas[1]);

        for (int i = 2; i <= 100; i++) {
            mas[i] = mas[i - 1] + mas[i - 2];
            k = i;
        }

        System.out.println(k + " " + mas[k]);

        time = System.nanoTime() - time;
        System.out.printf("Time: %,9.3f ms\n", time / 1_000_000.0);
    }
}
