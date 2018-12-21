package net.homenet;

public class CalculatorImpl implements Calculator {

    @Override
    public int operator(int x, int y) {
        return x + y;
    }
}
