package net.homenet;

import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        for (int count = 0; count < 10; count++) {
            HashSet<Integer> distinctNumbers = app.getSixNumbers();
            System.out.println(distinctNumbers);
        }
    }

    private HashSet<Integer> getSixNumbers() {
        Random random = new Random();
        HashSet<Integer> numbers = new HashSet<>();
        while (numbers.size() < 7) {
            numbers.add(random.nextInt(10));
        }
        return numbers;
    }
}
