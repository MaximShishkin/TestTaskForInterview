package ru.shishkin.testTasks.interview1;

public class TheThirdTestCase {
    TheThirdTestCase(double a, double b, double c, double afterEquals, boolean meaning) {
        System.out.println(expressMeaning(a, b, c, afterEquals, meaning));
    }

    // a*x2+b*x+c=afterEquals
    private String expressMeaning(double a, double b, double c, double afterEquals, boolean meaning) {
        if (meaning) {
            if (a == 0) {
                return "�����: ������ ��������, a = 0";
            } else {
                return "�����: x2 = " + (afterEquals / a - c / a) + " + (" + ((-1) * b / a) + ") * x";
            }
        } else {
            if (a == 0) {
                return "�����: ������ ��������, b = 0";
            } else {
                return "�����: x = " + (afterEquals / b - c / b) + " + (" + ((-1) * a / b) + ") * x";
            }
        }
    }
}
