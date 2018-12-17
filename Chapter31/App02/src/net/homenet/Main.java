package net.homenet;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runPathsAndPathSample1();
        app.runPathsAndPathSample2();
    }

    private void runPathsAndPathSample1() {
        Path path = Paths.get("/Users/mousesd/Documents/Java/GodOfJava/Chapter00");
        System.out.println(path.toString());
        System.out.println("Path.getFileName(): " + path.getFileName());
        System.out.println("Path.getNameCount(): " + path.getNameCount());
        System.out.println("Path.getParent(): " + path.getParent());
        System.out.println("Path.getRoot(): " + path.getRoot());
        System.out.println();
    }

    private void runPathsAndPathSample2() {
        Path path1 = Paths.get("/Users/mousesd/Documents/Java/GodOfJava/Chapter00");
        Path path2 = Paths.get("/Library");

        Path relativized = path1.relativize(path2);
        System.out.println("relativized path: " + relativized);

        Path absolute = relativized.toAbsolutePath();
        System.out.println("toAbsolutedPath path: " + absolute);

        Path normalized = absolute.normalize();
        System.out.println("nomalized path: " + normalized);

        Path resolved = path1.resolve("GodOfJava");
        System.out.println("resolved path: " + resolved);
    }
}
