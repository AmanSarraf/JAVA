class Prime implements Runnable{

    public void run() {
        try{
            for(int i=1;i<10;i++){

                if(i==2||i==3||i==5||i==7)
                    System.out.println("Prime numbers:- "+i);
            }
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception Occur.\n");
        }
    }
}
class NonPrime extends Thread{
    public void run() {
        try{
            for(int i=1;i<10;i++){

                if(i==4||i==6||i==8||i==9||i==10)
                    System.out.println("Non prime numbers:- "+i);
            }
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception Occur.\n");
        }
    }
}
public class P5
{
    public static void main(String[] args) {


        Prime  p=new Prime();
        NonPrime np=new NonPrime();

        Thread t1=new Thread(p);
        Thread t2=new Thread(np);

        t2.start();
        t1.start();

    }
}
