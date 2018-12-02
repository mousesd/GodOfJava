package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runThreadProperty();
    }

    private void runThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();

        System.out.println("thread1 id=" + thread1.getId());
        System.out.println("thread2 id=" + thread2.getId());

        System.out.println("thread1 name=" + thread1.getName());
        System.out.println("thread2 name=" + thread2.getName());

        System.out.println("thread1 priority=" + thread1.getPriority());
        System.out.println("thread2 priority=" + thread2.getPriority());

        daemonThread.setDaemon(true);
        System.out.println("thread1 isDaemon=" + thread1.isDaemon());
        System.out.println("daemonThread isDaemon=" + daemonThread.isDaemon());
    }
}
