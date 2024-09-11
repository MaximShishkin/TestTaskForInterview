package ru.shishkin.maxim.testTasks.string;

public class PalidromTest {
    public PalidromTest() {
        System.out.println(checkPalidrom(2574452));
    }

    private String checkPalidrom(int chislo) {
        StringBuffer stringBuffer = new StringBuffer("").append(chislo);

        stringBuffer.reverse();

        String stringBuffer1 = stringBuffer.substring(0, stringBuffer.length());

        if (chislo == Integer.parseInt(stringBuffer1)) {
            return "This is palidrom";
        } else {
            return "No";
        }
    }
}
