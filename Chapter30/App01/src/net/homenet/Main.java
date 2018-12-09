package net.homenet;

@SuppressWarnings("OctalInteger")
public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runJdk6Number();
        app.runJdk7Number();
    }

    private void runJdk6Number() {
        int decimalVal = 1106;
        int octalVal = 02122;
        int hexDecimalVal = 0x452;

        System.out.println(decimalVal);
        System.out.println(octalVal);
        System.out.println(hexDecimalVal);
    }

    private void runJdk7Number() {
        int binaryValue = 0b10001010010;
        int millionValue = 1_000_000;

        System.out.println(binaryValue);
        System.out.println(millionValue);
    }
}
