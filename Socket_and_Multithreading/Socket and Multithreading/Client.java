
// A Java program for a Client

import java.net.*;
import java.io.*;

public class Client {
    public Client(String address, int port) throws Exception {
        // establish a connection
        Socket socket = new Socket(address, port);
        System.out.println("Connected");

        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

        var p = new Person(33, "Alex");
        out.writeObject(p);
        System.out.println("Object Sent");

        System.out.println("Wainting For Response");

        p = (Person) input.readObject();
        System.out.println("Object Recived");
        p.printPerson();


        // close the connection
        input.close();
        out.close();
        socket.close();
    }

    public static void main(String args[]) throws Exception {
        new Client("localhost", 5000);
    }
}

// Person Object
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
