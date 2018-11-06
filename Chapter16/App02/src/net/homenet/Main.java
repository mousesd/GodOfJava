package net.homenet;

public class Main {
    public static void main(String[] args) {
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();
        inner.setValue(3);
        System.out.println("Value=" + inner.getValue());
    }
}
