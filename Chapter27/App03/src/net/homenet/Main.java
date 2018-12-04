package net.homenet;

import java.nio.IntBuffer;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        //app.runBufferSample1();
        app.runBufferSample2();
    }

    private void runBufferSample1() {
        IntBuffer buffer = IntBuffer.allocate(1024);
        for (int count = 0; count < 100; count++) {
            buffer.put(count);
        }

        System.out.println("Buffer capacity=" + buffer.capacity());
        System.out.println("Buffer limit=" + buffer.limit());
        System.out.println("Buffer position=" + buffer.position());

        buffer.flip();
        System.out.println("Buffer fliped!!!");
        System.out.println("Buffer capacity=" + buffer.capacity());
        System.out.println("Buffer limit=" + buffer.limit());
        System.out.println("Buffer position=" + buffer.position());
    }

    private void printBufferStatus(String job, IntBuffer buffer) {
        System.out.println("Buffer " + job + " !!!");
        System.out.format("Buffer position=%d remaining=%d limit=%d\n"
            , buffer.position()
            , buffer.remaining()
            , buffer.limit());
    }

    private void runBufferSample2() {
        IntBuffer buffer = IntBuffer.allocate(1024);

        buffer.get();
        printBufferStatus("get", buffer);

        buffer.mark();
        printBufferStatus("make", buffer);

        buffer.get();
        printBufferStatus("get", buffer);

        buffer.reset();
        printBufferStatus("reset", buffer);

        buffer.rewind();
        printBufferStatus("rewind", buffer);

        buffer.clear();
        printBufferStatus("clear", buffer);
    }
}
