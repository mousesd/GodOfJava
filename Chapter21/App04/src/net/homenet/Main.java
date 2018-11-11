package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        WildcardGeneric<String> stringWildcard = new WildcardGeneric<>();
        app.genericMethod1(stringWildcard, "Data");

        WildcardGeneric<Bus> busWildcard = new WildcardGeneric<>();
        app.genericMethod2(busWildcard, new Bus("6900"));
    }

    private <T> void genericMethod1(WildcardGeneric<T> wildcard, T addValue) {
        wildcard.setWildcard(addValue);
        T value = wildcard.getWildcard();
        System.out.println(value);
    }

    private <T extends Car> void genericMethod2(WildcardGeneric<T> wildcard, T addValue) {
        wildcard.setWildcard(addValue);
        T value = wildcard.getWildcard();
        System.out.println(value);
    }
}
