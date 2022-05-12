//Program5: An array is declared with 5 elements. Then the code tries to access the 6th
//element of the array which throws an exception. Write the program for this


public class P5 {
    public static void main(String[] args) {
        int[] array=new int[5];
        try
        {
            int k=array[6];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
    }
}
