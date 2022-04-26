// WAP to find all the numbers and sum of all integers greater than 100 less than
//200 that are divisible by 7

public class P6 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=100;i<200;i++)
        {
            if(i%7==0)
            {
                System.out.print(" "+i);
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("sum="+sum);
    }

}
