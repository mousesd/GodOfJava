package net.homenet;

import java.time.temporal.Temporal;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runPredicateSample();
    }

    private void runPredicateSample() {
        Predicate<String> predicateLength5 = (s) -> s.length() > 5;
        String godOfJava = "GodOfJava";
        String godJava = "GodJava";

        System.out.println(predicateLength5.test(godOfJava));
        System.out.println(predicateLength5.test(godJava));
        System.out.println();

        System.out.println(predicateLength5.negate().test(godOfJava));
        System.out.println(predicateLength5.negate().test(godJava));
        System.out.println();

        Predicate<String> predicateContain = (s) -> s.contains("Of");
        System.out.println(predicateLength5.and(predicateContain).test(godOfJava));
        System.out.println(predicateLength5.and(predicateContain).test(godJava));
        System.out.println();

        System.out.println(predicateLength5.or(predicateContain).test(godOfJava));
        System.out.println(predicateLength5.or(predicateContain).test(godJava));
    }
}
