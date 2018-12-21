package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runAnonymousClass();
    }

    private void runAnonymousClass() {
        Calculator calculator = new Calculator() {
            @Override
            public int operator(int x, int y) {
                return x + y;
            }
        };
        System.out.println("4 + 3 = " + calculator.operator(4, 3));
    }
}
