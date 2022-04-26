//Program8: Define a class to represent a bank account. Include the following members:
//        Data Members
//        1. Name of Depositors
//        2. Account Number
//        3. Type of Account
//        4. Balance amount in the Account
//        Methods
//        1. To assign initial values
//        2. To deposit an amount
//        3. To withdraw an amount after checking the balance
//        4. To display name and balance

import java.util.Scanner;

class BankAccount
{
    private String name;
    private long AC_no;
    private String ACtype;
    private float balance;

    BankAccount()
    {
        name=null;
        AC_no=0;
        ACtype=null;
        balance=0.0f;

    }

    public void deposite()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("************Please enter the following details**************");
        System.out.println("Name =");
        name=input.nextLine();
        System.out.println("Account No.=");
        AC_no=input.nextInt();
        System.out.println("select Account Type: \n 1. Saving\n 2.Current");
        int option;
        option=input.nextInt();
        switch (option)
        {
            case 1: ACtype="Saving";
                    break;
            case 2: ACtype="Current";
                    break;
            default:
                System.out.println("valid input please");
        }
        System.out.println("Enter the Ammount to deposit");
        float newBal=input.nextFloat();
        balance+=newBal;
        input.close();

    }
    public void widthraw()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        float wid_Amt=input.nextFloat();
        balance=balance-wid_Amt;
//        if(balance<=0)
//        {
//            return 0;
//        }
//        else
//        {
//            return 1;
//        }
        input.close();
    }

    public void viewAcDetails()
    {
        System.out.println("Name = "+name);
        System.out.println("Total Available Balance = "+balance);
    }






}

public class P8 {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.deposite();
        b1.viewAcDetails();
        b1.widthraw();
        b1.viewAcDetails();
    }
}
