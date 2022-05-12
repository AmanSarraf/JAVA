class ThreadGM extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Good Morning");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class ThreadH extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class ThreadW extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Welcome");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class P3
{
    public static void main (String args[]) {

        ThreadGM tgm = new ThreadGM();
        ThreadH th = new ThreadH();
        ThreadW tw = new ThreadW();
        tgm.start();
        th.start();
        tw.start();


    }
}