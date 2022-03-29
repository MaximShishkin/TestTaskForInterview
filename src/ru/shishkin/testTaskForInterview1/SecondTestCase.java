package ru.shishkin.testTaskForInterview1;

public class SecondTestCase {

    SecondTestCase(double a, double b, double c, double afterEquals) {
        System.out.println(linear_equation_solution(a, b, c, afterEquals));
    }

    // 2*a*x+b*x+c=afterEquals
    private String linear_equation_solution(double a, double b, double c, double afterEquals) {
        if ((2 * a + b) == 0) {
            return "�����: ������ �������� �������, ��������� 2 * a + b ����� 0";
        } else {
            double x = (afterEquals - c) / (2 * a + b);
            return "�����: x = " + x;
        }
    }
}
