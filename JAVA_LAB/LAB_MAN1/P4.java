import java.util.Scanner;

 class P4 {
    public static void main(String[] args) {


       Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
     int a=scan.nextInt();
     pattern(a);




    }
    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
