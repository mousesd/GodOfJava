package net.homenet;

public class DefaultMethodImpl implements DefaultMethod {
    @Override
    public String getName() {
        return "Name";
    }

    @Override
    public int getSince() {
        return 10;
    }
}
