import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {

        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array element");
        for(int i=0;i<5;i++)
        {
             arr[i]=sc.nextInt();

        }
//        System.out.println("Array elemts entered are");
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(" "+arr[i]);
//
//        }

        //sorting
         int temp;
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }



        }

        System.out.println("Array after sorting is");
        for(int p=0;p<5;p++)
        {
            System.out.println(" "+arr[p]);

        }



    }
}
