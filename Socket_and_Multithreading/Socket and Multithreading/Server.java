
// A Java program for a Server
import java.net.*;
import java.io.*;

public class Server {

    // constructor with port
    public Server(int port) throws Exception {
        // starts server and waits for a connection
        try (var server = new ServerSocket(port)) {
            System.out.println("Server started");
            while (true) {
                Socket socket = server.accept();
                System.out.println("-- Client Connected --");
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

                Thread t = new MultiClientHandler(socket, out, input);
                t.start();
            }
        }
    }

    public static void main(String args[]) throws Exception {
        new Server(5000);
    }
}

class MultiClientHandler extends Thread {

    final Socket socket;
    final ObjectOutputStream out;
    final ObjectInputStream input;

    // constructor
    public MultiClientHandler(Socket s, ObjectOutputStream out, ObjectInputStream input) {
        this.socket = s;
        this.out = out;
        this.input = input;
    }

    public void run() {
        try {
            var p = (Person) input.readObject();
            System.out.println("Object Recived");
            p.printPerson();

            p = new Person(13, "John");
            out.writeObject(p);
            System.out.println("Object Sent");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
                out.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

// Person Object
// class Person implements Serializable {
class Person implements Serializable {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID : " + id + ", Name : " + name;
    }

    public void printPerson() {
        System.out.println(this.toString());
    }
}