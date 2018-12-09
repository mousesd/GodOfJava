package net.homenet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "/fileName";
        String encoding = "";

        //# Java 6
        //Scanner scanner = null;
        //try {
        //    scanner = new Scanner(new File(fileName), encoding);
        //    System.out.println(scanner.nextLine());
        //} catch (IllegalArgumentException e) {
        //    e.printStackTrace();
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //} catch (NullPointerException e) {
        //    e.printStackTrace();
        //} catch (Exception e) {
        //    e.printStackTrace();
        //} finally {
        //    if (scanner != null) {
        //        scanner.close();
        //    }
        //}

        //# Java 7 #1)
        //Scanner scanner = null;
        //try {
        //    scanner = new Scanner(new File(fileName), encoding);
        //    System.out.println(scanner.nextLine());
        //} catch (IllegalArgumentException | FileNotFoundException | NullPointerException e) {
        //    e.printStackTrace();
        //} finally {
        //    if (scanner != null) {
        //        scanner.close();
        //    }
        //}

        //# Java 7 #2) try-with-resource
        try (Scanner scanner = new Scanner(new File(fileName), encoding)) {
            System.out.println(scanner.nextLine());
        } catch (IllegalArgumentException | FileNotFoundException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
