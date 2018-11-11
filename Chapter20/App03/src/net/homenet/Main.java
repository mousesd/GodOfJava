package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        System.out.println(app.parseLong("r1024"));
        System.out.println(app.parseLong("1024"));
    }

    private long parseLong(String data) {
        try {
            return Long.parseLong(data);
        } catch (NumberFormatException e) {
            System.out.println(data + "is not a number.");
            return -1;
        }
    }
}
