package ru.shishkin.testTasks.coollection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public TreeMapTest() {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        tm.put("a", new Double(3434.34));
        tm.put("b", new Double(123.22));
        tm.put("c", new Double(1378.00));
        tm.put("d", new Double(99.22));
        tm.put("e", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        double balance = tm.get("d");
        tm.put("f", balance + 1000);
        System.out.println(tm.get("f"));
    }
}
