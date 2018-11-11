package net.homenet;

public class Main {
    public static void main(String[] args) {
        //# 1.
        Main app = new Main();
        System.out.println(app.parseLong("r1024"));
        System.out.println(app.parseLong("1024"));

        //# 2.
        System.out.println();
        app.printOtherBase(1024);
    }

    private long parseLong(String data) {
        try {
            return Long.parseLong(data);
        } catch (NumberFormatException e) {
            System.out.println(data + "is not a number.");
            return -1;
        }
    }

    private void printOtherBase(long value) {
        System.out.println("Origin: " + value);
        System.out.println("Binary: " + Long.toBinaryString(value));
        System.out.println("Hex: " + Long.toHexString(value));
        System.out.println("Octal: " + Long.toOctalString(value));
    }
}
