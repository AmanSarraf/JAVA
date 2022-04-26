//Program5: Admission to a professional course is subject to the following conditions:
//        Marks in mathematics>=60
//        Marks in physics>=50
//        Marks in chemistry>=40
//        Total in all subjects >= 200 (or)
//        Total in mathematics and physics>=150 given the marks in the 3 subjects.
//        Write a program to process the application to list the eligible candidates.


import java.util.Scanner;

public class P5 {

    public static void result(int m,int p,int c)
    {
        if(m>=60&&p>=50&&c>=40&&(m+p+c)>=200||(m+p)>=150)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not eligible");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter your details");
        Scanner input=new Scanner(System.in);
        int m,p,c;
        System.out.println("Math=");
        m=input.nextInt();
        System.out.println("physics=");
        p=input.nextInt();
        System.out.println("chemistry=");
        c=input.nextInt();

        result(m,p,c);

    }
}
