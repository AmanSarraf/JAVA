class Thread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 2; i++){
            System.out.println(1);
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 2; i++){
            System.out.println(2);
        }
    }
}

class Thread3 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 2; i++){
            System.out.println(3);
        }
    }
}

class Thread4 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 2; i++){
            System.out.println(4);
        }
    }
}

public class P2
{
    public static void main (String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        t1.start();
        try{
            t1.join();
        } catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        try{
            t2.join();
        } catch (Exception e){
            System.out.println(e);
        }
        t3.start();
        try{
            t3.join();
        } catch (Exception e){
            System.out.println(e);
        }
        t4.start();
    }
}