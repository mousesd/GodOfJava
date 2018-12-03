package net.homenet;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        String pathName = "/Users/mousesd/Documents/Java/GodOfJava/text";
        String fileName = "test.txt";

        app.checkFile(pathName, fileName);
        app.getFileInfo(pathName, fileName);
    }

    private void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result=" + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getFileInfo(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Absolute path=" + file.getAbsolutePath());
            System.out.println("Absolute file=" + file.getAbsoluteFile());
            System.out.println("Canonical path=" + file.getCanonicalPath());
            System.out.println("Canonical file=" + file.getCanonicalFile());

            System.out.println("Name=" + file.getName());
            System.out.println("Path=" + file.getPath());
            System.out.println("Parent=" + file.getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
