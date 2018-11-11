package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard("A");
        app.wildcardMethod(wildcard);
    }

    //# 1.
    //private void wildcardMethod(WildcardGeneric<String> wildcard) {
    //    String value = wildcard.getWildcard();
    //    System.out.println(value);
    //}

    //# 2.
    private void wildcardMethod(WildcardGeneric<?> wildcard) {
        Object value = wildcard.getWildcard();
        System.out.println(value);
    }
}
