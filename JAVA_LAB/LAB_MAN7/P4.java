class MyThread extends Thread {
    public void run() {
        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
    }
}

public class P4
{
    public static void main(String [] args)
    {
        Thread th1 = new MyThread();
        Thread th2 = new MyThread();
        th1.run();
        th2.run();
    }
}



/*Output :-
In run method; thread name is: main
In run method; thread name is: main 

Explanation: The correct way to invoke a thread is to call the start() method on a Thread object.
If we directly call the run() method, the method will run just like any other method.
(in other words, it will execute sequentially in the same thread without running as a separate thread).
*/