package net.homenet;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.getRandomNumber();
    }

    private static final int DATA_BOUNDARY = 50;
    private final Hashtable<Integer, Integer> numbers = new Hashtable<>();

    private void getRandomNumber() {
        Random random = new Random();
        for (int count = 0; count < 5000; count++) {
            int randomNum = random.nextInt(DATA_BOUNDARY);
            if (!numbers.containsKey(randomNum)) {
                numbers.put(randomNum, 1);
            } else {
                numbers.put(randomNum, numbers.get(randomNum) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = numbers.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
