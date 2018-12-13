package net.homenet;

import java.util.concurrent.RecursiveTask;

@SuppressWarnings("WeakerAccess")
public class SumRecursiveTask extends RecursiveTask<Long> {
    private final long from;
    private final long to;

    public SumRecursiveTask(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log("From=" + from + ", To=" + to);

        long gap = to - from;
        if (gap <= 3) {
            long sum = 0;
            for (long loop = from; loop <= to; loop++) {
                sum += loop;
            }
            log("Return From=" + from + ", To=" + to + ", Sum=" + sum);
            return sum;
        }

        long middle = (from + to) / 2;
        SumRecursiveTask preTask = new SumRecursiveTask(from, middle);
        log("Pre From=" + from + ", To=" + middle);
        preTask.fork();

        SumRecursiveTask postTask = new SumRecursiveTask(middle + 1, to);
        log("Post From=" + (middle + 1) + ", To=" + to);
        return postTask.compute() + preTask.join();
    }

    private void log(String message) {
        System.out.println("[" + Thread.currentThread().getName() + "] " + message);
    }
}
