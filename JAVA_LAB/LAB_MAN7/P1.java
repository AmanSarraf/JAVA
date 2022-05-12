/*
Suppose there are 5 workers and carry out a work at the same time. Develop a program
which shows this scenario with the concept of multithreading.
Hint.
1. Create 5 workers with the help of for loop
2. Use Thread.sleep() method that pauses the thread for a custom defined period of time.
When we pause a Thread, this would simulate that Thread being busy doing some sort of
actual work.
3. Suppose 5 workers works for 5 seconds each , then a total of 5 seconds would be the
total time for all 5 workers if we use the concept of multithreading .
*/
class Worker extends Thread {

    public Worker(String s)
    {
        setName(s);
    }
    public void run() {
        try{
            for (int i = 0; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Currently Working");
                Thread.sleep(5000);
            }}
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }

}

public class P1 {
    public static void main(String[] args) {
        Thread w1 = new Worker("Worker 1");
        Thread w2 = new Worker("Worker 2");
        Thread w3 = new Worker("Worker 3");
        Thread w4 = new Worker("Worker 4");
        Thread w5 = new Worker("Worker 5");
        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();

    }
}

