class Mythread22 implements Runnable
{
    @Override
    public void run() {
        System.out.println("hello");
    }
}


public class ThreadMethods {
    public static void main(String[] args) {
        Thread t1=new Thread(new Mythread22(),"okay");
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        t1.setPriority(2);
        t1.setPriority(Thread.MAX_PRIORITY-2);
        System.out.println(t1.getPriority());
        //t1.start();
        System.out.println(t1.isAlive());
        System.out.println(t1.getState());

    }




}
