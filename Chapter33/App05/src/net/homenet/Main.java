package net.homenet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runForEachSample();
    }

    private void runForEachSample() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("요다", 43, 99, 10));
        students.add(new Student("만두", 30, 71, 85));
        students.add(new Student("건빵", 32, 81, 75));

        //students.stream().forEach(student -> System.out.println(student.getName()));
        //students.forEach(student -> System.out.println(student.getName()));
        //students.stream().map(student -> student.getName()).forEach(s -> System.out.println(s));
        students.stream().map(Student::getName).forEach(System.out::println);
    }
}
