import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to get HCF");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int hcf;
        for(hcf=(a>b)?a:b;hcf>=1;hcf--)
        {
            if(a%hcf==0&&b%hcf==0)
                break;
        }
        System.out.println("Hcf is "+hcf);
    }
}
