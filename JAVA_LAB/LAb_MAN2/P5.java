import java.util.Scanner;

//Program5: WAP to find out the character of given ASCII value
public class P5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Ascii");
        int ch= scan.nextInt();

        ascii(ch);

    }
    static void ascii(int c)
    {
        char a=(char)c;
        System.out.println("The ASCII of "+c+" is "+a);
    }
}
