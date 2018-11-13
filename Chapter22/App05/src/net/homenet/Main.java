package net.homenet;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.stackClassSample();
    }

    private void stackClassSample() {
        Stack<Integer> intStack = new Stack<>();

        System.out.println("push()");
        for (int count = 0; count < 5; count++) {
            intStack.push(count);
            System.out.println(intStack.peek());
        }
        System.out.println("Size=" + intStack.size());

        System.out.println("pop()");
        int size = intStack.size();
        for (int count = 0; count < size; count++) {
            System.out.println(intStack.pop());
        }
        System.out.println("Size=" + intStack.size());
    }
}
