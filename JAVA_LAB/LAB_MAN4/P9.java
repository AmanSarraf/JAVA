//Program9: Create a java class which has method to find out the factorials of numbers from
//1 to 10 using recursion.

public class P9 {

    public static int fact(int num)
    {
        if(num==0)
        {
            return 1;

        }
        else
            return num*fact(num-1);
    }

    public static void main(String[] args) {

        for(int i=1;i<=10;i++)
        {
            System.out.println(fact(i));

        }


    }
}
