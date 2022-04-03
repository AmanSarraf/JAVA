import java.util.Scanner;

public class lcm {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to get lcm ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm;

        for(lcm=(a<b?a:b);lcm<=a*b;lcm++)
        {
            if(lcm%a==0&&lcm%b==0)
                break;

        }
        System.out.println("lcm  is "+lcm);



    }
}
