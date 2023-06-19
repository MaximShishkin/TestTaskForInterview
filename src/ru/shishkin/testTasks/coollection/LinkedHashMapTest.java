package ru.shishkin.testTasks.coollection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {
    public LinkedHashMapTest() {
        LinkedHashMap<String, Double> tm = new LinkedHashMap<String, Double>();

        tm.put("1", new Double(3434.34));
        tm.put("2", new Double(123.22));
        tm.put("3", new Double(1378.00));
        tm.put("4", new Double(99.22));
        tm.put("5", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        double balance = tm.get("1");
        tm.put("6", balance + 1000);
        System.out.println(tm.get("6"));
    }
}
