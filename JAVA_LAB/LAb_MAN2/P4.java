import java.util.Scanner;

//Program4: WAP to find out the ASCII value of given character.
public class P4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch= scan.next().charAt(0);

        ascii(ch);

    }
    static void ascii(char c)
    {
        int a=(int)c;
        System.out.println("The ASCII of "+c+" is "+a);
    }
}
