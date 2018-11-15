package net.homenet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        System.out.println("#HashMap put(), get() method sample");
        app.putAndGetMethodSample();

        System.out.println();
        System.out.println("#HashMap keySet() method sample");
        app.keySetMethodSample();

        System.out.println();
        System.out.println("#HashMap values() method sample");
        app.valuesMethodSample();

        System.out.println();
        System.out.println("#HashMap entrySet() method sample");
        app.entrySetMethodSample();

        System.out.println();
        System.out.println("#HashMap containsKey(), containsValue() method sample");
        app.containsMethodSample();

        System.out.println();
        System.out.println("#HaspMap remove(), size() method sample");
        app.removeAndSizeMethodSample();
    }

    private void putAndGetMethodSample() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));

        map.put("A", "1");
        System.out.println(map.get("A"));
    }

    private void keySetMethodSample() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + "=" + map.get(key));
        }
    }

    private void valuesMethodSample() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }

    private void entrySetMethodSample() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    private void containsMethodSample() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }

    private void removeAndSizeMethodSample() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");

        map.remove("A");
        System.out.println("HashMap Size=" + map.size());
    }
}
