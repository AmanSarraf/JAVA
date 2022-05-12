import java.util.Scanner;
import java.util.function.Function;

public class P2
{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String str = scn.nextLine();
            System.out.print("Enter character to remove: ");
            char toRemove = scn.next().charAt(0);

            String res = remove(str, toRemove);

            System.out.println("After removing : " + res);
        }
    }

    static String remove(String str, char r) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != r)
                res += str.charAt(i);
        }
        return res;
    }
}