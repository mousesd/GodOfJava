package net.homenet;

public class Main {
    public static void main(String[] args) {
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(3);
        System.out.println("Value=" + staticNested.getValue());
    }
}
