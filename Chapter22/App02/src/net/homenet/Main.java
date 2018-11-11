package net.homenet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        //app.add();
        //app.addAll();
        app.addAllOther();
    }

    private void add() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        for (String string : list) {
            System.out.println(string);
        }
    }

    private void addAll() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        ArrayList<String> copyAndAdd = new ArrayList<>();
        copyAndAdd.add("0");
        copyAndAdd.addAll(list);
        for (String string : copyAndAdd) {
            System.out.println("List2 " + string);
        }
    }

    private void addAllOther() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        ArrayList<String> copyAndAdd = new ArrayList<>(list);
        copyAndAdd.add(0, "0");
        for (String string : copyAndAdd) {
            System.out.println("List2 " + string);
        }
    }
}
