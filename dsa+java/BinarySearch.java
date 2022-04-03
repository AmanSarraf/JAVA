import java.util.Scanner;

public class BinarySearch {
    static void sort(int[] a)
    {
        int temp;
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
    }

    static void bSearch(int[] a , int key)
    {
        sort(a);
        int l=0;
        int h=a.length-1;
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(key==a[mid])
                System.out.println("found");
            if(key<a[mid])
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        if(l>h)
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc = new Scanner(System.in);
            //int i;
            for (int j = 0; j < arr.length; j++){
                arr[j] = sc.nextInt();


}
        System.out.println("the entered array is ");
        for (int i = 0; i < arr.length; i++) System.out.println(" " + arr[i]);

        sort(arr);

        System.out.println("Sorted array is  ");
        for (int i = 0; i < arr.length; i++) System.out.println(" " + arr[i]);

        System.out.println("Enter an element to search in array");
        int p=sc.nextInt();
        bSearch(arr,p);






    }
}
