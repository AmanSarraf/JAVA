import java.util.Scanner;

//Program8: Write a simple program to take 3 inputs by user and calculate the greatest no in
//all.
public class P8 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        greatest(a,b,c);



    }
    static void greatest(int x,int y,int z)
    {
        int grt;
        if(x>y&&x>z)
        {
            grt=x;
        }
        else if(y>x&&y>z)
        {
            grt=y;
        }
        else
        {
            grt=z;
        }

        System.out.println(" Greatest number is  "+grt);
    }

}
