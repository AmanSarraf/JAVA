public class P2 {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int j = 1; j <= 20 - 2 * i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("*");
        }
    }

    }

