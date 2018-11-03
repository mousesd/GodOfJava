package net.homenet;

public class Main {

    public static void main(String[] args) {
        OverTimeManager manager = new OverTimeManager();
        int amount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        System.out.println(amount);
    }
}
