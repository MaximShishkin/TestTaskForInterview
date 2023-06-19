package ru.shishkin.testTasks.coollection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
    public HashMapTest() {
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("a", new Double(3434.34));
        hm.put("b", new Double(123.22));
        hm.put("c", new Double(1378.00));
        hm.put("d", new Double(99.22));
        hm.put("e", new Double(-19.08));

        Set<Entry<String, Double>> set = hm.entrySet();

        for (Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        double balance = hm.get("a");
        hm.put("f ", balance + 1000);
        System.out.println(hm.get("e"));
    }
}
