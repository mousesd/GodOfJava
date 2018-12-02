package net.homenet;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
