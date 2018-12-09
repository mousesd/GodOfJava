package net.homenet;

import java.io.IOException;
import java.net.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        for (int count = 0; count < 3; count++) {
            app.runUdpClient("I liked UDP " + new Date());
        }
        app.runUdpClient("EXIT");
    }

    private void runUdpClient(String sendData) {
        try (DatagramSocket client = new DatagramSocket()) {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            byte[] bytes = sendData.getBytes();

            DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, address, 9999);
            client.send(packet);
            System.out.println("Client: Send data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
