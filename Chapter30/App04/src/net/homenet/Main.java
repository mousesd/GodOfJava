package net.homenet;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runNonReifiableSample();
    }

    private void runNonReifiableSample() {
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("a");
        Collections.addAll(arrayLists, stringArrayList);
        System.out.println(arrayLists);
    }
}
