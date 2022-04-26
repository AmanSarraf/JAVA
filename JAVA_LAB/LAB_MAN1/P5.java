import java.util.Scanner;


public class P5 {

    static void check(int a)
    {
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int n=scan.nextInt();
        check(n);
    }
}
