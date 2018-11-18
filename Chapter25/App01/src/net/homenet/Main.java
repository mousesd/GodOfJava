package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runBasic();
        app.runMultiThread();
    }

    private void runBasic() {
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start();

        ThreadSample thread = new ThreadSample();
        thread.start();
    }

    private void runMultiThread() {
        RunnableSample[] runnable = new RunnableSample[5];
        ThreadSample[] thread = new ThreadSample[5];

        for (int count = 0; count < 5; count++) {
            runnable[count] = new RunnableSample();
            thread[count] = new ThreadSample();

            new Thread(runnable[count]).start();
            thread[count].start();
        }

        System.out.println("runMultiThread() method is ended.");
    }
}
