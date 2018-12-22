package net.homenet;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runStaticMethodReference();
        System.out.println();

        app.runInstanceMethodReference();
        System.out.println();

        app.runConstructorMethodReference();
    }

    /**
     * static method reference
     */
    private void runStaticMethodReference() {
        String[] array = {"a", "b", "c"};
        Stream.of(array).forEach(Main::println);
    }

    private static void println(String value) {
        System.out.println(value);
    }

    /**
     * instance method reference
     */
    private void runInstanceMethodReference() {
        String[] array = {"b", "c", "a"};
        Arrays.sort(array, String::compareToIgnoreCase);
        Arrays.stream(array).forEach(System.out::println);
    }

    private void runConstructorMethodReference() {
        MakeString makeString = String::new;
        System.out.println(makeString.fromByte(new char[] {'a', 'b', 'c'}));
    }

    private interface MakeString {
        String fromByte(char[] chars);
    }
}
