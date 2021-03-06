package net.homenet;

@SuppressWarnings("Duplicates")
public class SleepThread extends Thread {
    private final long sleepTime;

    public SleepThread(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            System.out.println("Sleeping " + getName());
            Thread.sleep(sleepTime);
            System.out.println("Stopping " + getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
