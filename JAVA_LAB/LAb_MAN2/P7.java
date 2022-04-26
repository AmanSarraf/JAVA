import java.util.Scanner;

//Program7: Write a Program in java to read the 5 integers and sort them in ascending
//order.
public class P7 {
    public static void main(String[] args) {
        int arr[]=new int[5];

        System.out.println("Enter 5 numbers");
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]= scan.nextInt();

        }
        System.out.println("Entered elements");
        for(int i=0;i<5;i++)
        {
            System.out.print(" "+arr[i]);

        }
        sort(arr);


        System.out.println("Sorted elements");
        for(int i=0;i<5;i++)
        {
            System.out.print(" "+arr[i]);

        }





    }
    static void sort(int[] a)
    {
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        System.out.println(" Sort Successful");

    }



}
