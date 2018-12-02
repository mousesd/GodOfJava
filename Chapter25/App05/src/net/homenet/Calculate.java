package net.homenet;

@SuppressWarnings("WeakerAccess")
public class Calculate {
    private int amount;

    public synchronized void plus(int value) {
        amount += value;
    }

    public synchronized void minus(int value) {
        amount -= value;
    }

    public int getAmount() {
        return amount;
    }
}
