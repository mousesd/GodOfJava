package net.homenet;

import java.util.Optional;
import java.util.function.Supplier;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) throws Throwable {
        Main app = new Main();

        app.runOptionalSample1();
        System.out.println();

        Optional<String> optional1 = Optional.of("Optional");
        app.runOptionalSample2(optional1);
        System.out.println();

        Optional<String> optional2 = Optional.ofNullable(null);
        app.runOptionalSample3(optional2);
    }

    private void runOptionalSample1() {
        System.out.println(Optional.of("present").isPresent());
        System.out.println(Optional.ofNullable(null).isPresent());
    }

    private void runOptionalSample2(Optional<String> optional) {
        System.out.println(optional.get());
    }

    private void runOptionalSample3(Optional<String> optional) throws Throwable {
        System.out.println(optional.orElse("Default value"));
        System.out.println(optional.orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                return "Supplier<T> get() method";
            }
        }));
        System.out.println(optional.orElseThrow(new Supplier<Throwable>() {
            @Override
            public Throwable get() {
                return new Throwable("Supplier<T> get() method");
            }
        }));
    }
}
