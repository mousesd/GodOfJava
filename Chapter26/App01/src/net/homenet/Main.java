package net.homenet;

import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        String pathName = "/Users/mousesd/Documents/Java/GodOfJava/text";
        app.checkPath(pathName);
        app.makeDir(pathName);
        app.checkFileMethods(pathName);
        app.canFileMethods(pathName);
        app.lastModified(pathName);
    }

    private void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is exists? " + file.exists());
    }

    private void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println("Make " + pathName + " result=" + file.mkdir());
    }

    private void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is directory? " + file.isDirectory());
        System.out.println(pathName + " is file? " + file.isFile());
        System.out.println(pathName + " is hidden? " + file.isHidden());
    }

    private void canFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " can read? " + file.canRead());
        System.out.println(pathName + " can write? " + file.canWrite());
        System.out.println(pathName + " can execute? " + file.canExecute());
    }

    private void lastModified(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " last modified=" + new Date(file.lastModified()));
    }
}
