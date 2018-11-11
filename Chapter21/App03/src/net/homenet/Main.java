package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        WildcardGeneric<Car> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Car("Mustang"));
        app.boundedWildcardMethod(wildcard);

        WildcardGeneric<Bus> busWildcard = new WildcardGeneric<>();
        busWildcard.setWildcard(new Bus("6900"));
        app.boundedWildcardMethod(busWildcard);
    }

    private void boundedWildcardMethod(WildcardGeneric<? extends Car> wildcard) {
        Car value = wildcard.getWildcard();
        System.out.println(value);
    }
}
