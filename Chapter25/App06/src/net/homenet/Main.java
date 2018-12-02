package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        //app.runThreadState();
        app.runThreadJoin();
    }

    private void runThreadState() {
        SleepThread thread = new SleepThread(2000);
        try {
            System.out.println("thread state=" + thread.getState());
            thread.start();
            System.out.println("thread state(after start)=" + thread.getState());

            Thread.sleep(1000);
            System.out.println("thread state(after 1sec)=" + thread.getState());

            thread.join();
            thread.interrupt();
            System.out.println("thread state(after join)=" + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void runThreadJoin() {
        SleepThread thread = new SleepThread(2000);
        try {
            thread.start();
            thread.join(1000);
            thread.interrupt();
            System.out.println("thread state(after join)=" + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
