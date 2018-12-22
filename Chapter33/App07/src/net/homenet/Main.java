package net.homenet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runMapMethodSample1();
        System.out.println();

        app.runMapMethodSample2();
    }

    private void runMapMethodSample1() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integers.stream().map(integer -> integer * 3).forEach(System.out::println);
    }

    private void runMapMethodSample2() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("요다", 43, 99, 10));
        students.add(new Student("만두", 30, 71, 85));
        students.add(new Student("건빵", 32, 81, 75));

        List<String> nameList = students.stream()
            .map(Student::getName)
            .collect(Collectors.toList());
        System.out.println(nameList);
    }
}
