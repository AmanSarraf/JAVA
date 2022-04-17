import java.util.Scanner;

///this program is to demontrate the issue with multithreading when 2 threads in a program trys to access same resource
//synchronously

//Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
//
//        Java Synchronization is better option where we want to allow only one thread to access the shared resource.


class Account
{
  private int balance;
  Account(){}
  Account(int num)
  {
      balance=num;
  }
  public boolean inSufficientBalanc(int wid)
  {
      if(balance>wid)
          return true;
      else
          return false;
  }

  public void widthraw(int amount)
  {
      balance-=amount;
      System.out.println(""+amount+" widhrawed,\n Remaining balance :"+balance);
  }


}
class Customer implements Runnable
{
   Account account;
   String name;
   public Customer(Account account,String name)
   {
       this.account=account;
       this.name=name;
   }

    @Override
    public void run() {
        Scanner input=new Scanner(System.in);
        synchronized (account)
        {
            int wid;
            System.out.println(name + "Enter Amount to widthraw");
            wid = input.nextInt();
            if (account.inSufficientBalanc(wid))
                account.widthraw(wid);
            else
                System.out.println(name + "Insufficient balance available");
        }
    }
}


public class SyncThread {

    public static void main(String[] args)
    {
        Account a1=new Account(1000);
        Customer aman=new Customer(a1,"Aman"),raman=new Customer(a1,"Raman");
        Thread t1=new Thread(aman);
        Thread t2=new Thread(raman);
        t1.run();



    }






}
