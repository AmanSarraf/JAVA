/*
Write a method named numUnique that accepts three integers as parameters
        and that returns the number of unique integers among the three. For example, the
        call numUnique(18, 3, 4) should return 3 because the parameters have 3 different values.
        By contrast, the call numUnique(6, 7, 6)would return 2 because there are only 2 unique
        numbers among the three parameters: 6 and 7.
*/


public class P3 {


    public static void numUnique(int a,int b,int c)
    {
        int count=0;
        if(a!=b)
        {
            count++;
        }if(a!=c)
        {
            count++;
        }
         if(b!=c)
        {
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        numUnique(1,3,3);
    }
}
