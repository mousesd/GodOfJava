package net.homenet;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.putAndGetMethodSample();
    }

    private void putAndGetMethodSample() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));

        map.put("A", "1");
        System.out.println(map.get("A"));
    }
}
