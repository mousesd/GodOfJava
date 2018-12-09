package net.homenet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runUdpServer();
    }

    private void runUdpServer() {
        try (DatagramSocket server = new DatagramSocket(9999)) {
            int length = 256;
            byte[] buffer = new byte[length];
            DatagramPacket packet = new DatagramPacket(buffer, length);

            while (true) {
                System.out.println("Server: Waiting for request");
                server.receive(packet);

                int receivedLength = packet.getLength();
                System.out.println("Server: Data received. length=" + receivedLength);

                String receivedData = new String(packet.getData(), 0, receivedLength);
                System.out.println("Server: Received data=" + receivedData);

                if (receivedData.equals("EXIT")) {
                    System.out.println("Server: Stop server");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
