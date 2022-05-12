import java.awt.*;
import java.applet.*;
/*
<applet code = Landscape.class width=500 height=500>
</applet>
*/
public class P3 extends java.applet.Applet
{
    public void init()
    {

    }
    public void paint(Graphics g)
    {
        g.drawLine(100,400,300,400);
        g.drawLine(100,400,70,450);
        g.drawLine(300,400,350,450);
        g.drawLine(300,400,250,450);
        g.drawLine(70,450,350,450);
        g.drawLine(70,450,70,600);
        g.drawLine(250,450,250,600);
        g.drawLine(350,450,350,600);
        g.drawLine(70,600,350,600);
        setBackground(Color.black);
        setForeground(Color.white);
        g.drawOval(700,10,75,100);
        g.fillOval(700,10,75,100);
        g.drawOval(500,350,5,10);
        g.fillOval(500,350,5,10);
        g.drawOval(400,10,5,10);
        g.fillOval(400,10,5,10);
        g.drawOval(420,10,5,10);
        g.fillOval(420,10,5,10);
        g.drawOval(380,10,5,10);
        g.fillOval(380,10,5,10);
        g.drawOval(350,10,2,10);
        g.fillOval(350,10,2,10);
        g.drawOval(320,10,3,10);
        g.fillOval(320,10,3,10);
        g.drawOval(200,10,5,10);
        g.fillOval(200,10,5,10);
        g.drawOval(190,10,4,10);
        g.fillOval(190,10,4,10);
        g.drawOval(180,10,5,10);
        g.fillOval(180,10,5,10);
        g.drawOval(160,10,1,10);
        g.fillOval(160,10,1,10);
        g.drawOval(110,10,2,10);
        g.fillOval(110,10,2,10);
        g.drawOval(100,10,3,10);
        g.fillOval(100,10,3,10);
        g.drawOval(80,10,5,10);
        g.fillOval(800,10,5,10);
        g.drawOval(60,10,5,10);
        g.fillOval(60,10,5,10);
    }
}