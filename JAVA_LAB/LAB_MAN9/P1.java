import javax.swing.JFrame;
import javax.swing.JLabel;

// Creating JFrame object inside main()
public class P1 {
    public static void main(String[] args) {
        var myFrame = new JFrame();
        var myMsg = new JLabel("Inside Main!");

        myFrame.add(myMsg);

        myFrame.setSize(500, 400);
        myFrame.getContentPane().setBackground(new java.awt.Color(0, 202, 202));
        myFrame.setLayout(new java.awt.GridBagLayout());
        myFrame.setVisible(true);

        new Message2();
        new Message3();
    }
}

// Creating JFrame object inside constructor
class Message2 {
    Message2() {
        var myFrame = new JFrame();
        var myMsg = new JLabel("Inside constructor");

        myFrame.add(myMsg);

        myFrame.setSize(500, 400);
        myFrame.getContentPane().setBackground(new java.awt.Color(0, 202, 202));
        myFrame.setLayout(new java.awt.GridBagLayout());
        myFrame.setVisible(true);
    }
}

// Inheriting JFrame class
class Message3 extends JFrame {
    Message3() {
        var myMsg = new JLabel("Inheriting JFrame Class!");
        add(myMsg);

        setSize(500, 400);
        getContentPane().setBackground(new java.awt.Color(0, 202, 202));
        setLayout(new java.awt.GridBagLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}