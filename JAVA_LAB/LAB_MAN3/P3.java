// WAP to calculate the hypotenuse of a triangle. (Hint: Math.
//sqrt(var_name/value)

import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int l,b,h;
        System.out.println("Enter the  length and bredth of triangle");
        l=s1.nextInt();
        b=s1.nextInt();
        h=(l*l)+(b*b);
        System.out.println("The Hypotenous is "+ Math.sqrt(h)  );
    }

}
