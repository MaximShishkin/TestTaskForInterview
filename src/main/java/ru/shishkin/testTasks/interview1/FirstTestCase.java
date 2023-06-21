package ru.shishkin.testTasks.interview1;

public class FirstTestCase {
    FirstTestCase(double a, double b, double c, double afterEquals) {
        System.out.println(solutionOfAQuadraticEquation(a, b, c, afterEquals));
    }

    // a*x^2+b*x+c=afterEquals
    private String solutionOfAQuadraticEquation(double a, double b, double c, double afterEquals) {

        if (a == 0 & b == 0) {
            if (c == afterEquals) {
                return "�����: x - ����� �����";
            } else {
                return "�����: ��������� �� ����� �������";
            }
        } else {
            if (a == 0) {
                double x = (afterEquals - c) / b;
                return "�����: ��������� ��������, x = " + x;
            } else {
                double D = Math.pow(b, 2) - 4 * a * (c - afterEquals);

                if (D > 0) {
                    double x1 = ((-1) * b + Math.sqrt(D)) / (2 * a);
                    double x2 = ((-1) * b - Math.sqrt(D)) / (2 * a);
                    return "�����: D > 0, x1 = " + x1 + " , x2 = " + x2;
                } else if (D == 0) {
                    double x = ((-1) * b) / (2 * a);
                    return "�����: D = 0, x = " + x;
                } else {
                    return "�����: ��������� �� ����� ������������ ������";
                }
            }
        }
    }
}
