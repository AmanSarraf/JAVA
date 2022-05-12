import java.util.Scanner;

public class P6
{
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = scn.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = scn.nextLine();

        if (isAnagram(str1, str2))
            System.out.println("Strings are Anagram");
        else
            System.out.println("Strings are not Anagram");
        scn.close();
    }

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] occ = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            if (isAplha(s1.charAt(i)))
                ++occ[s1.charAt(i) - 'a'];
        }
        for (int i = 0; i < s2.length(); i++) {
            if (isAplha(s2.charAt(i)))
                --occ[s2.charAt(i) - 'a'];
        }

        for (int i : occ) {
            if (i != 0)
                return false;
        }

        return true;
    }

    public static boolean isAplha(char c) {
        return c >= 'a' && c <= 'z';
    }
}