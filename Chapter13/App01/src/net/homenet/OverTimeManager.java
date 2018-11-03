package net.homenet;

public class OverTimeManager {
    public int getOverTimeAmount(OverTimeValues value) {
        int amount = 0;
        System.out.println(value);
        switch (value) {
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 80000;
                break;
        }
        return amount;
    }
}
