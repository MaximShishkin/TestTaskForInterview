package ru.shishkin.testTaskForInterview1;

public class Application {
    public static void main(String[] args) {
        // a = 2, b = 3, c = 1, afterEquals = 7
        FirstTestCase firstcase = new FirstTestCase(2, 3, 1, 7);
        // a = 1, b = 2, c = 0, afterEquals = 7
        SecondTestCase secondcase = new SecondTestCase(1, 2, 0, 7);

        TheThirdTestCase thethirdcase = new TheThirdTestCase(1, 1, 1, 7, true);

        TheThirdTestCase thethirdcase1 = new TheThirdTestCase(1, 1, 1, 7, false);
    }
}
