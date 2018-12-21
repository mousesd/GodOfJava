package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runLambdaSample1();
        app.runLambdaSample2();
    }

    private void runLambdaSample1() {
        Calculator addCalculator = (x, y) -> x + y;
        System.out.println("4 + 3 = " + addCalculator.operator(4, 3));

        Calculator subtractCalculator = (x, y) -> x - y;
        System.out.println("4 - 3 = " + subtractCalculator.operator(4, 3));

    }

    private void runLambdaSample2() {
        //Runnable runnable = new Runnable() {
        //    @Override
        //    public void run() {
        //        System.out.println(Thread.currentThread().getName());
        //    }
        //};
        //new Thread(runnable).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
