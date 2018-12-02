package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runThreadState();
    }

    private void runThreadState() {
        //# 1.
        //Object monitor = new Object();
        //StateThread thread = new StateThread(monitor);
        //
        //try {
        //    System.out.println("thread state=" + thread.getState());
        //    thread.start();
        //    System.out.println("thread state(after start)=" + thread.getState());
        //
        //    Thread.sleep(100);
        //    System.out.println("thread state(after 0.1sec)=" + thread.getState());
        //
        //    synchronized (monitor) {
        //        monitor.notify();
        //    }
        //
        //    Thread.sleep(100);
        //    System.out.println("thread state(after notified)=" + thread.getState());
        //
        //    thread.join();
        //    System.out.println("thread state(after join)=" + thread.getState());
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        Object monitor = new Object();
        StateThread thread1 = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);

        try {
            System.out.println("thread1 state=" + thread1.getState());
            thread1.start();
            thread2.start();
            System.out.println("thread1 state(after start)=" + thread1.getState());

            Thread.sleep(100);
            System.out.println("thread1 state(after 0.1sec)=" + thread1.getState());

            synchronized (monitor) {
                monitor.notifyAll();
            }

            Thread.sleep(100);
            System.out.println("thread1 state(after notified)=" + thread1.getState());

            thread1.join();
            System.out.println("thread1 state(after join)=" + thread1.getState());

            thread2.join();
            System.out.println("thread2 state(after join)=" + thread2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
