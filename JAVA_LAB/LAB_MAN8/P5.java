import java.util.Scanner;

public class P5
{
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String name = scn.nextLine();
        System.out.print("Your Initials are: ");
        System.out.print(name.charAt(0));
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ')
                System.out.print(name.charAt(++i));
        }
        System.out.println();
        scn.close();
    }
}