
// A Java program for a Server
import java.net.*;
import java.io.*;

public class Server {
    static int countClient = 0;

    // constructor with port
    public Server(int port) {
        // starts server and waits for a connection
        try (var server = new ServerSocket(port)) {
            System.out.println("Server started");
            while (true) {
                Socket socket = server.accept();
                System.out.println("-- Client : " + ++countClient + " Connected --");
                DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
                Thread t = new MultiClientHandler(socket, dis, countClient);
                t.start();
            }
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        new Server(5000);
    }
}

class MultiClientHandler extends Thread {

    final Socket socket;
    final DataInputStream dis;
    final int clientNumber;

    // constructor
    public MultiClientHandler(Socket s, DataInputStream dis, int clientNumber) {
        this.socket = s;
        this.dis = dis;
        this.clientNumber = clientNumber;
    }

    public void run() {
        String line = "";

        while (!line.equals("Over")) {
            try {
                line = (String) dis.readUTF();
                System.out.println("Client " + clientNumber + " : " + line);
            } catch (IOException i) {
                System.out.println(i);
                break;
            }
        }

        System.out.println("Closing connection : " + clientNumber);
        try {
            dis.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}