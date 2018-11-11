package net.homenet;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();

        System.out.println("java.version=" + System.getProperty("java.version"));
        System.out.println("JAVA_HOME=" + System.getenv("JAVA_HOME"));

        System.out.println("Milli seconds=" + (System.currentTimeMillis() - startTime));
        System.out.println("Nano seconds=" + (System.nanoTime() - startNanoTime));
    }
}
