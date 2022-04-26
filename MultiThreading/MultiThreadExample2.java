import java.util.Scanner;

class Print
{
   synchronized void display(String s)
    {
        for (int i = 0; i < s.length() ; i++) {
            System.out.println(s.charAt(i));

        }

    }
}
class MT1 extends Thread
{
    Print p;
    MT1(Print p1){
        p=p1;
    }

    Scanner input=new Scanner(System.in);
    String message=input.nextLine();

    @Override
    public void run() {
        super.run();
        p.display(message);
    }
}class MT2 extends Thread
{
    Print p;
    MT2(Print p1){
        p=p1;
    }

    Scanner input=new Scanner(System.in);
    String message=input.nextLine();

    @Override
    public void run() {
        super.run();
        p.display(message);
    }
}



public class MultiThreadExample2 {
    public static void main(String[] args) {
        Print p=new Print();
        MT1 t1=new MT1(p);
        MT2 t2=new MT2(p);
        t1.start();
        t2.start();

    }


}
