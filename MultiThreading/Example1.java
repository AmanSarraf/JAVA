
class  A implements Runnable
{
    public void run()
    {
        //int i=0;
        for (int j = 1; j <=10 ; j++) {
            System.out.println("Thread in A "+j);
        }
    }
}class  B implements Runnable
{
    public void run()
    {
        //int i=0;
        for (int j = 1; j <=10 ; j++) {
            System.out.println("Thread in B "+j*2);
        }
    }
}


public class Example1 {
    public static void main(String[] args) {
        Thread t1=new Thread(new A());
        Thread t2=new Thread(new B());
        t1.start();
        t2.start();

    }
}
