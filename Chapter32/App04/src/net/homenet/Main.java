package net.homenet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runParallelSortSample();
    }

    private void runParallelSortSample() {
        int[] values = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("Before sort=" + Arrays.toString(values));

        Arrays.parallelSort(values);
        System.out.println("After sort=" + Arrays.toString(values));
    }
}
