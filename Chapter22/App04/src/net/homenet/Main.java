package net.homenet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        System.out.println("remove(index) sample");
        app.removeSample1();

        System.out.println("\r\nremove(Object) sample");
        app.removeSample2();

        System.out.println("\r\nremoveAll() sample");
        app.removeAllSample();
    }

    private void removeSample1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        System.out.println("Removed " + list.remove(0));
        for (int index = 0; index < list.size(); index++) {
            System.out.println("list.get(" + index + ") = " + list.get(index));
        }
    }

    private void removeSample2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        System.out.println("Removed " + list.remove("A"));
        for (int index = 0; index < list.size(); index++) {
            System.out.println("list.get(" + index + ") = " + list.get(index));
        }
    }

    private void removeAllSample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        ArrayList<String> removeList = new ArrayList<>();
        removeList.add("A");
        list.removeAll(removeList);
        for (int index = 0; index < list.size(); index++) {
            System.out.println("list.get(" + index + ") = " + list.get(index));
        }
    }
}
