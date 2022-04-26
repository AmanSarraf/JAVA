//Program6: Create a class BOX which has default constructor and parameterized
//        constructor to initialize the values. Calculate the volume of BOX. Implement the use of
//        “this” reference in this program.


public class P6 {
    int l,b,h;
    P6()
    {
        l=-1;
        b=-1;
        h=-1;
    }
    P6(int a,int b,int c)
    {
        this.l=a;
        this.b=b;
        this.h=c;
    }
    public void volume()
    {
        System.out.println("The volume is "+l*b*h);
    }

    public static void main(String[] args) {
        P6 obj=new P6(2,3,4);
        obj.volume();
    }

}
