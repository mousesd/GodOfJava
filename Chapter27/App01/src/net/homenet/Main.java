package net.homenet;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        String fileName = "/Users/mousesd/Documents/Java/GodOfJava/text/serialize.obj";
        SerializeDTO dto = new SerializeDTO("GodOfJava", 1, true, 100);
        app.saveObject(fileName, dto);
        app.loadObject(fileName);
    }

    private void saveObject(String fileName, SerializeDTO dto) {
        //FileOutputStream fileOutputStream = null;
        //ObjectOutputStream objectOutputStream = null;
        //
        //try {
        //    fileOutputStream = new FileOutputStream(fileName);
        //    objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //    objectOutputStream.writeObject(dto);
        //    System.out.println("Write success");
        //} catch (IOException e) {
        //    e.printStackTrace();
        //} finally {
        //    if (objectOutputStream != null) {
        //        try {
        //            objectOutputStream.close();
        //        } catch (IOException e1) {
        //            e1.printStackTrace();
        //        }
        //    }
        //
        //    if (fileOutputStream != null) {
        //        try {
        //            fileOutputStream.close();
        //        } catch (IOException e1) {
        //            e1.printStackTrace();
        //        }
        //    }
        //}

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(dto);
            System.out.println("Write success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadObject(String fileName) {
        //FileInputStream fileInputStream = null;
        //ObjectInputStream objectInputStream = null;
        //
        //try {
        //    fileInputStream = new FileInputStream(fileName);
        //    objectInputStream = new ObjectInputStream(fileInputStream);
        //    SerializeDTO dto = (SerializeDTO) objectInputStream.readObject();
        //    System.out.println(dto);
        //} catch (IOException | ClassNotFoundException e) {
        //    e.printStackTrace();
        //} finally {
        //    if (objectInputStream != null) {
        //        try {
        //            objectInputStream.close();
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }
        //    }
        //
        //    if (fileInputStream != null) {
        //        try {
        //            fileInputStream.close();
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }
        //    }
        //}

        try (
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            SerializeDTO dto = (SerializeDTO) objectInputStream.readObject();
            System.out.println(dto);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
