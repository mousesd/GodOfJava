package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        for (int count = 0; count < 5; count++) {
            app.runCalculates();
        }
    }

    private void runCalculates() {
        Calculate calculate = new Calculate();
        AmountThread thread1 = new AmountThread(calculate, true);
        AmountThread thread2 = new AmountThread(calculate, true);
        AmountThread thread3 = new AmountThread(calculate, false);
        AmountThread thread4 = new AmountThread(calculate, false);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            System.out.println("Final value is " + calculate.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
