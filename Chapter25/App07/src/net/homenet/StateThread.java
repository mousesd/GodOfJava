package net.homenet;

public class StateThread extends Thread {
    private final Object monitor;

    public StateThread(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        try {
            for (int count = 0; count < 10000; count++) {
                String a = "a";
            }

            synchronized (monitor) {
                monitor.wait();
            }
            System.out.println(getName() + " is notified.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
