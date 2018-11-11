package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        System.out.println(app.getMax(1, 2, 3));
        System.out.println(app.getMax(3, 1, 2));
        System.out.println(app.getMax(2, 3, 1));
        System.out.println(app.getMax("a", "b", "c"));
        System.out.println(app.getMax("b", "c", "a"));
        System.out.println(app.getMax("a", "b", "c"));

        System.out.println(app.getMin(1, 2, 3));
        System.out.println(app.getMin(3, 1, 2));
        System.out.println(app.getMin(2, 3, 1));
        System.out.println(app.getMin("a", "b", "c"));
        System.out.println(app.getMin("b", "c", "a"));
        System.out.println(app.getMin("a", "b", "c"));
    }

    @SafeVarargs
    private final <T extends Comparable<T>> T getMax(T... args) {
        T max = args[0];
        for (T element : args) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    @SafeVarargs
    private final <T extends Comparable<T>> T getMin(T... args) {
        T min = args[0];
        for (T element : args) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
}
