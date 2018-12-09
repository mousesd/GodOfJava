package net.homenet;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        for (int count = 0; count < 3; count++) {
            app.runClientSocket("I liked java at " + new Date());
        }

        app.runClientSocket("EXIT");
    }

    private void runClientSocket(String sendData) {
        Socket socket = null;

        try {
            System.out.println("Client: Connecting...");
            socket = new Socket("127.0.0.1", 9999);
            System.out.println("Client: Connect status=" + socket.isConnected());

            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(stream);

            byte[] bytes = sendData.getBytes();
            bufferedOutputStream.write(bytes);
            System.out.println("Client: Send data");
            bufferedOutputStream.close();
            stream.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
