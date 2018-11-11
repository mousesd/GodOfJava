package net.homenet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        System.out.println("size(), get() method sample");
        app.sizeAndGetSample();

        System.out.println("\r\ntoArray() method sample");
        app.toArraySample();
    }

    private void sizeAndGetSample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (int index = 0; index < list.size(); index++) {
            System.out.println("list.get(" + index + ")=" + list.get(index));
        }
    }

    private void toArraySample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        String[] strings = list.toArray(new String[0]);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
