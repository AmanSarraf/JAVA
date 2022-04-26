
//Program2: WAP to find the distance travel by light. Consider the speed of light as 18600
//miles/ second and number of days=1000.

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        System.out.println("Entered the no .of days ");
        Scanner scan =new Scanner(System.in);

        int days=scan.nextInt();

        distance(days);

    }
    static void distance(int d)
    {
        int sol=18600;
        long sec=d*86400;
        long dist=sol*sec;
        System.out.println("Distance travelled is" + dist+" miles");
    }
}
