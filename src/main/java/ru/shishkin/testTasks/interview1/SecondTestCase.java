package ru.shishkin.testTasks.interview1;

public class SecondTestCase {
    SecondTestCase(double a, double b, double c, double afterEquals) {
        System.out.println(linearEquationSolution(a, b, c, afterEquals));
    }

    // 2*a*x+b*x+c=afterEquals
    private String linearEquationSolution(double a, double b, double c, double afterEquals) {
        if ((2 * a + b) == 0) {
            return "�����: ������ �������� �������, ��������� 2 * a + b ����� 0";
        } else {
            double x = (afterEquals - c) / (2 * a + b);
            return "�����: x = " + x;
        }
    }
}
