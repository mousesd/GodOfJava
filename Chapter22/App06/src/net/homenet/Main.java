package net.homenet;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class Main {
    private ArrayList<ArrayList<Integer>> gradeHeights;

    public static void main(String[] args) {
        Main app = new Main();
        app.setData();

        for (int classNo = 1; classNo < 6; classNo++) {
            app.printHeight(classNo);
        }

        System.out.println();
        for (int classNo = 1; classNo < 6; classNo++) {
            app.printAverage(classNo);
        }
    }

    private void setData() {
        ArrayList<Integer> no1Heights = new ArrayList<>(List.of(170, 180, 173, 175, 177));
        ArrayList<Integer> no2Heights = new ArrayList<>(List.of(160, 165, 167, 186));
        ArrayList<Integer> no3Heights = new ArrayList<>(List.of(158, 177, 187, 176));
        ArrayList<Integer> no4Heights = new ArrayList<>(List.of(173, 182, 181));
        ArrayList<Integer> no5Heights = new ArrayList<>(List.of(170, 180, 165, 177, 172));

        gradeHeights = new ArrayList<>();
        gradeHeights.add(no1Heights);
        gradeHeights.add(no2Heights);
        gradeHeights.add(no3Heights);
        gradeHeights.add(no4Heights);
        gradeHeights.add(no5Heights);
    }

    private void printHeight(int classNo) {
        if (classNo > gradeHeights.size()) return;

        ArrayList<Integer> noHeights = gradeHeights.get(classNo - 1);
        System.out.println("Class No." + classNo);
        for (Integer height : noHeights) {
            System.out.println(height);
        }
    }

    private void printAverage(int classNo) {
        if (classNo > gradeHeights.size()) return;

        ArrayList<Integer> noHeights = gradeHeights.get(classNo - 1);
        double sum = 0;
        for (Integer height : noHeights) {
            sum += height;
        }
        System.out.println("Class No." + classNo + " average: " + (sum / noHeights.size()));
    }
}
