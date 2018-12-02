package net.homenet;

@SuppressWarnings("WeakerAccess")
public class Calculate {
    private final Object lockObject = new Object();
    private int amount;

    //# 1.synchronize method
    //public synchronized void plus(int value) {
    //    amount += value;
    //}
    //
    //public synchronized void minus(int value) {
    //    amount -= value;
    //}

    //# 2.synchronize statement
    public void plus(int value) {
        synchronized (lockObject) {
            amount += value;
        }
    }

    public void minus(int value) {
        synchronized (lockObject) {
            amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }
}
