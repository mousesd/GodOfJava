package net.homenet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.runServerSocket();
    }

    private void runServerSocket() {
        ServerSocket server = null;
        Socket client = null;

        try {
            server = new ServerSocket(9999);
            while (true) {
                System.out.println("Server: Waiting for request.");
                client = server.accept();
                System.out.println("Server: Accepted.");

                InputStream stream = client.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while ((data = reader.readLine()) != null) {
                    receivedData.append(data);
                }

                System.out.println("Received data: " + receivedData);
                reader.close();
                stream.close();
                client.close();

                if (receivedData.toString().equals("EXIT")) {
                    System.out.println("Stop ServerSocket");
                    break;
                }
                System.out.println("--------------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
