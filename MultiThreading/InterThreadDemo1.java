
class MyData
{
    int value;
    boolean flag=true;
   synchronized public void set(int a) {
        while(!flag) {
            try {
                wait();
            } catch (Exception e) {}
        }
        value=a;
        flag=false;
        notify();
    }
   synchronized public int get()  {
        int x;
        while(flag) {
            try {
                wait();
            } catch (Exception e){}
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}

class Producer extends Thread
{
    MyData data;
    Producer(MyData d)
    {
        data=d;
    }

    @Override
    public void run() {
        super.run();
        int i=1;
        while(true)
        {
            data.set(i);
            System.out.println("Producer: "+i);
            i++;
        }
    }
}
class consumer extends Thread
{
    MyData data;
    consumer(MyData d1)
    {
        data=d1;
    }

    @Override
    public void run() {
        super.run();
        while(true)
        {
            System.out.println("Consumer: "+data.get());
        }

    }
}





public class InterThreadDemo1 {
    public static void main(String[] args) {
        MyData d1=new MyData();
        Producer p=new Producer(d1);
        consumer c=new consumer(d1);
        //consumer c2=new consumer(d1);
        p.start();
        c.start();

    }
}
