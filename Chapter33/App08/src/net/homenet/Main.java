package net.homenet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runFilterMethodSample();
    }

    private void runFilterMethodSample() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("요다", 43, 99));
        students.add(new Student("만두", 30, 71));
        students.add(new Student("건빵", 32, 81));

        students.stream()
            .filter(student -> student.getScore() >= 80)
            .map(Student::getName)
            .forEach(System.out::println);
    }
}
