import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

class Marquee extends JPanel {
    int x = 100, y = 125;
    String text;

    Marquee(String txt) {
        text = txt;
    }

    public void paint(Graphics a) {
        super.paint(a);
        a.drawString(text, x, y);

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        x += 10;
        if (x > this.getWidth())
            x = 0;
        repaint();
    }
}

public class P2 {
    public static void main(String[] args) {
        var frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new Marquee("Let's swing with Swing!"));
        frame.setVisible(true);
    }
}