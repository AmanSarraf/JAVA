//design an ATM machine using Multithreading
class ATM
{
 synchronized public void checkBalance(String name)
{
    System.out.println(name+"checking");
    try{Thread.sleep(1000);}catch (Exception e){}
    System.out.println("Balance");
}
 synchronized public void widthraw(String name,int amount)
{
    System.out.println(name+"widthrawing....");
    try{Thread.sleep(1000);}catch (Exception e){}
    System.out.println(amount);
}
}
class customer extends Thread
{

    String name;
    int amount;
    ATM atm;
    customer(){}
    customer(String s,ATM a,int amt)
    {
        name=s;
        atm=a;
        amount=amt;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.widthraw(name,amount);
    }
    public void run()
    {
        useATM();
    }


}

public class Challenge1 {
    public static void main(String[] args) {
        ATM atm=new ATM();
        customer c1=new customer("Aman",atm,2000);
        customer c2=new customer("Raman",atm,4000);
        c1.start();
        c2.start();

    }
}
