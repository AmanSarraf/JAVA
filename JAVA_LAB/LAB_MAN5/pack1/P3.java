package pack1;

class A
{
    int num1=10;  //public in its own package
    public int num2=20;
    private int num3=30;
    protected int num4=40;
    public void show()
    {
        System.out.println("num1= "+num1);
        System.out.println("num2= "+num2);
        System.out.println("num3= "+num3);
        System.out.println("num4= "+num4);
    }
    private void add()
    {
        System.out.println(" in A add is "+ (num1+num2+num3+num4));  // can't access private member outside this class
    }
}


class B extends A
{
    private int num5=50;

    public void add()
    {
        System.out.println("in B add is "+ (num1+num2+num4+num5));   // num 3 has no Access here
    }



}
public class P3 {



    public void test()
    {
        System.out.println("this is a public static method in public class p3 of package pack1");
    }


    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.show();
        obj2.show();
        obj2.add();
//        obj1.add();     no access outside class A

    }



}
