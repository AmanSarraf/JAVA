import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.println("Enter a number to check it's perfect or not");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==a)
        {
            System.out.println("YES its a perfect number");
        }
        else
        {
            System.out.println("No the number is not perfect no.6");
        }
    }

}
