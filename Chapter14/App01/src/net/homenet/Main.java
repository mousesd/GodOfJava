package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.throwable();
    }

    private void throwable() {
        int[] numbers = new int[5];
        try {
            System.out.println(numbers[5]);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
