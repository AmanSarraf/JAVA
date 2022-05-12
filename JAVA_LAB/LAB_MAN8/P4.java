import java.util.Scanner;

public class P4
{
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        System.out.print("Enter here a Sentence: ");
        String sentence = scn.nextLine();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                ++count;
        }

        System.out.println("Number of words: " + (count+1));
        scn.close();
    }
}