// WAP that uses interface for the implementation of fixed-size and dynamic-size
//stacks (for dynamic stack size should be redefine as per the number of elements).

interface Stack
{
   void push(int item);
   void pop();
   void peek();

}
class FixedStack implements Stack
{
    private int[] stk;
    private int tos;
    FixedStack(){}

    FixedStack(int size)
    {
         tos=-1;stk=new int[size];
    }


    @Override
    public void push(int item) {
        if(tos==stk.length-1)
        {
            System.out.println("Overflow");
        }
        else
            stk[++tos]=item;


    }

    @Override
    public void pop() {

        if(tos<0)
        {
            System.out.println("UnderFlow, Can't POP");
        }
        else
        {
            stk[tos]=stk[tos--];
        }

    }

    @Override
    public void peek() {
        if(tos<0)
        {
            System.out.println("UnderFlow, Can't POP");
        }
        else
        {
            System.out.println("value at top of the Dynamic stack is "+stk[tos]);
        }


    }
}
class DynamicStack implements Stack
{
    private int tos;
    private int[] stk;
    DynamicStack(){}

    DynamicStack(int size)
    {
        tos=-1;
        stk=new int[size];
    }

    @Override
    public void push(int item) {

        if(tos==stk.length-1)
        {
            System.out.println("Overflow.....increasing stack length");
            int[] newStk=new int[(stk.length)*2];
            for(int i=0;i< stk.length;i++)
            {
                newStk[i]=stk[i];
            }
            stk=newStk; //here now stk is referencing to newStk
            stk[++tos]=item;
        }
        else
        {
            stk[++tos]=item;

        }

    }

    @Override
    public void pop() {
        if(tos<0)
        {
            System.out.println("UnderFlow, Can't POP");
        }
        else
        {
            stk[tos]=stk[tos--];
        }

    }

    @Override
    public void peek() {
        if(tos<0)
        {
            System.out.println("UnderFlow, Can't POP");
        }
        else
        {
            System.out.println("value at top of the stack is "+stk[tos]);
        }

    }
}



public class P2 {

    public static void main(String[] args) {
        FixedStack f1=new FixedStack(5);
        f1.push(1);
        f1.push(2);
        f1.push(3);
        f1.push(4);
        f1.push(5);
        //f1.peek();
        f1.pop();
        f1.pop();
        f1.pop();
        f1.peek();
        DynamicStack d1=new DynamicStack(3);
        d1.push(1);
        d1.push(2);
        d1.push(3);
        d1.push(4);
        d1.push(5);
        d1.peek();
    }







}
