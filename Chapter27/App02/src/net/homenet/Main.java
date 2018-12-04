package net.homenet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

@SuppressWarnings("SameParameterValue")
public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runNewIOSample();
    }

    private void runNewIOSample() {
        String fileName = "/Users/mousesd/Documents/Java/GodOfJava/text/nio.txt";
        try {
            writeFile(fileName, "My first NIO sample");
            readFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeFile(String fileName, String data) throws Exception {
        FileChannel channel = new FileOutputStream(fileName).getChannel();
        byte[] bytes = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        channel.write(buffer);
        channel.close();
    }

    private void readFile(String fileName) throws Exception {
        FileChannel channel = new FileInputStream(fileName).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);

        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        channel.close();
    }
}
