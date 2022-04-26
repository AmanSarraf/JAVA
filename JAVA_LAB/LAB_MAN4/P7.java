//Program7: Create a class named “Addition” having the following overload methods.
//        Int add(int x, int y)
//        Double add(double x, double y)
//        String add(String x, String y)
//        Int add([] x)
//

class Addition
{
    int add(int x,int y){
        return (x+y);
    }
    double add(double x,double y)
    {
      return(x+y);
    }
    String add(String x,String y)
    {
      return (x+y);
    }
    int add(int[] x)
    {
        int sum=0;
        for(int i=0;i<x.length;i++)
        {
          sum=sum+x[i];
        }
        return sum;
    }
}



public class P7 {
    public static void main(String[] args) {
        Addition a1=new Addition();
        a1.add(1,2);
        a1.add(33.4,66.4);
        a1.add("aman","sarraf");
        int[] arr={1,2,3,4,5,6,7,8,9};
        a1.add(arr);
        System.out.println(a1.add(1,2));
        System.out.println(a1.add("aman","sarraf"));
        System.out.println(a1.add(33.4,66.4));
        System.out.println(a1.add(arr));

    }
}
