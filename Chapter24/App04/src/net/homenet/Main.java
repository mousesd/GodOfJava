package net.homenet;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.propertiesSample1();
        app.propertiesSample2();
    }

    private void propertiesSample2() {
        try {
            final String fileName = "test.xml";
            File file = new File(fileName);
            FileOutputStream outputStream = new FileOutputStream(file);
            Properties setProperties = new Properties();
            setProperties.setProperty("Writer", "Lee Sangdae");
            setProperties.setProperty("WriterHome", "http://www.GodOfJava.com");
            setProperties.storeToXML(outputStream, "Basic properties file");
            outputStream.close();

            FileInputStream inputStream = new FileInputStream(file);
            Properties getProperties = new Properties();
            getProperties.loadFromXML(inputStream);
            inputStream.close();

            System.out.println(getProperties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void propertiesSample1() {
        try {
            final String fileName = "test.properties";
            File file = new File(fileName);
            FileOutputStream outputStream = new FileOutputStream(file);
            Properties setProperties = new Properties();
            setProperties.setProperty("Writer", "Lee Sangdae");
            setProperties.setProperty("WriterHome", "http://www.GodOfJava.com");
            setProperties.store(outputStream, "Basic properties file");
            outputStream.close();

            FileInputStream inputStream = new FileInputStream(file);
            Properties getProperties = new Properties();
            getProperties.load(inputStream);
            inputStream.close();

            System.out.println(getProperties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
