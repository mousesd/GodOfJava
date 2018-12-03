package net.homenet;

import java.io.*;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        String fileName = "/Users/mousesd/Documents/Java/GodOfJava/text/number.txt";

        app.writeFile(fileName);
        app.readFile(fileName);
    }

    private void readFile(String fileName) {
        FileReader in = null;
        BufferedReader bufferedReader = null;

        try {
            in = new FileReader(fileName);
            bufferedReader = new BufferedReader(in);

            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
            System.out.println("Read success!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
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
