package ru.shishkin.testTasks.interview1;

public class Application {
    public static void main(String[] args) {
        // a = 2, b = 3, c = 1, afterEquals = 7
        FirstTestCase firstCase = new FirstTestCase(2, 3, 1, 7);
        // a = 1, b = 2, c = 0, afterEquals = 7
        SecondTestCase secondCase = new SecondTestCase(1, 2, 0, 7);

        TheThirdTestCase thethirdCase = new TheThirdTestCase(1, 1, 1, 7, true);

        TheThirdTestCase thethirdCase1 = new TheThirdTestCase(1, 1, 1, 7, false);
    }
}
