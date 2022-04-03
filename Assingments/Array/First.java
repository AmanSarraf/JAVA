import java.util.Arrays;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        //Syntax
        // datatype[] variable_name=new datatype[size];
        //****its important to mention size
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }

        /*
         ways to print array
        1.
                for(int i=0;i<arr.length;i++)
                {
                    System.out.print(arr[i]);

                }
        // lets look at enhanced for
                for(int i:arr)
                    System.out.print(i+" ");


            }
        */

        ////Lets look at to string method
        System.out.print(Arrays.toString(arr)); //will print the array in formatted manner




    }

}