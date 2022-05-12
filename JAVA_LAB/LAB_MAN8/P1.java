import java.util.Scanner;

public class P1
{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String str = scn.nextLine();
            String rev = reverse(str);

            System.out.println("Is pelindrome : " + str.equals(rev));
        }
    }

    static String reverse(String str) {
        // We can also use built in StringBuilders reverse() method for this
        // String rev = new StringBuilder(str).reverse().toString();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}