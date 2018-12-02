package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runCommonThread();
        app.runDaemonThread();
    }

    private void runCommonThread() {
        DaemonThread thread = new DaemonThread();
        thread.start();
    }

    private void runDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}
