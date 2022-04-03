import java.util.Arrays;
class test
{
    public int a;
}

public class PassingInFunction {
    public static void main(String[] args) {

        test tt=new test();
        tt.a=50;
        chg(tt);
        System.out.println(tt.a);

//       int[] num={1,2,3,4,5};
//       String[] str={"a","b"};
//
//       chage(num);
//       changestr(str);
//
//        System.out.println(Arrays.toString(num));
//          // the value at index 0 will be change by fucntion
//        System.out.println(Arrays.toString(str));


        // in java there only call by value and when we pass an object's reference
        // its going to take copy of that reference which is going to point to the same object
        // look at test class


    }
    static void changestr(String[] st)
    {
        st[0]="AMAN";
    }

    static void chage(int[] arr)
    {

        arr[0]=89;

    }

    static void chg(test t1)
    {
        t1.a=20;
    }


}
