package ru.shishkin.testTasks.multithreading;

public class TestMultithreading {
    public TestMultithreading() {
        System.out.println("Запускаем музыку во втором потоке");
        NewThread t = new NewThread("MyNewTread");
        System.out.println("Продолжаем выполнять какие-то действия в первом потоке");
        while (true) {
            runSto();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void runSto() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Шаг " + i);
            System.out.println("Продолжаем выполнять какие-то действия в первом потоке");
        }
    }
}
