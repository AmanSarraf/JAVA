import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {

//        declaration
        int arr[][]=new int[3][3];

//        or declaration and initiaisaton
        int arr2[][]={{1,2,3},{4},{7,8,9,10}};

        // imagin it as array of arrays
         // arr2[1]===>>{1,2,3}
        // arr2[1][0]===>>{1}
        // also declaring column sixe is not important only matter no. of rows
         // as array can be sometihing like { {1,2,3,} ,{4}, {6,4,3,5,6,}, {3,4} }
        //int arr[][]=new int[3][];  will not give error as individuals can have diffent size

       for(int row=0;row<arr2.length;row++)
       {
           for(int col=0;col<arr2[row].length;col++)
           {
              System.out.print(arr2[row][col]+" ");
           }
           System.out.println();
       }


       //Some other ways to print arr2
        //Enhanced For loop

        for (int[] ints : arr2) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }


        //use to string method to print beautifully

        for(int row=0;row<arr2.length;row++)
        {
            for(int col=0;col<arr2[row].length;row++)
            {
                System.out.println(Arrays.toString(arr2[row]));
            }
            System.out.println();
        }









    }
}
