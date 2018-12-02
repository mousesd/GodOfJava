package net.homenet;

public class AmountThread extends Thread {
    private Calculate calculate;
    private boolean isAdd;

    public AmountThread(Calculate calculate, boolean isAdd) {
        this.calculate = calculate;
        this.isAdd = isAdd;
    }

    @Override
    public void run() {
        for (int count = 0; count < 10000; count++) {
            if (isAdd) {
                calculate.plus(1);
            } else {
                calculate.minus(1);
            }
        }
    }
}
