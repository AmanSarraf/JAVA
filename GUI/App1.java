import javax.swing.*;

class Addition extends JFrame
{

    JLabel jl1,jl2,jl3,jl4;
    JTextField Jt1,Jt2,Jt3;
    JButton result;

    Addition(){}
    Addition(String title)
    {
        super(title);
    }
    public void setComponent()
    {
        jl1=new JLabel("Addition Program");
        jl2=new JLabel("NUM 1:");
        jl3=new JLabel("NUM 2");
        jl4=new JLabel("Result");
        Jt1=new JTextField();
        Jt2=new JTextField();
        Jt3=new JTextField();
        result=new JButton("Click here");
        setLayout(null);
        jl1.setBounds(240,20,200,30);
        jl2.setBounds(50,50,200,30);
        Jt1.setBounds(150,50,200,30);
        jl3.setBounds(50,80,200,30);
        Jt2.setBounds(150,80,200,30);
        jl4.setBounds(50,110,200,30);
        Jt3.setBounds(150,110,200,30);
        result.setBounds(240,300,200,30);
        add(jl1);
        add(jl2);
        add(jl3);
        add(jl4);
        add(Jt1);
        add(Jt2);
        add(Jt3);
        add(result);
    }

    


}
public class App1 {
    public static void main(String[] args)
    {
        Addition add=new Addition("add app");
        add.setComponent();
        add.setVisible(true);
        add.setSize(600,400);
        add.setDefaultCloseOperation(add.EXIT_ON_CLOSE);


    }
}
