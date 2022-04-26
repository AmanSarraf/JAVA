/*
program8: WAP to have the following output:
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0

0 0 0 0 0
0 1 2 3 4
0 2 4 6 8
0 3 6 9 12



0 0 0 0 0
0 2 4 6 8
0 4 8 12 16
0 6 12 18 24





*/

public class P8 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(" 0 ");
            }
            System.out.println();
        }
        System.out.println();
        //next pattern

        for(int i=0;i<4;i++)
        {

            for(int j=0;j<4;j++)
            {
                System.out.print(" "+i*(j));
            }
            System.out.println();
        }
        System.out.println();


        //next pattern

        for(int i=0;i<4;i++)
        {

            for(int j=0;j<4;j++)
            {
                System.out.print(" "+i*(j*2));
            }
            System.out.println();
        }



    }
}
