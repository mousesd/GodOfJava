package net.homenet;

public class Main {
    public static void main(String[] args) {
        //# 1.
        //System.out.println(OverTimeValue.FIVE_HOUR);
        //System.out.println(OverTimeValue.FIVE_HOUR.getAmount());

        //# 2.
        OverTimeValue[] values = OverTimeValue.values();
        for (OverTimeValue value : values) {
            System.out.println(value);
        }
    }
}
