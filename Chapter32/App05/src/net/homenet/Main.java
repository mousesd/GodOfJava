package net.homenet;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runStringJoinerSample();
    }

    private void runStringJoinerSample() {
        String[] strings = new String[]{"StudyHard", "GodOfJava", "Book"};

        StringJoiner joiner1 = new StringJoiner(", ");
        for (String string : strings) {
            joiner1.add(string);
        }
        System.out.println(joiner1);

        StringJoiner joiner2 = new StringJoiner(", ", "(", ")");
        for (String string : strings) {
            joiner2.add(string);
        }
        System.out.println(joiner2);

        //# Use lambda express
        String result = Arrays.stream(strings).collect(Collectors.joining(", ", "(", ")"));
        System.out.println(result);
    }
}
