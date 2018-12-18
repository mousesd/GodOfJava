package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runDefaultMethodSample();
    }

    private void runDefaultMethodSample() {
        DefaultMethod defaultMethod = new DefaultMethodImpl();
        System.out.println("Name=" + defaultMethod.getName());
        System.out.println("Since=" + defaultMethod.getSince());
        System.out.println("Email=" + defaultMethod.getEmail());
    }
}
