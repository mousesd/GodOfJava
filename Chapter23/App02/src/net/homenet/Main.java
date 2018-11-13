package net.homenet;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.LinkedListSample();
    }

    private void LinkedListSample() {
        LinkedList<String> link = new LinkedList<>();
        link.add("A");
        link.add("B");
        System.out.println(link);

        link.offerFirst("C");
        System.out.println(link);

        link.addLast("D");
        System.out.println(link);

        link.offer("E");
        System.out.println(link);

        link.offerLast("F");
        System.out.println(link);

        link.push("G");
        System.out.println(link);

        link.add(0, "H");
        System.out.println(link);
    }
}
