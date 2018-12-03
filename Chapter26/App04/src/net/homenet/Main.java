package net.homenet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        String fileName = "/Users/mousesd/Documents/Java/GodOfJava/text/number.txt";

        app.writeFile(fileName);
    }

    private void writeFile(String fileName) {
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;

        try {
            writer = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(writer);
            for (int count = 0; count < 10; count++) {
                bufferedWriter.write(Integer.toString(count));
                bufferedWriter.newLine();
            }
            System.out.println("Write success!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
