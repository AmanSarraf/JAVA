

class Mythread extends Thread
{
    public void run() {
        int i=20;
        while (i > 10) {
            System.out.println("hello");
            --i;
        }
    }
}class Mythread2 extends Thread
{
    Mythread2(){};
    Mythread2(String name)
    {
        super(name);
    }



}

class Mythread3 implements Runnable
{


    public void run()
    {

    }
}


public class Example2 {
    public static void main(String[] args) {


        Mythread t1=new Mythread();
        Thread t3=new Thread(t1,"chaman");
        Mythread2 t2=new Mythread2("Aman");
//         t1.start();
//      t2.start();

        System.out.println("Id of t3 "+t3.getId());
        System.out.println("Id of t1 "+t1.getId());
        System.out.println("Name of t3 "+t3.getName());

//t2.start();
//t1.start();



    }




}
