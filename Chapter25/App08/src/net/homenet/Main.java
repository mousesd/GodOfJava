package net.homenet;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main app = new Main();

        app.runThreadGroup();
    }

    private void runThreadGroup() throws InterruptedException {
        SleepThread sleepThread1 = new SleepThread(5000);
        SleepThread sleepThread2 = new SleepThread(5000);

        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");
        Thread thread1 = new Thread(threadGroup, sleepThread1);
        Thread thread2 = new Thread(threadGroup, sleepThread2);

        thread1.start();
        thread2.start();

        Thread.sleep(1000);
        System.out.println("Group name=" + threadGroup.getName());
        int activeCount = threadGroup.activeCount();
        System.out.println("Active count=" + activeCount);
        threadGroup.list();

        Thread[] threads = new Thread[activeCount];
        int count = threadGroup.enumerate(threads);
        System.out.println("Enumerate result=" + count);
        for (Thread thread : threads) {
            System.out.println(thread);
        }
    }
}
