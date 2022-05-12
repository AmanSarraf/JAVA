import java.io.*;
import java.net.*;

class MultiClientHandler extends Thread {

    final DataInputStream dis;
    final DataOutputStream dos;
    final Socket socket;

    // constructor
    public MultiClientHandler(Socket s, DataInputStream dis, DataOutputStream dos) {
        this.socket = s;
        this.dis = dis;
        this.dos = dos;
    }

    public void run() {
        String received;
        while (true) {
            try {
                dos.writeUTF("Send message to server (Type Exit to terminate connection)");
                received = dis.readUTF();

                if (received.equals("Exit")) {
                    System.out.println("Client " + this.socket + " sends exit...");
                    System.out.println("Closing the connection");
                    this.socket.close();
                    System.out.println("Connection Closed");
                    break;
                }
                dos.writeUTF(received);
                System.out.println("Response of client: " + received);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        try {
            this.dis.close();
            this.dos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}