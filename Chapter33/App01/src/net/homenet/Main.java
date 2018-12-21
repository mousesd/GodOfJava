package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runImplementInterface();

    }

    private void runImplementInterface() {
        Calculator calculator = new CalculatorImpl();
        System.out.println("1 + 3 = " + calculator.operator(1, 3));
    }
}
