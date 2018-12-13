package net.homenet;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runForkJoinSample();
    }

    private void runForkJoinSample() {
        ForkJoinPool pool = new ForkJoinPool();
        SumRecursiveTask sumTask = new SumRecursiveTask(0, 10);
        Long result = pool.invoke(sumTask);
        System.out.println("Result: " + result);
    }
}
