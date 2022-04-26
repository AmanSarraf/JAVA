//Program7: Write a program in java to read 10 floating point numbers in an array and
//display the numbers in reverse order

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        float[] arr=new float[10];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 10 floating no.");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextFloat();
        }
        System.out.println("Entered number is ");
        for(int i= (arr.length)-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
