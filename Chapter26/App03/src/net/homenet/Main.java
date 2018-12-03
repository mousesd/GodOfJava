package net.homenet;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        String pathName = "/Users/mousesd/Documents/Java/GodOfJava/text";
        app.runListSample(pathName);
    }

    private void runListSample(String pathName) {
        File file = new File(pathName);

        //File[] files = file.listFiles();
        //File[] files = file.listFiles((dir, name) -> name.endsWith(".jpg"));
        File[] files = file.listFiles(pathname -> {
            if (pathname.isFile()) {
                return pathname.getName().endsWith(".jpg");
            } else {
                return false;
            }
        });

        assert files != null;
        for (File tempFile : files) {
            System.out.println(tempFile.getName());
        }
    }
}
