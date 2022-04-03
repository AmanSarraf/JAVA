public class Bs {
    public static void main(String[] args) {

        int[] arr={1,5,7,8,3,9,11,34,56,21};
        int target =456;

        System.out.println(search(arr,target,0,arr.length-1));



    }
    static int search(int[] arr , int target , int start , int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(target<arr[mid])
        {
            return search(arr,target,start,mid-1);

        }
         return search(arr,target,mid+1,end);
    }
}
