package net.homenet;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //main.convert();
        main.convertUTF16();
    }

    private void convert() {
        String korean = "한글";
        byte[] bytes = korean.getBytes();
        printByteArray(bytes);

        String korean2 = new String(bytes);
        System.out.println(korean2);
    }

    private void convertUTF16() {
        String korean = "한글";
        byte[] bytes = korean.getBytes(StandardCharsets.UTF_16);
        printByteArray(bytes);

        String korean2 = new String(bytes, StandardCharsets.UTF_16);
        System.out.println(korean2);
    }

    private void printByteArray(byte[] bytes) {
        System.out.println("Length=" + bytes.length);
        for (byte data : bytes)
            System.out.printf("[%s] ", data);
        System.out.println();
    }
}
